package app.morphe.engine

import java.net.HttpURLConnection
import java.net.URL
import java.util.Properties
import java.util.logging.Logger

object UpdateChecker {
    private val logger = Logger.getLogger(this::class.java.name)

    fun check(): String? {
        try {
            val currentVersion = javaClass.getResourceAsStream("/app/morphe/cli/version.properties")
                ?.use { stream ->
                    Properties().apply { load(stream) }.getProperty("version")
                }
                ?: return null

            val connection = URL("https://api.github.com/repos/MorpheApp/morphe-cli/releases/latest")
                .openConnection() as HttpURLConnection

            connection.connectTimeout = 3000
            connection.readTimeout = 3000
            connection.setRequestProperty("Accept", "application/vnd.github.v3+json")

            val response = connection.inputStream.bufferedReader().use { it.readText() }
            connection.disconnect()

            val latestVersion = Regex(""""tag_name"\s*:\s*"v?([^"]+)"""").find(response)
                ?.groupValues?.get(1) ?: return null

            if (isNewerVersion(currentVersion, latestVersion)) {
                return "Update available: v$latestVersion (current: v$currentVersion). Download from https://github.com/MorpheApp/morphe-cli/releases/latest"
            }
        } catch (e: Exception) {
            logger.fine("Update check failed: ${e.message}")
        }
        return null
    }

    private fun isNewerVersion(current: String, latest: String): Boolean {
        val currentParts = current.split(".").mapNotNull { it.toIntOrNull() }
        val latestParts = latest.split(".").mapNotNull { it.toIntOrNull() }

        val length = maxOf(currentParts.size, latestParts.size)
        for (i in 0 until length) {
            val c = currentParts.getOrNull(i) ?: 0
            val l = latestParts.getOrNull(i) ?: 0
            if (l > c) return true
            if (l < c) return false
        }
        return false
    }
}

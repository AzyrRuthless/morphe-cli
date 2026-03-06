# [1.2.0-dev.1](https://github.com/AzyrRuthless/morphe-cli/compare/v1.1.1...v1.2.0-dev.1) (2026-03-06)


### Bug Fixes

* Allow enabling/disabling patches using case insensitive patch names ([#48](https://github.com/AzyrRuthless/morphe-cli/issues/48)) ([4c92751](https://github.com/AzyrRuthless/morphe-cli/commit/4c92751e1a698452c9220814ed9245a5e1a185ca))
* Do not log patch name more than once if disabled ([#49](https://github.com/AzyrRuthless/morphe-cli/issues/49)) ([f88586b](https://github.com/AzyrRuthless/morphe-cli/commit/f88586b620ea31cb3114983a7f7d570f5300a310))


### Features

* Add `--continue-on-error` argument, return non zero exit code if patching fails ([#47](https://github.com/AzyrRuthless/morphe-cli/issues/47)) ([22d72c9](https://github.com/AzyrRuthless/morphe-cli/commit/22d72c909b8cca113390ba2d4cff9227271a1b69))
* Add `--options-file` json patch/option configuration ([#53](https://github.com/AzyrRuthless/morphe-cli/issues/53)) ([5ca8afc](https://github.com/AzyrRuthless/morphe-cli/commit/5ca8afc65af1c3cb10c4eb69783178bc7d7afbd8))
* Add `--striplibs` argument to strip unwanted architectures ([#46](https://github.com/AzyrRuthless/morphe-cli/issues/46)) ([cd902a6](https://github.com/AzyrRuthless/morphe-cli/commit/cd902a621f70fb1d81c89a5a7999459a0aa51c03))
* Support patching APKM bundles ([#40](https://github.com/AzyrRuthless/morphe-cli/issues/40)) ([daffad5](https://github.com/AzyrRuthless/morphe-cli/commit/daffad531c6f0b61c1f07be053306d101d46f7c3))

## [1.1.1](https://github.com/AzyrRuthless/morphe-cli/compare/v1.1.0...v1.1.1) (2026-02-06)


### Bug Fixes

* **cli:** skip zipalign when unsigned flag is set ([68259ea](https://github.com/AzyrRuthless/morphe-cli/commit/68259ea1116bcaa4fa5213144a8f59ebe59e595b))

## [1.1.1-dev.1](https://github.com/AzyrRuthless/morphe-cli/compare/v1.1.0...v1.1.1-dev.1) (2026-02-06)


### Bug Fixes

* **cli:** skip zipalign when unsigned flag is set ([68259ea](https://github.com/AzyrRuthless/morphe-cli/commit/68259ea1116bcaa4fa5213144a8f59ebe59e595b))

# [1.1.0](https://github.com/AzyrRuthless/morphe-cli/compare/v1.0.0...v1.1.0) (2026-02-06)


### Features

* Add ability to write patching results to JSON file ([#25](https://github.com/AzyrRuthless/morphe-cli/issues/25)) ([ed0d1ef](https://github.com/AzyrRuthless/morphe-cli/commit/ed0d1ef4150411c8027156bad8338194480b4e88))
* Update to Morphe patcher / library 1.1.0 ([2445b24](https://github.com/AzyrRuthless/morphe-cli/commit/2445b24656228dd5c487e18fe6e441d5b8b6204b))
* Update to Morphe patcher 1.1.1 ([8fa5a83](https://github.com/AzyrRuthless/morphe-cli/commit/8fa5a83d18fa35668d1d07a852bda62a452c0ad7))

# [1.1.0-dev.1](https://github.com/AzyrRuthless/morphe-cli/compare/v1.0.0...v1.1.0-dev.1) (2026-02-06)


### Features

* Add ability to write patching results to JSON file ([#25](https://github.com/AzyrRuthless/morphe-cli/issues/25)) ([ed0d1ef](https://github.com/AzyrRuthless/morphe-cli/commit/ed0d1ef4150411c8027156bad8338194480b4e88))
* Update to Morphe patcher / library 1.1.0 ([2445b24](https://github.com/AzyrRuthless/morphe-cli/commit/2445b24656228dd5c487e18fe6e441d5b8b6204b))
* Update to Morphe patcher 1.1.1 ([8fa5a83](https://github.com/AzyrRuthless/morphe-cli/commit/8fa5a83d18fa35668d1d07a852bda62a452c0ad7))

# 1.0.0-dev.1 (2026-01-11)


### Bug Fixes

* Migrate to new package, use maven patcher dependency ([0b50811](https://github.com/AzyrRuthless/morphe-cli/commit/0b50811a5a2a0a574538b2fbffe027c04613db6c))
* Use patcher / library 1.0.1 release ([0ca02e9](https://github.com/AzyrRuthless/morphe-cli/commit/0ca02e920b9e3189ac2b3a18587f0fb9efd0de4e))
* Use repo library release ([0e4fae1](https://github.com/AzyrRuthless/morphe-cli/commit/0e4fae1b24bb21baa5004126df364b736d84270b))


### Features

* add command option `unsigned` ([#20](https://github.com/AzyrRuthless/morphe-cli/issues/20)) ([4505091](https://github.com/AzyrRuthless/morphe-cli/commit/4505091624b854706b39656bae642e5dc1132dcd))
* Initial release ([874ecbc](https://github.com/AzyrRuthless/morphe-cli/commit/874ecbce34d6499882f7a5cf648bd828c823935a))

# [1.1.0](https://github.com/MorpheApp/morphe-cli/compare/v1.0.0...v1.1.0) (2026-01-10)


### Bug Fixes

* Use patcher / library 1.0.1 release ([0ca02e9](https://github.com/MorpheApp/morphe-cli/commit/0ca02e920b9e3189ac2b3a18587f0fb9efd0de4e))


### Features

* add command option `unsigned` ([#20](https://github.com/MorpheApp/morphe-cli/issues/20)) ([4505091](https://github.com/MorpheApp/morphe-cli/commit/4505091624b854706b39656bae642e5dc1132dcd))

# [1.1.0-dev.2](https://github.com/MorpheApp/morphe-cli/compare/v1.1.0-dev.1...v1.1.0-dev.2) (2026-01-10)


### Bug Fixes

* Use patcher / library 1.0.1 release ([0ca02e9](https://github.com/MorpheApp/morphe-cli/commit/0ca02e920b9e3189ac2b3a18587f0fb9efd0de4e))

# [1.1.0-dev.1](https://github.com/MorpheApp/morphe-cli/compare/v1.0.0...v1.1.0-dev.1) (2026-01-02)


### Features

* add command option `unsigned` ([#20](https://github.com/MorpheApp/morphe-cli/issues/20)) ([4505091](https://github.com/MorpheApp/morphe-cli/commit/4505091624b854706b39656bae642e5dc1132dcd))

# 1.0.0 (2025-12-08)


### Bug Fixes

* Migrate to new package, use maven patcher dependency ([0b50811](https://github.com/MorpheApp/morphe-cli/commit/0b50811a5a2a0a574538b2fbffe027c04613db6c))
* Use repo library release ([0e4fae1](https://github.com/MorpheApp/morphe-cli/commit/0e4fae1b24bb21baa5004126df364b736d84270b))


### Features

* Initial release ([874ecbc](https://github.com/MorpheApp/morphe-cli/commit/874ecbce34d6499882f7a5cf648bd828c823935a))

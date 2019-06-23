# VaultSample

A simple java project using Spring Vault to demonstrate secret storage in Vault with Consul backend.

## Components

* Vault
* Consul
* Spring Vault
* Docker

### Instructions

The Config folder contains the docker compose file that boots up Vault and Consul. The configs for these are in their respective folders. 
Vault is running in 'dev' mode. 

A simple gradle Java project then uses the vault endpoints to use the deployed vault to store/access secrets.

### References
- [Vault][vault]
- [Consul][consul]
- [Spring Vault][spring]

[consul]: https://www.consul.io/docs/commands/index.html
[spring]: http://docs.spring.io/spring-vault/docs/1.0.2.RELEASE/reference/html/#get-started:first-steps:vault
[vault]: https://www.vaultproject.io/docs/configuration/index.html

~~Tilder Works~~

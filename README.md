# SWAMEDIA - PRETEST - BACKEND ENGINEER

## Description
Simple project pretest backend engineer using Java Spring Boot and JWT Authentication

## Prerequisites
- Java JDK 11
- Database PostgreSql
- Maven

## Instalation
Step for installation:
```sh
# Clone this project from gitlab
git clone git@github.com:saptarga/game-api.git

# Clears the target directory and builds the project
mvn clean install
```
## Configuration
Step for configuration:

- Create new database in postgresql with database name `swamedia_pretest`.
- Set database name, user, and password in `application.properties`.
- For db migration and seeding data will be created automatically when application running for first time.

## Run Project
You can start this project using
```sh
mvn clean spring-boot:run
```
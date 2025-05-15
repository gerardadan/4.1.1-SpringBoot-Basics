# Readme for Exercise: Spring & Maven – HelloWorld API

## 📄 Description

This exercise introduces the **Spring Boot** framework using **Maven** as a build tool. You will create a simple REST API that returns personalized greetings depending on HTTP request parameters. It serves as a first contact with building Spring applications, structuring controllers, and handling HTTP GET requests using both `@RequestParam` and `@PathVariable`.

---

## 🚀 Exercise

### Exercise 1: HelloWorld API with Spring Boot and Maven

Build a basic Spring Boot application using Maven that exposes two endpoints responding with a greeting message based on input.

#### 🧩 Functionality:

* Use [Spring Initializr](https://start.spring.io/) to generate a new project with:

  * **Group**: `cat.itacademy.s04.t01.n01`
  * **Artifact / Name / Description**: `S04T01N01`
  * **Package name**: `cat.itacademy.s04.t01.n01`
  * **Dependencies**: Spring Boot DevTools, Spring Web
  * **Packaging**: JAR
  * **Java Version**: 11 or higher

* Import the project into Eclipse via **File > Import > Existing Maven Project**

* Configure `server.port=9000` in `application.properties`

* Inside the main package, create a subpackage `controller` and implement the class `HelloWorldController` with two methods:

  1. `saluda`:

     * Type: `GET`
     * Parameter: `@RequestParam` (default value: `UNKNOWN`)
     * URLs:

       * `http://localhost:9000/HelloWorld`
       * `http://localhost:9000/HelloWorld?nom=El meu nom`

  2. `saluda2`:

     * Type: `GET`
     * Parameter: `@PathVariable` (optional)
     * URLs:

       * `http://localhost:9000/HelloWorld2`
       * `http://localhost:9000/HelloWorld2/myname`

* Both methods must return:
  `"Hola, <nom>. Estàs executant un projecte Maven"`

---

## 💻 Technologies Used

* Java 11+
* Spring Boot
* Maven
* Spring Web
* Spring Boot DevTools

## 📋 Requirements

* JDK 11 or higher
* Maven
* Eclipse IDE (or any IDE with Maven and Spring support)
* Access to [https://start.spring.io](https://start.spring.io)

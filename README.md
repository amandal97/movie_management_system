# movie_management_system

The movie management system consists of three microservices that are involved in retrieving different data regarding movies. All 3 of the microservices communication with each other using "Service Discovery".

1. movie-rating-service - This service provides data regarding the rating of each movie
2. movie-info-service - This service provides detailed description/info regarding each movie
3. movie-catalog-service - This service puts together all the data retrieved from the above 2 services and puts them all together

**What are Microservices?**
Microservices (or microservices architecture) are a cloud native architectural approach in which a single application is composed of many loosely coupled and independently deployable smaller components, or services.

**Tech Stack Used:**
1. Spring Boot - It is a framework that is built on top of the conventional Spring Framework. It provides all the features of Spring Framework and yet it is easier to use. Spring Boot is a microservice-based framework and making a production-ready application in very less time. Spring Boot helps developers create applications that just run. Specifically, it lets one create standalone applications that run on their own, without relying on an external web server, by embedding a web server such as Tomcat or Netty into your app during the initialization process.

2. Spring Cloud - Spring Cloud provides tools for developers to build some of the common patterns in distributed systems quickly. Spring Cloud provides Eureka Server/Client which enables us to communicate between different microservices using a concept called Service Discovery

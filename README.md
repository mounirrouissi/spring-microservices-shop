# Microservice Architecture Project

This project demonstrates a microservice architecture using Spring Boot. The architecture consists of the following components:

- **Config Server**: Manages the configuration for all microservices.
- **Customer Service**: Manages customer data.
- **Eureka Server**: Service registry for service discovery.
- **Gateway**: API Gateway for routing requests.
- **Inventory Service**: Manages inventory data.
- **Notification Service**: Handles notifications.
- **Order Service**: Manages order data.
- **Payment Service**: Handles payments.

## Prerequisites

- Java 19 
- Maven 3.6 or higher
- Docker and Docker Compose

## Project Structure

```
microservice-architecture/
├── config-server/
├── customer/
├── eureka-server/
├── gateway/
├── inventory/
├── notification/
├── order/
├── payment/
└── docker-compose.yml
```

## Services Description

### 1. Config Server

Manages the configuration for all microservices from a centralized location.
gets all configurations from this github repo :https://github.com/mounirrouissi/config-server

**Run Config Server**:
```sh
cd config-server
mvn spring-boot:run
```

### 2. Eureka Server

Service registry for service discovery.

<img width="959" alt="image" src="https://github.com/mounirrouissi/spring-microservices-shop/assets/14219671/4fb4c091-9c61-41a3-a300-d661e52c1d00">


**Run Eureka Server**:
```sh
cd eureka-server
mvn spring-boot:run
```

### 3. Gateway

API Gateway for routing requests to appropriate microservices.

**Run Gateway**:
```sh
cd gateway
mvn spring-boot:run
```

### 4. Customer Service

Manages customer data.

**Run Customer Service**:
```sh
cd customer
mvn spring-boot:run
```

### 5. Inventory Service

Manages inventory data.

**Run Inventory Service**:
```sh
cd inventory
mvn spring-boot:run
```

### 6. Notification Service

Handles notifications.

**Run Notification Service**:
```sh
cd notification
mvn spring-boot:run
```

### 7. Order Service

Manages order data.

**Run Order Service**:
```sh
cd order
mvn spring-boot:run
```

### 8. Payment Service

Handles payments.

**Run Payment Service**:
```sh
cd payment
mvn spring-boot:run
```

## Docker Compose

The `docker-compose.yml` file is used to run all the microservices in Docker containers. Ensure Docker and Docker Compose are installed on your system.

**Run all utils services like zipkin and dbs**:
```sh
docker-compose up 
```


## Configuration

All configuration files are managed by the Config Server. Update the `application-dev.properites` files in each microservice to point to the Config Server for configuration.

## Running Tests

Run unit tests for each microservice using Maven:

```sh
cd <microservice>
mvn test
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

[Rouissi Mounir] - [rouissimounir@outlook.com]

---

This README file should provide a comprehensive guide for setting up and running the microservice architecture project using Spring Boot and Docker Compose. Each microservice can be individually developed, tested, and deployed, making it a robust and scalable architecture.

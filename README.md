# Microservices Architecture Project

![Java](https://img.shields.io/badge/Java-21%2B-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-%2B-green)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-%2B-brightgreen)
![Docker](https://img.shields.io/badge/Docker-✓-important)

A scalable e-commerce platform built with microservices architecture.

## Services Overview

| Service              | Description                          | Port  |
|----------------------|--------------------------------------|-------|
| `config-service`     | Centralized configuration server    | 8888  |
| `discovery-service`  | Service registry (Eureka)           | 8761  |
| `gateway-service`    | API Gateway (Spring Cloud Gateway)  | 8080  |
| `customer-service`   | Handles customer data               | 8081  |
| `product-service`    | Manages product catalog             | 8082  |

##  Technologies

- Core: 
  - Java 21, Spring Boot , Spring Cloud 
- Communication: 
  - OpenFeign (REST), Spring Cloud Gateway (Routing)
- Infrastructure: 
  - Eureka (Service Discovery), Config Server
- Database: 
  - MySQL (Relational), MongoDB (NoSQL) - *per service*
- DevOps: 
  - Docker, Docker Compose

##  Quick Start

### Prerequisites
- JDK 21+
- Docker 20+
- Maven 3.9+

### Installation

# Clone the project
git clone https://github.com/your-repo/microservices-project.git

# Build all services
mvn clean install

# Start infrastructure (Eureka + Config)
docker-compose -f docker-compose-infra.yml up -d

# Run services (in order)
1. config-service
2. discovery-service
3. gateway-service
4. Other services...

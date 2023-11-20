# ElectroKart Ecommerce Application

![ElectroKart Logo](/path/to/logo.png) <!-- Add your logo if you have one -->

## Overview

ElectroKart is a fully functional Ecommerce Application developed using Java, Spring Boot, and Microservices architecture. It consists of multiple services to handle various aspects of the application, such as order management, payment processing, product catalog, and more.

### Microservices

1. **OrderService:** Manages orders and order-related functionality.
2. **PaymentService:** Handles payment processing and integrates with Spring Security for secure transactions.
3. **ProductService:** Manages the product catalog and related features.
4. **Cloudgateway:** Acts as the gateway for routing requests to the appropriate microservices.
5. **ConfigServer:** Manages configuration properties for the entire application.
6. **ServiceRegistry:** Eureka Server for service discovery within the microservices architecture.

## Features

- **Database:** Utilizes MySQL for data storage.
- **Security:** Implements user authentication and authorization using Spring Security with Okta as the security provider, employing OAuth2 for enhanced security.
- **Circuit Breaker:** Integrates a Circuit Breaker mechanism to limit excessive API requests, ensuring system reliability.
- **Testing:** Conducted extensive unit testing using Junit5 to validate the application’s functionality.
- **Containerization:** Docker images created for all microservices, enabling easy deployment and scalability.
- **Orchestration:** Deployed on a Kubernetes Cluster for enhanced productivity and scalability.

## Tech Stack

- Spring Boot
- Microservices
- Spring Boot JPA
- REST APIs
- Spring Security
- Eureka Server (Service Registry)
- MySQL Database
- Docker
- Kubernetes
- Junit5
- Mockwire

## Getting Started

To run ElectroKart locally or in your development environment, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/electrokart.git
   cd electrokart
   ```

2. Build and run individual microservices using Maven or your preferred build tool:

   ```bash
   cd order-service
   mvn spring-boot:run
   ```

   Repeat this step for each microservice.

3. Access the application through the gateway:

   ```bash
   cd cloud-gateway
   mvn spring-boot:run
   ```

   Open your browser and navigate to [http://localhost:8080](http://localhost:8080).

For more detailed instructions and configurations, refer to the documentation in each microservice's directory.

## Contributing

You can connect with me on LinkedIn [https://www.linkedin.com/in/aniruddha-kotal/](Aniruddha Kotal)


## Acknowledgments

- Thank you to the Spring Boot and Kubernetes communities for their fantastic tools and resources.

---

This README provides a high-level overview of your project. You may need to customize it based on your specific project structure and requirements. Add more detailed instructions, installation steps, and troubleshooting tips as needed.

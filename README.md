# Vehicle Service Management System

The Vehicle Service Management System is designed to manage vehicle service records efficiently. It includes functionalities for scheduling, maintaining, and tracking services for various vehicles. Users can create, update, retrieve, and delete information about vehicles, services, service types, and service providers.

## Overview

- **Vehicle Profile Management**: The system manages vehicle profiles, including the make, model, year, owner, and service history. It enables users to create, update, and delete vehicle profiles, with specific permissions in place to protect ownership details.
- **Service Record Management**: The system supports service records, allowing users to schedule, update, and delete services. Past and upcoming services for a vehicle can be viewed and managed efficiently.
- **Service Provider Management**: Service providers are managed within the system, allowing CRUD operations on service providers to control who can offer services. Users can also view all services offered by specific providers.
- **Service Type Management**: The system manages different types of services that can be offered by service providers. Users can create, update, retrieve, and delete service types.

## Technologies Used

- **Java**: Primary programming language.
- **Spring Boot**: Framework for building RESTful services.
- **MySQL**: Database for storing application data.
- **Hibernate ORM**: Object-Relational Mapping tool for simplifying database operations.

## Project Structure

The project is organized into the following packages:

### Models

- **Vehicle**: Represents a vehicle with fields such as `id`, `make`, `model`, `year`, `owner` (linked to a customer ID), and `serviceHistory`.
- **Customer**: Represents a customer with fields such as `id`, `name`, and `contactInfo`.
- **ServiceRecord**: Represents a service record for a vehicle with fields such as `id`, `vehicleId`, `serviceTypeId`, `dateOfService`, `detailsOfService`, and `serviceProviderId`.
- **ServiceProvider**: Represents a service provider with fields such as `id`, `name`, `serviceTypesOffered`, and `contactInfo`.
- **ServiceType**: Represents a type of service with fields such as `id`, `name`, and `description`.

### Repositories

- **VehicleRepository**: Repository for the `Vehicle` entity.
- **CustomerRepository**: Repository for the `Customer` entity.
- **ServiceRecordRepository**: Repository for the `ServiceRecord` entity.
- **ServiceProviderRepository**: Repository for the `ServiceProvider` entity.
- **ServiceTypeRepository**: Repository for the `ServiceType` entity.

### Services

- **VehicleService**: Manages business logic for vehicle-related operations.
- **CustomerService**: Manages business logic for customer-related operations.
- **ServiceRecordService**: Manages business logic for service record-related operations.
- **ServiceProviderService**: Manages business logic for service provider-related operations.
- **ServiceTypeService**: Manages business logic for service type-related operations.

### Controllers

- **VehicleController**: Handles HTTP requests for vehicle management.
- **CustomerController**: Handles HTTP requests for customer management.
- **ServiceRecordController**: Handles HTTP requests for service record management.
- **ServiceProviderController**: Handles HTTP requests for service provider management.
- **ServiceTypeController**: Handles HTTP requests for service type management.

## API Endpoints

### CustomerController

- **Endpoints:**
    - **/customers**
        - `GET`: Retrieve all customers.
        - `POST`: Create a new customer.
    - **/customers/{id}**
        - `GET`: Retrieve a specific customer by ID.
        - `DELETE`: Delete a specific customer by ID.

### ServiceProviderController

- **Endpoints:**
    - **/service-providers**
        - `GET`: Retrieve all service providers.
        - `POST`: Create a new service provider.
    - **/service-providers/{id}**
        - `GET`: Retrieve a specific service provider by ID.
        - `DELETE`: Delete a specific service provider by ID.

### ServiceRecordController

- **Endpoints:**
    - **/service-records**
        - `GET`: Retrieve all service records.
        - `POST`: Create a new service record.
    - **/service-records/{id}**
        - `GET`: Retrieve a specific service record by ID.
        - `DELETE`: Delete a specific service record by ID.

### ServiceTypeController

- **Endpoints:**
    - **/service-types**
        - `GET`: Retrieve all service types.
        - `POST`: Create a new service type.
    - **/service-types/{id}**
        - `GET`: Retrieve a specific service type by ID.
        - `DELETE`: Delete a specific service type by ID.

### VehicleController

- **Endpoints:**
    - **/vehicles**
        - `GET`: Retrieve all vehicles.
        - `POST`: Create a new vehicle.
    - **/vehicles/{id}**
        - `GET`: Retrieve a specific vehicle by ID.
        - `DELETE`: Delete a specific vehicle by ID.


### Vehicle Management

#### Create Vehicle

- **Endpoint**: `POST /vehicles`
- **Description**: Creates a new vehicle.
- **Request Body**:

    ```json
    {
        "make": "Toyota",
        "model": "Corolla",
        "year": 2020,
        "owner": {
            "id": 1
        }
    }
    ```

#### Update Vehicle

- **Endpoint**: `PUT /vehicles/{id}`
- **Description**: Updates the details of an existing vehicle.
- **Request Body**:

    ```json
    {
        "make": "Toyota",
        "model": "Camry",
        "year": 2021
    }
    ```

#### Delete Vehicle

- **Endpoint**: `DELETE /vehicles/{id}`
- **Description**: Deletes a vehicle by ID.

### Customer Management

#### Create Customer

- **Endpoint**: `POST /customers`
- **Description**: Creates a new customer.
- **Request Body**:

    ```json
    {
        "name": "John Doe",
        "contactInfo": "johndoe@example.com"
    }
    ```

#### Update Customer

- **Endpoint**: `PUT /customers/{id}`
- **Description**: Updates the details of an existing customer.
- **Request Body**:

    ```json
    {
        "name": "John Doe",
        "contactInfo": "john.doe@example.com"
    }
    ```

#### Delete Customer

- **Endpoint**: `DELETE /customers/{id}`
- **Description**: Deletes a customer by ID.

### Service Record Management

#### Schedule Service

- **Endpoint**: `POST /vehicles/{id}/services`
- **Description**: Schedules a new service for a vehicle.
- **Request Body**:

    ```json
    {
        "serviceTypeId": 1,
        "dateOfService": "2022-12-01",
        "detailsOfService": "Oil change",
        "serviceProviderId": 1
    }
    ```

#### Update Service Record

- **Endpoint**: `PUT /services/{id}`
- **Description**: Updates the details of an existing service record.
- **Request Body**:

    ```json
    {
        "serviceTypeId": 2,
        "dateOfService": "2022-12-02",
        "detailsOfService": "Tire rotation",
        "serviceProviderId": 2
    }
    ```

#### Delete Service Record

- **Endpoint**: `DELETE /services/{id}`
- **Description**: Deletes a service record by ID.

### Service Provider Management

#### Create Service Provider

- **Endpoint**: `POST /providers`
- **Description**: Creates a new service provider.
- **Request Body**:

    ```json
    {
        "name": "John's Garage",
        "serviceTypesOffered": ["Oil change", "Tire rotation"],
        "contactInfo": "johnsgarage@example.com"
    }
    ```

#### Update Service Provider

- **Endpoint**: `PUT /providers/{id}`
- **Description**: Updates the details of an existing service provider.
- **Request Body**:

    ```json
    {
        "name": "John's Auto Shop",
        "serviceTypesOffered": ["Oil change", "Tire rotation", "Brake service"],
        "contactInfo": "johnsautoshop@example.com"
    }
    ```

#### Delete Service Provider

- **Endpoint**: `DELETE /providers/{id}`
- **Description**: Deletes a service provider by ID.

### Service Type Management

#### Create Service Type

- **Endpoint**: `POST /serviceTypes`
- **Description**: Creates a new service type.
- **Request Body**:

    ```json
    {
        "name": "Oil Change",
        "description": "Changing of vehicle's oil"
    }
    ```

#### Update Service Type

- **Endpoint**: `PUT /serviceTypes/{id}`
- **Description**: Updates the details of an existing service type.
- **Request Body**:

    ```json
    {
        "name": "Tire Rotation",
        "description": "Rotating of vehicle's tires"
    }
    ```

#### Delete Service Type

- **Endpoint**: `DELETE /serviceTypes/{id}`
- **Description**: Deletes a service type by ID.

## Setup

### Prerequisites

- **Java 8** or higher.
- **Maven**.
- **MySQL** database.

### Installation

1. Clone the repository:

    ```shell
    git clone https://github.com/yourusername/vehicleservicemanagement.git
    ```

2. Navigate to the project directory:

    ```shell
    cd vehicleservicemanagement
    ```

3. Build the project:

    ```shell
    mvn clean install
    ```

4. Configure your MySQL database connection properties in `application.properties`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/vehicleservice
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

5. Run the application:

    ```shell
    mvn spring-boot:run
    ```

## Project Team

- **Initial Design and Class Diagram**: Deepti
- **Models and Controllers**: Om Wagchavre and Yash
- **Exceptions and Controller Advice**: Ruthwik and Loukik
- **Services**:  Deepti, Loukik, Ruthwik, Loukik, Yash, Jash
- **Repositories**: Ruthwik
- **Database**: Yash and Jash

## Contribution

To contribute to this project:

1. Fork the repository.
2. Create a new branch for your changes.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Submit a pull request to the main branch of the original repository.

Before submitting a pull request, ensure that your code passes all tests and follows the project's coding standards.

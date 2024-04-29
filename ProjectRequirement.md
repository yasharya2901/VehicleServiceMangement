# Vehicle Service Management System

## Models
1. Vehicle
2. Customer
3. Service Record
4. Service Provider
5. Service Type

### Models Attributes
<table>
    <tr>
        <th>Model</th>
        <th>Attributes</th>
        <th>Data Type</th>
        <th>Cardinality</th>
    </tr>
    <tr>
        <td rowspan="5"  style="background-color: grey">Vehicle</td>
        <td>vehicle_id</td>
        <td>Long</td>
    </tr>
    <tr>
        <td>make</td>
        <td>String</td>
    </tr>
    <tr>
        <td>model</td>
        <td>String</td>
    </tr>
    <tr>
        <td>year</td>
        <td>int</td>
    </tr>
    <tr>
        <td>owner_id</td>
        <td>Long</td>
        <td>@ManyToOne </td>
    </tr>
    <tr>
        <td rowspan="4">Customer</td>
        <td>customer_id</td>
        <td>Long</td>
        <td></td>
    </tr>
    <tr>
        <td>name</td>
        <td>String</td>
    </tr>
    <tr>
        <td>vehicle_id</td>
        <td>String</td>
        <td>@OneToMany</td>
    </tr>
    <tr>
        <td>service_id</td>
        <td>String</td>
        <td>@OneToMany</td>
    </tr>
    <tr>
        <td rowspan="5"  style="background-color: grey">Service Record</td>
        <td>service_record_id</td>
        <td>Long</td>
        <td></td>
    </tr>
    <tr>
        <td>vehicle_id</td>
        <td>Long</td>
        <td>@ManyToOne</td>
    </tr>
    <tr>
        <td>service_type_id</td>
        <td>Long</td>
        <td>@ManyToMany</td>
    </tr>
    <tr>
        <td>date_of_service</td>
        <td>int</td>
    </tr>
    <tr>
        <td>service_provider_id</td>
        <td>Long</td>
        <td>@OneToMany</td>
    </tr>
    <tr>
        <td rowspan="4">Service Provider</td>
        <td>service_provider_id</td>
        <td>Long</td>
        <td></td>
    </tr>
    <tr>
        <td>service_provider_name</td>
        <td>String</td>
    </tr>
    <tr>
        <td>service_type_id</td>
        <td>Long</td>
        <td>@ManyToMany</td>
    </tr>
    <tr>
        <td>contact_number</td>
        <td>String</td>
    </tr>
    <tr>
        <td rowspan="3"  style="background-color: grey">Service Type</td>
        <td>service_type_id</td>
        <td>Long</td>
        <td></td>
    </tr>
    <tr>
        <td>service_type_name</td>
        <td>String</td>
    </tr>
    <tr>
        <td>service_provider_id</td>
        <td>Long</td>
        <td>@ManyToMany</td>
    </tr>


</table>

## Controllers
### Vehicle Controllers
    - Create Vehicle    | @PostMapping("/vehicles")
    - Update Vehicle    | @PostMapping("/vehicles")
    - Delete Vehicle    | @DeleteMapping("/vehicles/{id}")
    - Get Vehicle By Id | @GetMapping("/vehicles/{id}")
    - Get All Vehicles  | @GetMapping("/vehicles")

### Customer Controllers
    - Create Customer       | @PostMapping("/customers")
    - Update Customer       | @PostMapping("/customers")
    - Delete Customer       | @DeleteMapping("/customers/{id}")
    - Get Customer By Id    | @GetMapping("/customers/{id}")
    - Get All Customers     | @GetMapping("/customers")

### Service Record Controllers
    - Create Service Record     | @PostMapping("/service-records")
    - Update Service Record     | @PostMapping("/service-records")
    - Delete Service Record     | @DeleteMapping("/service-records/{id}")
    - Get Service Record By Id  | @GetMapping("/service-records/{id}")
    - Get All Service Records   | @GetMapping("/service-records")

### Service Provider Controllers
    - Create Service Provider   | @PostMapping("/service-providers")
    - Update Service Provider   | @PostMapping("/service-providers")
    - Delete Service Provider   | @DeleteMapping("/service-providers/{id}")
    - Get Service Provider      | @GetMapping("/service-providers/{id}")
    - Get All Service Providers | @GetMapping("/service-providers")

### Service Type Controllers
    - Create Service Type       | @PostMapping("/service-types")
    - Update Service Type       | @PostMapping("/service-types")
    - Delete Service Type       | @DeleteMapping("/service-types/{id}")
    - Get Service Type          | @GetMapping("/service-types/{id}")
    - Get All Service Types     | @GetMapping("/service-types")



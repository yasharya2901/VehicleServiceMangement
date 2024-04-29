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
        <th>Additional Details</th>
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
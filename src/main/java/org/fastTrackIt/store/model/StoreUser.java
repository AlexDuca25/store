package org.fastTrackIt.store.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "store_customers_employers")
public class StoreUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String enployee_name;
    private String employee_email;
    private int employee_age;
    private String employee_password;
    private  EmployeePosition position;
    List<Product> order;


}

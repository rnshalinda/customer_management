package edu.icet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "customer")
@Entity
public class Customer {

    @Id
    private String id;
    private String name;
    private String address;
    private Double salary;
}

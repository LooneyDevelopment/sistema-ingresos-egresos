package com.looneyDevelopment.sistemaingresosegresos.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column
    private String phone;

    @OneToOne
    private Employee employee;

    @Column
    private LocalDate createdAt;

    @Column
    private LocalDate updatedAt;

    public Profile(String id, String phone, Employee employee) {
        this.id = id;
        this.phone = phone;
        this.employee = employee;
    }

    public Profile() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

package com.looneyDevelopment.sistemaingresosegresos.Entities;

import com.looneyDevelopment.sistemaingresosegresos.entities.EnumRoleName;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;
    
    @Column(nullable = false, unique = true)
    private String correo;

    @OneToOne(mappedBy = "employee")
    private Profile profile;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = EnumRoleName.class, fetch = FetchType.EAGER)
    private List<EnumRoleName> roles;

    //@OneToMany(mappedBy = "employee")
    //De Muchos a uno para Comunicar de enterpise a empoyee
    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    //De Uno a muchos para Comunicar de employee a transaction
    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    private List<Transaction> transactions;

    @Column
    private LocalDate createdAt;

    @Column
    private LocalDate updatedAt;

    //Contructor
    public Employee() {

    }

    //Metodos Getter and Setter
    public Long getId_Empleado() {
        return id;
    }

    public void setId_Empleado(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<EnumRoleName> getRol() {
        return roles;
    }

    public void setRol(List<EnumRoleName> roles) {
        this.roles = roles;
    }
}

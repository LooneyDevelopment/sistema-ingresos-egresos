package com.looneyDevelopment.sistemaingresosegresos.entities;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Empleado;
    private String nombre;
    private String correo;
    private String rol;
    //@OneToMany(mappedBy = "employee")
    //De Muchos a uno para Comunicar de enterpise a empoyee
    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    //De Uno a muchos para Comunicar de employee a transaction
    @OneToMany(mappedBy = "employee")
    private Transaction transaction;



    //Contructor
    public Employee() {

    }

    //Metodos Getter and Setter
    public Long getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(Long id_Empleado) {
        this.id_Empleado = id_Empleado;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

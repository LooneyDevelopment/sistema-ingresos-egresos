package com.looneyDevelopment.sistemaingresosegresos.Entities;

public class EmployeeResponse {

    private String mensaje;
    private Object object;

    public EmployeeResponse(String mensaje, Object object) {
        this.mensaje = mensaje;
        this.object = object;
    }

    public EmployeeResponse() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
    //__________________________________________________________________________________
}


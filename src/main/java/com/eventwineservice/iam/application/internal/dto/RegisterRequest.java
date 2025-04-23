package com.eventwineservice.iam.application.internal.dto;


public class RegisterRequest {
    private String nombre;
    private String apellido;
    private String email;
    private String password;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

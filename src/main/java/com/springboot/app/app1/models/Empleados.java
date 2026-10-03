package com.springboot.app.app1.models;

public class Empleados {
    public Empleados(String name, String surname, String address, String rol,
                    int age, int phoneNumber, int id){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.rol = rol;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.id = id;

    }

    private String name, surname, address, rol;
    private int age;
    private int phoneNumber;
    private final int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

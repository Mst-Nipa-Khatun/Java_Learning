package com.nipa.java_learning.OOP;

public class EncapsulationExample {
    private String name;
    private double age;
    private String gender;
    private String address;
    private String phoneNumber[];

    public EncapsulationExample() {
    }
    public EncapsulationExample(double age) {
        this.age = age;
    }
    public EncapsulationExample(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

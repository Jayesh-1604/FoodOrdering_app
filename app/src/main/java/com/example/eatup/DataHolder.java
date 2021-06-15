package com.example.eatup;

public class DataHolder {
    String name,email,address,pass,age,gender,ph;

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public DataHolder(String name, String email, String address, String pass, String age, String ph) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.pass = pass;
        this.age = age;
        this.ph = ph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}

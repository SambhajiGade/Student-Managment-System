package com.student.manage;

public class student {

    private int id;
    private String name;
    private String phone;
    private String city;

    public student(int id, String name, String phone, String city) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public student( String name, String phone, String city) {
          super();
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public student() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

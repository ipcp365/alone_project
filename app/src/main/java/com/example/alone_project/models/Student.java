package com.example.alone_project.models;

import io.realm.RealmObject;


public class Student extends RealmObject {
    private String name;
    private String age;

    public Student() {

    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}

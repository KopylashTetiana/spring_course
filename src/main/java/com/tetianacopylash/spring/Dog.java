package com.tetianacopylash.spring;

public class Dog implements Pet {
//    private String name;
    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void init() {
        System.out.println("ClassDog: init method");
    }

    private void destroy() {
        System.out.println("Class Dog: destroy method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}

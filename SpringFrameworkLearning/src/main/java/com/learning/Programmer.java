package com.learning;

public class Programmer {
    private int age;
    private Computer com;
    public Programmer(){
        System.out.println("Programmer Constructor");
    }


    public int getAge() {
        return age;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Computer getCom() {
        return com;
    }

    public void setAge(int age) {
        System.out.println("Age Assigned");
        this.age = age;
    }

    public void code()
    {
        System.out.println("Programmer write codes");
        com.compile();
    }
}

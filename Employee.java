package com.flavia;
/*
* A program that implements abstraction, encapsulation, inheritance, polymorphism, methods, and overloading
*
* Abstraction can be illustrated using classes to hide details of implementation from the users.
* Encapsulation involves hiding class information from other classes.
* Inheritance: Parent class is Person, Employee is its child class.
* Polymorphism: method overriding and overloading are examples of this.
* */

class Person {
    private String nationalIdNo;
    public String name;
    public static int count = 0;

    public Person(String name){
        this.name = name;
        count += 1;
    }

    public Person(){
        count += 1;
    }

    public void status(){
        System.out.println("Status is only available for Employees");
    }

    public void setNationalIdNo(String nationalIdNo){
        this.nationalIdNo = nationalIdNo;
    }

    public String getNationalIdNo(){
        return ("National Identity Card Number: "+this.nationalIdNo);
    }
}

public class Employee extends Person{
    String company;
    public static int noEmployees = 0;

    public Employee(String name, String company){
        super(name);
        this.company = company;
        noEmployees += 1;
    }

    public void status(){
        System.out.println("Status: Employed");
    }

    public static void main(String args []){

        // encapsulation
        Person person1 = new Person("Mary");
        System.out.println("Name: "+ person1.name);
        person1.setNationalIdNo("ABC-234-D5E");
        System.out.println(person1.getNationalIdNo());
        // method overriding a form of polymorphism
        person1.status();
        System.out.println();

        //Inheritance

        Employee employee1 = new Employee("John", "Andela");
        employee1.setNationalIdNo("ABC-234-D5E");
        System.out.println("Name: "+ employee1.name);
        System.out.println("Company: "+ employee1.company);
        System.out.println(employee1.getNationalIdNo());

        // method overriding a form of polymorphism
        employee1.status();

        // method overloading a form of Polymorphism
        System.out.println();
        Person person2 = new Person();
        System.out.println("Number of People so far: "+ count);
        System.out.println("Number of Employees so far: "+ noEmployees);
    }

}

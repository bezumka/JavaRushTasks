package com.javarush.task.task05.task0506;

/* 
Человечки
*/

public class Person {
        public String name;
        public int age;
        public String address;
        public char sex;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Vasya";
        person.age = 30;
        person.address = "Sport 1";
        person.sex = 'm';
    }
}

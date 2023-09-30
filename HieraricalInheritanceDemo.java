//java program to demonstrate hierarical inheritance 
//HieraricalInheritanceDemo.java
import java.io.*;
class Animal
{
    void eat()
    {
        System.out.println("Animal can eat...");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog can bark..");
    }
}
class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat can sounds meowww....");
    }
}
class HieraricalInheritanceDemo
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.bark();
        c.meow();
        d.eat();
    }
}

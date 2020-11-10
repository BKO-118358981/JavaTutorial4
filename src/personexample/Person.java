/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personexample;

/**
 *
 * @author adamoc
 */
public class Person {
    String name;
    int age;
    double height;
    
    Person(String name , int age , double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Hello my name is " + this.name + ", my age is " + this.age + ". My height is " + this.height;
    }
    
    

    
    
}

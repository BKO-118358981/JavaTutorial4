/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personexample;

import java.util.Scanner;
import personexample.Person;

/**
 *
 * @author adamoc
 */
public class PersonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.next();
        System.out.println("What is your age? ");
        int age = scan.nextInt();
        System.out.println("What is your height? ");
        double height = scan.nextDouble();
        
        Person me = new Person(name, age, height);
        System.out.println(me.toString());
         
    }
    
}

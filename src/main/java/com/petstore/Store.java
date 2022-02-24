package com.petstore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Store {

        public static void customerGreeting(){
            System.out.println("Welcome to our Pet Store");
        }

    private String collectUserResponse(){
        String response="";
        boolean flag = true;
        while(flag){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Would you like to purchase a pet and/or supplies?");
                response = scanner.next();
                flag = false;
            } catch (InputMismatchException ex) {
                System.out.println("That was not an acceptable answer. Try again");
            }
        }
        return response;
    }

        public static void customerChoice(){}

        public static void options(){
            //switch statement
        }

        public static void printReceipt(){}

        public static void start(){}
    }




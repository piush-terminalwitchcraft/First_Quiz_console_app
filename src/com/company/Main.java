package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean b = true;
        System.out.println("Welcome to Quiz console app!\n-----*General Instruction*-----\n1)For each question you are been given " +
                "10 seconds\n2)For correct answer 4 marks are being added and for all other combinations one marks is deducted");
        Main_class c = new Main_class();
        while (b){
            System.out.println("Enter 1 for Maths Quiz\nEnter 2 for Physics quiz\nEnter 3 to exit the app");
            int a = scan.nextInt();
            if(a==1){
                c.select_topic(a);
            }
            else if(a==2){
                c.select_topic(a);
            }
            else if(a==3){
                break;
            }
            else{
                System.out.println("Wrong input ");
            }

        }
    }
}

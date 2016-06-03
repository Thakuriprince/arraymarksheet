/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.BE;

import java.util.Scanner;

/**
 *
 * @author Prince
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("           TU _ Marksheet");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Enter your symbol no.:");
        String symbol = input.next();
        System.out.println("Enter marks of 5 subjexts");

        String[] sub = {"math", "drawing", "dsa", "ds", "em"};
        float[] marks = new float[sub.length];
        int tot = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the marks in " + sub[i]);
            marks[i] = input.nextFloat();
             tot += marks[i];
          
        } 
        System.out.println("Totl marks:" + tot);
       
        float per = tot / 5;
        if (marks[0] >= 32 && marks[1] >= 32 && marks[2] >= 32 && marks[3] >= 32 && marks[4] >= 32) {

                 System.out.println("Total: " + tot);
            System.out.println("Percentage: " + per + "%");}
        {System.out.println("Fail");}
            {
           
            }
                if (per >= 75) {
                    System.out.println("congrats you got Distinction ");
                } else if (per >= 60 && per < 75) {
                    System.out.println("congrats you got First Division");
                } else if (per >= 45 && per < 60) {
                    System.out.println("congrats you got Second Division ");
                } else if (per >= 32 && per < 45) {
                    System.out.println("congrats you got Third Division ");
                } else if (per  < 32 ){
                    System.out.println("\nFail:Try next time ");
                
            } 
             System.out.println("\n Do You Wanna continue[Y/N]");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                System.exit(0);}
        }
    }



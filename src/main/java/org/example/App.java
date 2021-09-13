/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;



import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner uInput = new Scanner(System.in);
        System.out.println( "Is the car silent when you turn the key?" );
        String Answer = uInput.nextLine();
        if (Answer.equals("Y") || Answer.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            Answer = uInput.nextLine();
            if (Answer.equals("Y")||Answer.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            System.out.println("Does the car make a slight ticking noise?");
            Answer = uInput.nextLine();
            if (Answer.equals("Y")||Answer.equals("y")){
                System.out.println("Replace the Battery.");
            }
            else {
                System.out.println("Does the car crank up but fail to start?");
                Answer = uInput.nextLine();
                if (Answer.equals("Y")||Answer.equals("y")){
                    System.out.println("Check spark plug connections.");
                }
                else{
                    System.out.println("Does the engine start then die?");
                    Answer = uInput.nextLine();
                    if (Answer.equals("Y")||Answer.equals("y")){
                        System.out.println("Does the car have fuel injection?");
                        Answer = uInput.nextLine();
                        if (Answer.equals("Y")||Answer.equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }

            }
        }

    }
}

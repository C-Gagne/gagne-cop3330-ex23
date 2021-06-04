/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex23;
import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App mainApp = new App();

        System.out.println("Is the car silent when you turn the key?");
        String answer = mainApp.getAnswer();

        if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
        {
            System.out.println("Does the car make a slicking noise?");
            answer = mainApp.getAnswer();

            if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
            {
                System.out.println("Does the car crank up but fail to start?");
                answer = mainApp.getAnswer();

                if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
                {
                    System.out.println("Does the engine start and then die?");
                    answer = mainApp.getAnswer();

                    if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
                    { System.out.println("This should not be possible.");}
                    else if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        answer = mainApp.getAnswer();
                        if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
                        { System.out.println("Check to ensure the choke is opening and closing.");}
                        else if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes"))
                        { System.out.println("Get it in for service."); }

                    }
                }

                else if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes"))
                { System.out.println("Check spark plug connections."); }
            }

            else if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes"))
            { System.out.println("Replace the battery."); }
        }

        else if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes"))
        {
            System.out.println("Are the battery terminals corroded?");
            answer = mainApp.getAnswer();

            if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
            { System.out.println("Replace cables and try again");}
            else if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes"))
            { System.out.println("Clean terminals and try starting again."); }
        }

    }

    public String getAnswer()
    {
        return in.nextLine();
    }
}
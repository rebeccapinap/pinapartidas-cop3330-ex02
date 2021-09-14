package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Asks user for input string and then outputs the string and length
        System.out.print("What is the input string? ");
        String inputstr = input.nextLine();

        int length = inputstr.length();
        
        System.out.print(inputstr + " has " + length + " characters.");
    }
}

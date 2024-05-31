package com.dani.internapp;

import java.util.*;

/**
 * App class 001
 *
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args )
    {
        welcomeMessage();
        System.out.println("\t1: Register User\n\t2: Retrieve All Users\n\t3: Retrieve by username\n\t4: Delete a user\n\t5: Exit");
    }

    static void welcomeMessage()
    {
        System.out.println("Welcome to the Registration System.");
        System.out.println("Provide a number to make a choice:");
    }

    
}

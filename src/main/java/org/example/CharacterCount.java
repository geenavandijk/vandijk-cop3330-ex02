package org.example;

import java.util.Scanner;

public class CharacterCount {
        public static void main (String[] args){

            Scanner input = new Scanner(System.in);

            System.out.printf ("What is the input string? ");

            String string = input.next ();//Obtain user input

            System.out.printf ("%s has %d characters.", string, string.length ());//Display string and length using build in function

        }//End of method
}//End of class

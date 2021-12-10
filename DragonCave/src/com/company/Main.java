package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // Dragon Cave Introduction.    // Try using tripple quoated strings. 
    String Intro =
            "\nYou are in a land full of dragons. In front of you," +         
            "\nyou see two caves. In one cave, the dragon is friendly" +       
            "\nand will share his treasures with you. The other dragon" +     
            "\nis greedy and hungry and will eat you on sight." +
            "\nWhich cave will you go into? (1 or 2)\n";

    // Input choice 1 or 2     // Make sure you code is formatted correctly 
        System.out.println(Intro);                      
        Scanner input = new Scanner(System.in);          
        System.out.println(input.nextInt());             

    // The outcome     // Try using tripple quoated strings.
        String Ending =
                "\nYou approach the cave..." +
                "\nIt is dark and spooky..." +
                "\nA large dragon jumps out in front of you! He opens his jaw and..." +
                "\nGobbles you down in one bite!";
        System.out.println(Ending);
	    
     // Always close the scanner when you are done with it. 
    }
}

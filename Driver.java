// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Driver {
    private Scanner input = new Scanner(System.in);
    private Brand brand;
    public static void main(String[] args){new Driver();}
    public Driver(){
        runMainMenu();
        runGreenhandMenu();
        runAmateurMenu();
    }
    private int mainMenu(){
        System.out.print("""
                Welcome to the badminton world
                ----------
                You are:
                1)Green Hand
                2)Amateur
                   ===>>"""
        );
        int optionorigin = input.nextInt();
        return optionorigin;
    }
    private void runMainMenu(){
        int optionorigin=mainMenu();
        while (optionorigin !=0){
            switch (optionorigin){
                case 1->nextMenuForGreenhand();
                case 2->nextMenuForAmateur();
                default -> System.out.println("Invalid option entered: " + optionorigin);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            optionorigin = mainMenu();
        }
    }
    private int nextMenuForGreenhand(){
        System.out.print("""
                You want to know:
                1)Introduction
                2)Rules
                3)Famous Players
                0)Return to last procedure
                   =====>
                """
        );
        int optionone=input.nextInt();
        return optionone;
    }
    private void runGreenhandMenu(){
        int optionone=nextMenuForGreenhand();
        while(optionone!=0){
            switch (optionone){
                case 1->printIntroduction();
                case 2->printRules();
                case 3->printFamousPlayers();
                default -> System.out.println("Invalid option entered: " + optionone);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            optionone = nextMenuForGreenhand();
        }
    }
    private int nextMenuForAmateur(){
        System.out.print("""
                You'd like to search:
                1)Racket
                2)Shoes
                0)Return to last procedure
                   ====>""");
        int optiontwo=input.nextInt();
        return optiontwo;
    }



    private void runAmateurMenu(){
        int optiontwo=nextMenuForAmateur();
        while (optiontwo!=0){
            switch (optiontwo){
                case 1->GotoRacket();
                case 2->GotoShoes();
                default -> System.out.println("Invalid option entered: " + optiontwo);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            optiontwo = nextMenuForAmateur();
        }
    }
    private void printIntroduction(){
        System.out.print("INTRODUCTION:");
    }
    private void printRules(){
        System.out.print("RULES:");
    }
    private void printFamousPlayers(){
        System.out.print("Famous Players:");
    }
    private void GotoRacket(){
        System.out.print("Choose a brand:");
    }
    private void GotoShoes(){
        System.out.print("Choose a brand:");
    }
}
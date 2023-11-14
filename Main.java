import java.util.Scanner;

public class Main {
    private Scanner input=new Scanner(System.in);

    public static void main(String[] args) {new Main();}
    public Main(){
        runMainMenu();

    }
    private int MainMenu(){
        System.out.println("""
                Welcome to the badminton world!
                ------------------------------
                You are:
                1)Greenhand
                2)back to last menu
                0)exit
                ====>
                """);
        int optionorigin= input.nextInt();
        return optionorigin;
    }
    private void runMainMenu(){
        int optionorigin=MainMenu();
        while (optionorigin!=0){
            switch (optionorigin){
                case 1->runGreenhandMenu();
                case 2->System.out.println("Press the key to continue");
                default -> System.out.println("haha");
            }
            optionorigin=MainMenu();
        }
        System.out.println("Exiting...bye");
        System.exit(0);
    }

    private void runGreenhandMenu() {
        byte optionone=GreenhandMenu();
        while (optionone!=0){
            switch (optionone){
                case 1->printIntroduction();
                case 2->printRules();
                case 3 -> MainMenu();
                default -> System.out.println("haha");
            }
            optionone=GreenhandMenu();
        }
    }

    private  byte GreenhandMenu(){
        System.out.println("""
                You want to know:
                1)Introduction
                2)Rules
                3)back to last menu
                0)exit
                ====>
                """);
        byte optionone=input.nextByte();
        return optionone;
    }

    private void printIntroduction(){
        System.out.println("Introduction");
    }
    private void printRules(){
        System.out.println("Rules");
    }
}
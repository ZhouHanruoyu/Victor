import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<ProductRacket> Productracket=new ArrayList<>();
    List<ProductShoe> Productshoe=new ArrayList<>();
    List<String>Club=new ArrayList<>();
    List<String>Members=new ArrayList<>();

    Scanner input=new Scanner(System.in);


    public static void main(String[] args){

        new Menu();}

    public Menu(){
        showMainMenu();
    }
    /*show main menu
    there exists three functions in main menu:
    green hands' beginner guide,amateur,club management.
    whenever you want to exit program,press 0 .
    press Enter button to continue when program stops.
    */
    public void showMainMenu(){
        do {
            System.out.println("---||Badminton World||---");
            System.out.println("*************************************");
            System.out.println("1.Green hand\n2.Amateur\n3.Club\n0.Exit(Whenever you want to exit,type in 0.)");
            System.out.println("*************************************");
            System.out.println("Please type in the number");
            System.out.println("Whenever the program stops, press Enter button to continue.");
            /*
            I turn the variable "choice"'s type to String
            */
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    showGreenhandMenu();
                    break;
                case 2:
                    showAmateurMenu();
                    break;
                case 3:
                    ClubManagement();
                    break;
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    System.out.println("Press any button to continue");
                    input.nextLine();
                    break;
            }
        }while (true);
    }
    public void ClubManagement(){
        do {
            System.out.println("""
                    Club Management System:
                    1.Create a new club
                    2.Participate in existed club
                    3.Dissolve a club
                    4.Exit from a club
                    5.List clubs stored
                    6.return
                    """);
            int choice= input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    CreateClub();
                    break;
                case 2:
                    AddClubMembers();
                    break;
                case 3:
                    DissolveClub();
                    break;
                case 4:
                    ExitClub();
                    break;
                case 5:
                    ListClubAndMembers();
                    break;
                case 6:
                    return;
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    break;
            }
        }while (true);
    }
    public void CreateClub(){
        do {
            input.nextLine();
            System.out.println("""
                -----------------
                Enter in number;
                Enter 1 to continue to create your club;
                Enter 0 to exit.
                """);
            int i= input.nextInt();
            input.nextLine();
            switch (i){
                case 1:
                    System.out.println("Naming your club:");
                    String ClubName=input.nextLine();
                    Club.add(ClubName);
                    if (!Club.isEmpty()){
                        System.out.println("Club created successfully!");
                    }else {
                        System.out.println("Club haven't been created,please try again.");
                    }
                    break;
                case 0:
                    return;
            }
        }while (true);
    }
    public void AddClubMembers(){
                    for (int i = 0; i < Club.size(); i++) {
                        System.out.println((i + 1) + ")" + Club.get(i));
                    }
                    System.out.println("Choose a club you want to enter and type in the number before it.");
                    int index=input.nextInt();
                    input.nextLine();
                    System.out.println("Then type in your name,type over when finish");
                    while (true) {
                        String MemberName = input.nextLine();
                        if (MemberName.equalsIgnoreCase("over")){
                            break;
                        }
                        String membername = Club.get(index - 1) + "." + MemberName;
                        Members.add(membername);
                    }
            }
    public void DissolveClub(){

    }
    public void ListClubAndMembers(){
        for (int i=0;i< Members.size();i++){
            System.out.println("Club:"+Members.get(i));
        }
    }
    public void ExitClub(){

    }
    public void showAthlete() {
        String[] player = {"Lin Dan", "Chen Long", "Shi Yu qi","Lee Chong wei","Victor Axelsen"};
        /*endless loop
        to make the function run repeatedly until user want to exit
        * */
        while (true) {
            System.out.println("""
                Press the athlete name to search(press over to return):
                """);
            //assign what user type in to variable"search",trim()is to erase meaningless contents
            String search = input.nextLine().trim();
            //create boolean variable"compare" to judge if what user type in exists in my program
            boolean compare=false;
            //when user type in "over",return to last menu,
            if (search.equalsIgnoreCase("over")) {
                return;
            }
            else{
                for (String players:player) {
                    if (players.contains(search)) {
                        System.out.println(players);
                        compare = true;
                    }
                  }
                }
            if (!compare){
                System.out.println("Can't find the athlete you search");
            }
                System.out.println("Press any button to continue(press over to return)");
                input.nextLine();
            }
        }
    //显示新手菜单
    public void showGreenhandMenu(){
        do {
            System.out.println("---Beginner Guide---");
            System.out.println("*************************************");
            System.out.println("1.Introduction\n2.Rules\n3.Equipment Recommend\n4.Return");
            System.out.println("*************************************");
            System.out.println("Please type in the number,press 0 to exit.");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    printIntroduction();
                    break;
                case 2:
                    printRules();
                    break;
                case 3:
                    printRecommend();
                    break;
                case 4:
                    //返回上一级
                    return;
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    break;
            }
        }while (true);
    }
    public void printIntroduction(){
        System.out.println("---Introduction---");
        System.out.println(Introduction.INTRODUCTION_TEXT1);
        System.out.println(Introduction.INTRODUCTION_TEXT2);
        System.out.println(Introduction.INTRODUCTION_TEXT3);
        System.out.println(Introduction.INTRODUCTION_TEXT4);
        System.out.println(Introduction.INTRODUCTION_TEXT5);
        System.out.println("Press any button to continue.");
        input.nextLine();
    }
    public void printRules(){
        System.out.println("---Rules---");
        System.out.println(Rules.RULES_TEXT1);
        System.out.println(Rules.RULES_TEXT2);
        System.out.println(Rules.RULES_TEXT3);
        System.out.println(Rules.RULES_TEXT4);
        System.out.println(Rules.RULES_TEXT5);
        System.out.println(Rules.RULES_TEXT6);
        System.out.println("Press any button to continue.");
        input.nextLine();
    }
    public void printRecommend(){

    }
    //show Amateur Menu
    public void showAmateurMenu(){
        do {
            System.out.println("---爱好者天堂---");
            System.out.println("*************************************");
            System.out.println("1.商品\n2.运动员\n3.返回上一层");
            System.out.println("*************************************");
            System.out.println("请输入数字,按0退出");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    showProductsMenu();
                    break;
                case 2:
                    showAthlete();
                    break;
                case 3:
                    //返回上一级
                    return;
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    break;
            }
        }while (true);
    }
    //展示商品
    public void showProductsMenu(){
        do{
        System.out.println("""
                ---Products list---
                1.racket
                2.shoes
                3.List chosen racket
                4.List chosen shoes
                5.delete racket
                6.delete shoes
                7.return
                """);
        int choice= input.nextInt();
        input.nextLine();
        switch (choice){
            case 1:
                showProductRacketMenu();
                break;
            case 2:
                showProductShoeMenu();
                break;
            case 3:
                ListRackets();
                break;
            case 4:
                ListShoes();
                break;
            case 5:
                DeleteRacket();
                break;
            case 6:
                DeleteShoes();
                break;
            case 7:
                return;
            case 0:
                System.out.println("Thank for using,see you!");
                System.exit(0);
            default :
                System.out.println("Invalid option entered:");
                break;
        }
    }while (true);
    }
public void showProductRacketMenu() {
        do {
            System.out.println("""
                    ----------------------------
                    Choose the rackets
                    Press the button to continue
                    1.Type in the information
                    0.Exit
                    ----------------------------
                    """);
            int i=input.nextInt();
            input.nextLine();
            switch (i) {
                case 1:
                    //ask user to type in the brand and get the brand
                    String brand="nothing";
                    boolean InvalidBrand=false;
                    while (!InvalidBrand){
                      System.out.println("""
                        Type in the brand
                        (Yonex, Victor, Lining)""");
                      brand = input.nextLine();
                      if (brand.equalsIgnoreCase("Yonex")||
                              brand.equalsIgnoreCase("Victor")||
                              brand.equalsIgnoreCase("Lining")){
                          InvalidBrand=true;
                      }
                      else {
                          System.out.println("""
                                  The brand isn't existed in our project,sorry.
                                  Please type in the correct brand, thanks.
                                  """);
                      }
                    }
                    //ask user to type in the name and get the name
                    System.out.println("Type in the name");
                    String name = input.nextLine();
                    //ask user to type in the balance point and get it

                    double BalancePoint=0.0;
                    boolean InvalidBalancePoint=false;
                    while (!InvalidBalancePoint){
                    System.out.println("""
                        Type in the balance point
                        (xxx milimeter,often between 280 to 320)""");
                    BalancePoint = input.nextDouble();
                    if (BalancePoint<320 && BalancePoint>280) {
                        InvalidBalancePoint = true;
                    }
                    else {
                    System.out.println("""
                            Invalid Balance Point,
                            Please type in valid number ranges from 280 to 320,thanks.
                            """);
                      }
                    }
                    //ask user to type in the rigidity of handle and get it
                    input.nextLine();
                    int RigidityOfHandle=0;
                    boolean InvalidRigidity=false;
                    while (!InvalidRigidity){
                        System.out.println("""
                        Type in the rigidity of handle
                        (1 t 8)""");
                        RigidityOfHandle = input.nextInt();
                        if (RigidityOfHandle>=1 && RigidityOfHandle<=8){
                            InvalidRigidity=true;
                        }
                        else {
                            System.out.println("""
                                    Invalid Rigidity of handle,
                                    Please type in valid number ranges from 1 to 8,thanks.
                                    """);
                        }
                    }

                    //ask user to type in the category and get it
                    input.nextLine();
                    String RacketCategory="nothing";
                    boolean InvalidCategory=false;
                    while (!InvalidCategory){
                        System.out.println("""
                        Type in the category
                        (attack,balance,velocity)""");
                        RacketCategory = input.nextLine();
                        if (RacketCategory.equalsIgnoreCase("attack")||
                                RacketCategory.equalsIgnoreCase("balance")||
                                RacketCategory.equalsIgnoreCase("velocity")){
                            InvalidCategory=true;
                        }
                        else {
                            System.out.println("""
                                    Invalid category,
                                    Please type in correct category,thanks.
                                    """);
                        }
                    }
                    System.out.println("Press any button to continue.");
                    input.nextLine();
                    //assign "ProductRacket"
                    ProductRacket productRacket = new ProductRacket(brand,name,BalancePoint,RigidityOfHandle,RacketCategory);
                    //add"ProductRacket" to the arraylist"Productracket"
                    Productracket.add(productRacket);
                    break;
                case 0:
                    return;
                default :
                    System.out.println("Invalid option entered:");
                    return;
            }
        }while (true);
    }
    public void ListRackets(){
        //print the information about the racket
        //get the amounts of product
        int size1=Productracket.size();

        if (size1==0){
            input.nextLine();
            System.out.println("You haven't chosen any racket.");
        }
        else {
            input.nextLine();
            System.out.println("--Racket you have chosen:--");
            //walk through the arraylist"Productracket"
            //foreach loop
            for (int i = 0; i < Productracket.size(); i++) {
                ProductRacket productracket = Productracket.get(i);
                System.out.println("(" + i+1 + ")" + productracket.brand + "'s racket:" +
                        productracket.name + ",the balance point is " +
                        productracket.BalancePoint + "mm" + ",the rigidity of handle is " +
                        productracket.RigidityOfHandle +
                        "," + productracket.RacketCategory + " category." + "\n"
                );

            }
            System.out.println("You have chosen " + size1 + " rackets.");
            System.out.println("Press ant button to continue.");
            input.nextLine();
        }
    }

    public void DeleteRacket(){
        if (Productracket.isEmpty()){
            System.out.println("Their exists no racket in your shopping cart.");
            return;
        }
        ListRackets();
        System.out.println(
                "Type in the number (1 to "+Productracket.size()+"),before the rackets you want to delete."
                );
            int deletenumber1=input.nextInt();
            input.nextLine();
            if (deletenumber1>=1 && deletenumber1<=Productracket.size()){
                Productracket.remove(deletenumber1-1);
                System.out.println("Delete successfully, press any button to continue.");
                input.nextLine();
            }
            else {
                System.out.println("Delete unsuccessfully, try again and ensure you have enter true number.");
                System.out.println("Press any button to continue.");
                input.nextLine();
            }
    }
    public void showProductShoeMenu(){
        do {
            System.out.println("""
                    Choose the badminton shoes
                    1.Type in the information
                    2.Exit
                    """);
            int i=input.nextInt();
            input.nextLine();
            switch (i) {
                case 1:
                    //ask user to type in the brand and get the brand

                    String brand="nothing";
                    boolean InvalidBrand=false;
                    while (!InvalidBrand){
                        System.out.println("""
                        Type in the brand
                        (Yonex, Victor, Lining)""");
                        brand = input.nextLine();
                        if (brand.equalsIgnoreCase("Yonex")||
                                brand.equalsIgnoreCase("Victor")||
                                brand.equalsIgnoreCase("Lining")){
                            InvalidBrand=true;
                        }
                        else {
                            System.out.println("""
                                  The brand isn't existed in our project,sorry.
                                  Please type in the correct brand, thanks.
                                  """);
                        }
                    }
                    //ask user to type in the name and get it
                    System.out.println("Type in the name");
                    String name = input.nextLine();
                    //ask user to type in the category and get it
                    String ShoeCategory="nothing";
                    boolean InvalidCategory=false;
                    while (!InvalidCategory){
                        System.out.println("""
                        Type in the category
                        (attack,balance,velocity)""");
                        ShoeCategory = input.nextLine();
                        if (ShoeCategory.equalsIgnoreCase("attack")||
                                ShoeCategory.equalsIgnoreCase("balance")||
                                ShoeCategory.equalsIgnoreCase("velocity")){
                            InvalidCategory=true;
                        }
                        else {
                            System.out.println("""
                                    Invalid category,
                                    Please type in correct category,thanks.
                                    """);
                        }
                    }
                    ProductShoe productShoe=new ProductShoe(brand,name,ShoeCategory);
                    Productshoe.add(productShoe);

                    break;
                case 2:
                    return;
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    break;
            }
        }while (true);
    }

    public void ListShoes(){
        //print the information about the shoes
        //get the amounts of product
        int size2=Productshoe.size();
        input.nextLine();
        System.out.println("---The badminton shoes you have chosen:---");
        //walk through the arraylist"Productshoe"
        //foreach loop
        for (ProductShoe productShoe:Productshoe){
        System.out.println("You choose "+productShoe.brand+"'s shoes:"+
            productShoe.name+","+
            productShoe.ShoeCategory+" category."+"\n");
        }
        System.out.println("You have chosen "+size2+" shoes.");
    }
    public void DeleteShoes(){
        if (Productshoe.isEmpty()){
            System.out.println("Their exist no shoes in your shopping cart.");
            return;
        }
        ListShoes();
        System.out.println(
                "Type in the number (1 to "+Productshoe.size()+" ),before the shoes you want to delete."
        );
        int deletenumber2=input.nextInt();
        input.nextLine();
        if (deletenumber2>=1 && deletenumber2<=Productshoe.size()){
            Productshoe.remove(deletenumber2-1);
            System.out.println("Delete successfully,press any button to continue.");
            input.nextLine();
        }
        else {
            System.out.println("Delete unsuccessfully, try again and ensure you have enter true number.");
            System.out.println("Press any button to continue.");
            input.nextLine();
        }
    }
}



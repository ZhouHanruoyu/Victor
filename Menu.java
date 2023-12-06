import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<ProductRacket> Productracket=new ArrayList<>();
    List<ProductShoe> Productshoe=new ArrayList<>();
    List<Club>clubs=new ArrayList<>();
    Scanner input=new Scanner(System.in);
    Club club=new Club("my club","2");

    public static void main(String[] args){

        new Menu();}

    public Menu(){
        showMainMenu();
    }
    //显示登录菜单

    //显示主菜单
    public void showMainMenu(){
        do {
            //显示主菜单
            System.out.println("---羽毛球世界---");
            System.out.println("*************************************");
            System.out.println("1.新手\n2.业余爱好者\n3.俱乐部\n0.退出");
            System.out.println("*************************************");
            System.out.println("请输入数字");
            String choice = input.nextLine();
            input.nextLine();
            switch (choice) {
                case "1":
                    showGreenhandMenu();
                    break;
                case "2":
                    showAmateurMenu();
                    break;
                case "3":
                    ClubManagement();
                    break;
                case "0":
                    //返回上一级
                    System.out.println("谢谢使用，下次见！");
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    System.out.println("Press any button to continue");
                    input.nextLine();
                    break;
            }
        }while (true);
    }
    public void showAthleteNational(){
        System.out.println("""
                1.China
                2.Japan
                3.Korea
                4.Malaysia
                5.Denmark
                6.return
                """);
        int choice=input.nextInt();
        input.nextLine();
        switch (choice){
            case 1:
                China();
                break;
            case 2:
                Japan();
                break;
            case 3:
                Korea();
                break;
            case 4:
                Malaysia();
                break;
            case 5:
                Denmark();
                break;
            case 6:
                return;
            case 0:
                System.exit(0);
            default :
                System.out.println("Invalid option entered:");
                break;
        }
    }
    public void ClubManagement(){
        do {
            System.out.println("""
                    Club Management System:
                    1.Create a new club
                    2.Participate in existed club
                    3.Dissolve a club
                    4.exit from a club
                    5.return
                    """);
            int choice= input.nextInt();
            switch (choice){
                case 1:
                    CreateClub();
                    break;
                case 2:
                    ParticipateClub();
                    break;
                case 3:
                    DissolveClub();
                    break;
                case 4:
                    ExitClub();
                case 5:
                    return;
                case 0:
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    break;
            }
        }while (true);
    }
    public void CreateClub() {
        input.nextLine();
        System.out.println("Please type in your new club's name:");
        String ClubName = input.nextLine();

        System.out.println("And type in the creation date (year/month/day):");
        String FoundDate = input.nextLine();

        Club club = new Club(ClubName, FoundDate);
        clubs.add(club);
        System.out.println("Club created successfully!");
        System.out.println("Press Enter to continue.");
        input.nextLine();
        System.out.println("Add members now?");
        System.out.println("Type in y(yes) or n(no)");
        String judge=input.nextLine();
        if (judge.equalsIgnoreCase("y")){
            ParticipateClub();
        }
    }
    public void DissolveClub(){
        input.nextLine();
        System.out.println("You want to dissolve your club?");
        ListClubs();
        System.out.println();
    }

    public void ExitClub(){

    }
    public void ListClubs(){
        for (Club club:clubs){
            System.out.println("Clubs we have:"+"\n"+club.getName()+" (founded in "+club.getFoundDate());
        }
    }
    public void ParticipateClub(){
        input.nextLine();
        System.out.println("Choose a club you want to participate in:");
        System.out.println("Type the number before the club you want to join in.");
        ListClubs();
        int Join=input.nextInt();
        input.nextLine();
        if(Join>0&&Join<clubs.size()){
            System.out.println("Type in your members' name.");
            String Information=input.nextLine();
           club.AddMembers(Information);
        }

    }

    public void China(){

    }
    public void Japan(){

    }
    public void Korea(){

    }
    public void Malaysia(){

    }
    public void Denmark(){

    }
    //显示新手菜单
    public void showGreenhandMenu(){
        do {
            System.out.println("---新手指南---");
            System.out.println("*************************************");
            System.out.println("1.介绍\n2.规则\n3.装备推荐\n4.返回上一层");
            System.out.println("*************************************");
            System.out.println("请输入数字,按0退出");
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
                    showAthleteNational();
                    break;
                case 3:
                    //返回上一级
                    return;
                case 0:
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

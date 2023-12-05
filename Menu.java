import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<ProductRacket> Productracket=new ArrayList<>();
    List<ProductShoe> Productshoe=new ArrayList<>();

    public static void main(String[] args){

        new Menu();}
    Scanner input=new Scanner(System.in);
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
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showGreenhandMenu();
                    break;
                case 2:
                    showAmateurMenu();
                    break;
                case 3:
                    showProductsMenu();
                    break;
                case 4:
                    break;
                case 0:
                    //返回上一级
                    System.out.println("谢谢使用，下次见！");
                    System.exit(0);
                default:
                    System.out.println("输入错误");
                    break;
            }
        }while (true);
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
            switch (choice) {
                case 1:
                    System.out.println("介绍");
                    break;
                case 2:
                    System.out.println("规则");
                    break;
                case 3:
                    System.out.println("装备推荐");
                    break;
                case 4:
                    //返回上一级
                    return;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("输入错误");
                    break;
            }
        }while (true);
    }
    //显示爱好者菜单
    public void showAmateurMenu(){
        do {
            System.out.println("---爱好者天堂---");
            System.out.println("*************************************");
            System.out.println("1.商品\n2.运动员\n3.返回上一层");
            System.out.println("*************************************");
            System.out.println("请输入数字,按0退出");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("球拍");
                    break;
                case 2:
                    System.out.println("球鞋");
                    break;
                case 3:
                    System.out.println("运动员");
                    break;
                case 4:
                    //返回上一级
                    return;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("输入错误");
                    break;
            }
        }while (true);
    }
    //展示商品
    public void showProductsMenu(){
        do{
                System.out.println("""
                ---商品清单---
                1.球拍
                2.球鞋
                3.已选球拍
                4.已选球鞋
                5.返回上一级
                """);

        int choice= input.nextInt();
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
                return;    
            default:
                System.out.println("输入错误");
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
            switch (i) {
                case 1:
                    //ask user to type in the brand and get the brand
                    System.out.println("""
                        Type in the brand
                        (Yonex, Victor, Lining)""");
                    String nothing1=input.nextLine();
                    String brand = input.nextLine();
                    //ask user to type in the name and get the name
                    System.out.println("Type in the name");
                    String name = input.nextLine();
                    String nothing2=input.nextLine();
                    //ask user to type in the balance point and get it
                    System.out.println("""
                        Type in the balance point
                        (xxx milimeter,often between 280 to 320)""");
                    String BalancePoint = input.nextLine();
                    String nothing3=input.nextLine();
                    //ask user to type in the rigidity of handle and get it
                    System.out.println("""
                        Type in the rigidity of handle
                        (0 t 8)""");
                    String RigidityOfHandle = input.nextLine();
                    String nothing4=input.nextLine();
                    //ask user to type in the category and get it
                    System.out.println("""
                        Type in the category
                        (attack,balance,velocity)""");
                    String RacketCategory = input.nextLine();
                    String nothing5=input.nextLine();
                    ProductRacket productRacket = new ProductRacket(brand,name,BalancePoint,RigidityOfHandle,RacketCategory);
                    Productracket.add(productRacket);
                    break;
                case 0:
                    return;
            }
        }while (true);
    }
    public void ListRackets(){
        //print the information about the racket
        System.out.println("--Racket you have chosen:--");
        for (ProductRacket productRacket:Productracket){
            System.out.println("You choose "+productRacket.brand+"'s racket:" +
                    productRacket.name+",the balance point is "+
                    productRacket.BalancePoint+"mm"+",the rigidity of handle is "+
                    productRacket.RigidityOfHandle+
                    ","+productRacket.RacketCategory+" category.");
        }
    }
    public void showProductShoeMenu(){
    System.out.println("请输入品牌");
    String brand=input.nextLine();
    System.out.println("请输入名称");
    String name = input.nextLine();
    System.out.println("请输入类型");
    String type = input.nextLine();
    ProductShoe productShoe=new ProductShoe(brand,name,type);
    }

public void ListShoes(){
        //print the information about the shoes
        System.out.println("---您选择的羽毛球鞋有---");
        for (ProductShoe productShoe:Productshoe){
        System.out.println("You choose "+productShoe.brand+"'s shoes:"+
            productShoe.name+","+
            productShoe.ShoeCategory+" category.");
      }
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
        switch (choice){
            case 1:
                China();
            case 2:
                Japan();
            case 3:
                Korea();
            case 4:
                Malaysia();
            case 5:
                Denmark();
            case 6:
            case 0:
                System.exit(0);
        }
    }
    public void CreateClub(){

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


    }





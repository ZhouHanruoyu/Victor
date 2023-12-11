import java.util.Scanner;
public class Menu {
    public ProductRacket racket;
    public ProductShoe shoe;
    public Athlete athlete;
    public Club club;

    Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        new Menu();}
    public Menu(){
        this.athlete=new Athlete();
        this.racket=new ProductRacket();
        this.shoe=new ProductShoe();
        this.club=new Club();
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
            System.out.println("-----||Badminton World||-----");
            System.out.println("*************************************");
            System.out.println("1.Green hand\n2.Amateur\n3.Club\n0.Exit(Whenever you want to exit,type in 0.)");
            System.out.println("--------------------------------------------------");
            System.out.println("Please type in the number");
            System.out.println("Whenever the program stops, press Enter button to continue.");
            try {
                String IMPUT=input.nextLine().trim();
                int choice = Integer.parseInt(IMPUT);
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
                    System.out.println("Invalid option entered:"+choice);
                    System.out.println("Press any button to continue");
                    input.nextLine();
                    break;
            }
            }catch (Exception e){
                System.out.println("Invalid option entered.");
                input.nextLine();
            }
        }while (true);
    }
    public void showGreenhandMenu(){
        do {
            System.out.println("------Beginner Guide------");
            System.out.println("*************************************");
            System.out.println("1.Introduction\n2.Rules\n3.Equipment Recommendation and suggestion\n4.Return");
            System.out.println("-------------------------------------");
            System.out.println("Please type in the number,press 0 to exit.");
            try {
                String IMPUT=input.nextLine().trim();
                int choice = Integer.parseInt(IMPUT);
                input.nextLine();
                switch (choice) {
                    case 1:
                        Introduction.printIntroduction();
                        input.nextLine();
                        break;
                    case 2:
                        Rules.printRules();
                        break;
                    case 3:
                        Recommend.printRecommend();
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
            }catch (Exception e){
                System.out.println("Invalid option entered.");
                input.nextLine();
            }
        }while (true);
    }
    //show Amateur Menu
    public void showAmateurMenu(){
        do {
            System.out.println("---Paradise for Amateur---");
            System.out.println("*************************************");
            System.out.println("1.Products\n2.Athlete\n3.return");
            System.out.println("*************************************");
            System.out.println("Please type in the number,press 0 to exit.");
        try {
            String IMPUT=input.nextLine().trim();
            int choice = Integer.parseInt(IMPUT);
            switch (choice) {
                case 1:
                    showProductsMenu();
                    break;
                case 2:
                    athlete.showAthlete(input);
                    break;
                case 3:
                    //return to last menu
                    return;
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                default :
                    System.out.println("Invalid option entered:");
                    break;
              }
            }catch (Exception e){
                System.out.println("Invalid option entered.");
                input.nextLine();
            }
        }while (true);
    }
    //show products menu
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
        try {
            String IMPUT=input.nextLine().trim();
            int choice=Integer.parseInt(IMPUT);
        switch (choice){
            case 1:
                racket.showProductRacketMenu(input);
                break;
            case 2:
                shoe.showProductShoeMenu(input);
                break;
            case 3:
                racket.ListRackets(input);
                break;
            case 4:
                shoe.ListShoes(input);
                break;
            case 5:
                racket.DeleteRacket(input);
                break;
            case 6:
                shoe.DeleteShoes(input);
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
        }catch (Exception e) {
            System.out.println("Invalid option entered.");
            input.nextLine();
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
            try {
                String IMPUT=input.nextLine();
                int choice=Integer.parseInt(IMPUT);
                input.nextLine();
                switch (choice){
                    case 1:
                        club.CreateClub(input);
                        break;
                    case 2:
                        club.AddClubMembers(input);
                        break;
                    case 3:
                        club.DissolveClub(input);
                        break;
                    case 4:
                        club.ExitClub(input);
                        break;
                    case 5:
                        club.ListClubAndMembers(input);
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
            }catch (Exception e){
                System.out.println("Invalid option entered.");
                input.nextLine();
            }
        }while (true);
    }
}

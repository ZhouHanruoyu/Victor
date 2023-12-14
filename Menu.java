import java.util.Scanner;
public class Menu {
    /*
    Declare and create objects of classes:
    "Recommend"/"Athlete"/"ProductRacket"/"ProductShoe"/"Club"
    */
    public Equipment equipment;
    public PurchaseRacket racket;
    public PurchaseShoe shoe;
    public Athlete athlete;
    public Club club;
    //import Scanner and create an object "input" of Scanner
    Scanner input=new Scanner(System.in);
    // create an object of class "Menu"
    public static void main(String[] args){
        new Menu();
    }
    //initialize the objects of all the other classes
    public Menu(){
        this.equipment=new Equipment();
        this.athlete=new Athlete();
        this.racket=new PurchaseRacket();
        this.shoe=new PurchaseShoe();
        this.club=new Club();
        showMainMenu();
    }
    /*
    show main menu
    there exists three functions in main menu:
    green hands' beginner guide,amateur viewing,club management.
    whenever you want to exit program,press 0 .
    To avoid bugs, I use many "input.nextLine()" functions,
    so press Enter button to continue when the program stops.
    */
    public void showMainMenu(){
        //use an endless loop to ensure the menu can print repeatedly until user want to exit
        //all the following or in other classes endless loops target same goal
        do {
            //print the main menu
            System.out.println(M.cyan+"---------\u001B[4m\u001B[1m||Badminton World||\u001B[0m\u001B[36m---------"+M.stop);
            System.out.println(M.cyanbackground+M.blue+"|--------------------------------------"+M.stop);
            System.out.println(M.green+"|\u001B[3m\u001B[4m1.Green hand"+M.stop+M.blue+"\n|\u001B[3m\u001B[4m2.Amateur" +M.stop+
                    M.yellow+"\n|\u001B[3m\u001B[4m3.Club"+M.stop+M.purple+"\n|\u001B[3m\u001B[4m4.Purchase"+M.stop
                    +M.red+"\n|\u001B[3m\u001B[4m0.Exit"+M.stop+"\n|(Whenever you want to exit,type in 0.)");
            System.out.println(M.cyanbackground+M.blue+"--------------------------------------"+M.stop);
            System.out.println(M.italic+M.white+"Please type in the number."+M.stop);
            System.out.println(M.italic+M.white+"Whenever the program stops,"+M.stop);
            System.out.println(M.italic+M.white+"press Enter button to continue."+M.stop);
            //use try/catch sentence to monitor potential exception,
            // such as the type difference between what user type in and what I have declared
            try {
                /*To avoid bugs,I declare the original variable in String type,
                then change it to Integer,and assign it to "choice"
                ".trim()" is used to delete blanks at both ends and line break
                */
                String IMPUT=input.nextLine().trim();
                int choice = Integer.parseInt(IMPUT);
                // Check the user's choice and navigate to the corresponding menu or action
            switch (choice) {
                //all the functions of secondary-menu is stored in class "Menu"
                case 1:
                    showGreenhandMenu();
                    break;
                case 2:
                    showAmateurMenu();
                    break;
                case 3:
                    ClubManagement();
                    break;
                case 4:
                    showPurchaseMenu();
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                    //monitor if the user's input is beyond what I have installed
                default :
                    System.out.println(M.red+"Invalid option entered:"+M.stop+M.strikethrough+choice+M.stop);
                    System.out.println(M.white+"Press any button to continue"+M.stop);
                    input.nextLine();
                    break;
            }
            //remind user and ask them to type in again
            }catch (Exception e){
                System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                input.nextLine();
            }
        }while (true);
    }
    //show Green hand Menu
    public void showGreenhandMenu(){
        //the beginning is same to the aforementioned comment
        do {
            System.out.println(M.green+"----------\u001B[4m\u001B[1m||Beginner Guide||\u001B[0m\u001B[32m-----------"+M.stop);
            System.out.println(M.white+M.greenbackground+"---------------------------------------"+M.stop);
            System.out.println(M.underline+M.italic+M.green+"1.Introduction"+M.stop
                    +M.blue+M.underline+M.italic+"\n2.Rules"+M.stop
                    +M.yellow+M.underline+M.italic+"\n3.Equipment Recommendation and suggestion"+M.stop
                    +M.italic+M.underline+M.black+"\n4.Return"+M.stop);
            System.out.println(M.white+M.greenbackground+"---------------------------------------"+M.stop);
            System.out.println(M.italic+M.white+"Please type in the number."+M.stop);
            System.out.println(M.italic+M.white+"Whenever the program stops,"+M.stop);
            System.out.println(M.italic+M.white+"press Enter button to continue."+M.stop);
            try {
                String IMPUT=input.nextLine().trim();
                int choice = Integer.parseInt(IMPUT);
                input.nextLine();
                switch (choice) {
                    case 1:
                        //call the static function "printIntroduction" stored in class "Introduction"
                        Introduction.printIntroduction();
                        break;
                    case 2:
                        //call the static function "printRules" stored in class "Rules"
                        Rules.printRules();
                        break;
                    case 3:
                        //call the static function "printRecommend" stored in class "Recommend"
                        Recommend.printRecommend();
                        break;
                    case 4:
                        //return to the previous menu
                        return;
                    case 0:
                        System.out.println("Thank for using,see you!");
                        System.exit(0);
                    default :
                        System.out.println(M.red+"Invalid option entered:"+M.stop+M.strikethrough+choice+M.stop);
                        System.out.println(M.white+"Press any button to continue"+M.stop);
                        input.nextLine();
                        break;
                }
            }catch (Exception e){
                System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                input.nextLine();
            }
        }while (true);
    }
    //show Amateur Menu
    public void showAmateurMenu(){
        do {
            System.out.println(M.blue+"------\u001B[4m\u001B[1m||Paradise for Amateur||\u001B[0m\u001B[34m------"+M.stop);
            System.out.println(M.cyan+M.bluebackground+"-------------------------------------"+M.stop);
            System.out.println(M.italic+M.underline+M.cyan+"1.Products"+M.stop
                            +M.italic+M.underline+M.yellow+"\n2.Athlete"+M.stop
                            +M.italic+M.underline+M.black+"\n3.return"+M.stop);
            System.out.println(M.cyan+M.bluebackground+"-------------------------------------"+M.stop);
            System.out.println(M.italic+M.white+"Please type in the number."+M.stop);
            System.out.println(M.italic+M.white+"Whenever the program stops,"+M.stop);
            System.out.println(M.italic+M.white+"press Enter button to continue."+M.stop);
        try {
            String IMPUT=input.nextLine().trim();
            int choice = Integer.parseInt(IMPUT);
            switch (choice) {
                case 1:
                    equipment.showEquipmentsMenu(input);
                    break;
                case 2:
                    athlete.showAthleteMenu(input);
                    break;
                case 3:
                    //return to last menu
                    return;
                case 0:
                    System.out.println("Thank for using,see you!");
                    System.exit(0);
                default :
                    System.out.println(M.red+"Invalid option entered:"+M.stop+M.strikethrough+choice+M.stop);
                    System.out.println(M.white+"Press any button to continue"+M.stop);
                    input.nextLine();
                    break;
              }
            }catch (Exception e){
            System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
            input.nextLine();
        }
        }while (true);

    }
    public void ClubManagement(){
        do {
            System.out.println(M.yellow+"---\u001B[4m\u001B[1m||Club Management System||\u001B[0m\u001B[33m---"+M.stop);
            System.out.println(M.yellowbackground+M.white+"-------------------------------------"+M.stop);
            System.out.println(M.red+M.italic+M.underline+"1.Create a new club"+M.stop);
            System.out.println(M.red+M.italic+M.underline+"2.Participate in existed club"+M.stop);
            System.out.println(M.green+M.italic+M.underline+"3.Dissolve a club"+M.stop);
            System.out.println(M.green+M.italic+M.underline+"4.Exit from a club"+M.stop);
            System.out.println(M.yellow+M.italic+M.underline+"5.List clubs stored"+M.stop);
            System.out.println(M.black+M.italic+M.underline+"6.return"+M.stop);
            System.out.println(M.yellowbackground+M.white+"-------------------------------------"+M.stop);
            System.out.println(M.italic+M.white+"Please type in the number."+M.stop);
            System.out.println(M.italic+M.white+"Whenever the program stops,"+M.stop);
            System.out.println(M.italic+M.white+"press Enter button to continue."+M.stop);
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
                        System.out.println(M.red+"Invalid option entered:"+M.stop+M.strikethrough+choice+M.stop);
                        System.out.println(M.white+"Press any button to continue"+M.stop);
                        input.nextLine();
                        break;
                }
            }catch (Exception e){
                System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                input.nextLine();
            }
        }while (true);
    }
    //show products menu
    public void showPurchaseMenu(){
        do{
            System.out.println(M.purple+"-----\u001B[4m\u001B[1m||Products list||\u001B[0m\u001B[35m-----"+M.stop);
            System.out.println(M.purplebackground+M.blue+"-------------------------------------"+M.stop);
            System.out.println(M.red+M.italic+M.underline+"1.Racket"+M.stop);
            System.out.println(M.green+M.italic+M.underline+"2.Shoes"+M.stop);
            System.out.println(M.red+M.italic+M.underline+"3.List chosen racket"+M.stop);
            System.out.println(M.green+M.italic+M.underline+"4.List chosen shoes"+M.stop);
            System.out.println(M.red+M.italic+M.underline+"5.Delete racket"+M.stop);
            System.out.println(M.green+M.italic+M.underline+"6.Delete shoes"+M.stop);
            System.out.println(M.black+M.italic+M.underline+"7.return"+M.stop);
            System.out.println(M.purplebackground+M.blue+"-------------------------------------"+M.stop);
            System.out.println(M.italic+M.white+"Please type in the number."+M.stop);
            System.out.println(M.italic+M.white+"Whenever the program stops,"+M.stop);
            System.out.println(M.italic+M.white+"press Enter button to continue."+M.stop);
        try {
            String IMPUT=input.nextLine().trim();
            int choice=Integer.parseInt(IMPUT);
        switch (choice){
            case 1:
                racket.showPurchaseRacketMenu(input);
                break;
            case 2:
                shoe.showPurchaseShoeMenu(input);
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
                System.out.println(M.red+"Invalid option entered:"+M.stop+M.strikethrough+choice+M.stop);
                System.out.println(M.white+"Press any button to continue"+M.stop);
                input.nextLine();
                break;
        }
        }catch (Exception e){
            System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
            input.nextLine();
        }
       }while (true);
    }


}





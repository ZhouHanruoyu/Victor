import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PurchaseRacket{
    public  String brand;
    public  String name;
    public  double BalancePoint;
    public  int RigidityOfShaft;
    public  String RacketCategory;
    //port"List" to store and call information more convenient
    //create a new object of List
    public List<PurchaseRacket> PurchaseRacket;
    //assign PurchaseRacket as an ArrayList
    public PurchaseRacket(){
        this.PurchaseRacket=new ArrayList<>();
    }

    public PurchaseRacket(String brand,String name,double BalancePoint,int RigidityOfShaft,String RacketCategory) {
        this.brand = brand;
        this.name = name;
        this.BalancePoint = BalancePoint;
        this.RigidityOfShaft = RigidityOfShaft;
        this.RacketCategory = RacketCategory;
    }
    public void showPurchaseRacketMenu(Scanner input) {
        //same to menus in class"Menu"
        do {
            System.out.println("""
                    \u001B[35m----------------------------\u001B[0m
                    \u001B[4m\u001B[1mRackets List:
                    Press the button to continue\u001B[0m
                    |\u001B[3m1.Add rackets you want to purchase\u001B[0m
                    |\u001B[3m2.Modify chosen rackets\u001B[0m
                    |\u001B[3m3.List chosen rackets\u001B[0m
                    |\u001B[3m4.Delete chosen rackets\u001B[0m
                    |\u001B[3m5.Return\u001B[0m
                    \u001B[35m----------------------------\u001B[0m
                    """);
            try {
                int choice=input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        AddRacket(input);
                        break;
                    case 2:
                        ModifyRacket(input);
                        break;
                    case 3:
                        ListRackets(input);
                        break;
                    case 4:
                        DeleteRacket(input);
                        break;
                    case 5:
                        return;
                    case 0:
                        System.out.println(M.bold+"Thank for using,see you!"+M.stop);
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
    public void AddRacket(Scanner input){
        //use many if sentence to judge if user's import is correct
        //use many try/catch sentence to monitor the possible fault
        //ask user to type in the brand and get the brand
        String brand="";
        boolean InvalidBrand=false;
        while (!InvalidBrand){
            System.out.println("""
                                    -----------------
                                    \u001B[3mType in the brand\u001B[0m
                                    \u001B[1m(Yonex, Victor, Lining)\u001B[0m""");
            brand = input.nextLine().trim();
            if (brand.equalsIgnoreCase("Yonex")||
                    brand.equalsIgnoreCase("Victor")||
                    brand.equalsIgnoreCase("Lining")){
                InvalidBrand=true;
            }
            else {
                System.out.println("""
                                        \u001B[31mThe brand isn't existed in our project,sorry.
                                        Please type in the correct brand,thanks.\u001B[0m
                                        """);
            }
        }
        //ask user to type in the name and get the name
        System.out.println("\u001B[3mType in the name\u001B[0m");
        String name = input.nextLine().trim();
        //ask user to type in the balance point and get it

        double BalancePoint=0.0;
        boolean InvalidBalancePoint=false;
        while (!InvalidBalancePoint){
            input.nextLine();
            System.out.println("""
                                    \u001B[3mType in the balance point\u001B[0m
                                    \u001B[1m(xxx milimeter,often between 280 to 320)\u001B[0m""");
            try {
                BalancePoint = input.nextDouble();
            }catch (Exception e){
                System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                input.nextLine();
            }
            if (BalancePoint<=320 && BalancePoint>=280) {
                InvalidBalancePoint = true;
            }
            else {
                System.out.println("""
                                        \u001B[31mInvalid Balance Point,
                                        Please type in valid number ranges from 280 to 320,thanks.\u001B[0m
                                        """);
            }
        }
        //ask user to type in the rigidity of handle and get it
        input.nextLine();
        int RigidityOfShaft=0;
        boolean InvalidRigidity=false;
        while (!InvalidRigidity){
            System.out.println("""
                                    \u001B[3mType in the rigidity of shaft\u001B[0m
                                    \u001B[1m(1 t 9)\u001B[0m""");
            try {
                RigidityOfShaft = input.nextInt();
            }catch (Exception e) {
                System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                input.nextLine();
            }
            if (RigidityOfShaft>=1 && RigidityOfShaft<=9){
                InvalidRigidity=true;
            }
            else {
                System.out.println("""
                                        \u001B[31mInvalid Rigidity of shaft,
                                        Please type in valid number ranges from 1 to 9,thanks.\u001B[0m
                                        """);
            }
        }
        //ask user to type in the category and get it
        input.nextLine();
        String RacketCategory="";
        boolean InvalidCategory=false;
        while (!InvalidCategory){
            System.out.println("""
                                    \u001B[3mType in the category\u001B[0m
                                    \u001B[1m(attack,balance,velocity)\u001B[0m""");
            RacketCategory = input.nextLine().trim();
            if (RacketCategory.equalsIgnoreCase("attack")||
                    RacketCategory.equalsIgnoreCase("balance")||
                    RacketCategory.equalsIgnoreCase("velocity")){
                InvalidCategory=true;
            }
            else {
                System.out.println("""
                                        \u001B[31mInvalid category,
                                        Please type in correct category,thanks.\u001B[0m
                                        """);
            }
        }
        System.out.println(M.white+"Press any button to continue"+M.stop);
        input.nextLine();
        //assign "ProductRacket"
        PurchaseRacket purchaseRacket = new PurchaseRacket(brand,name,BalancePoint,RigidityOfShaft,RacketCategory);
        //add"ProductRacket" to the arraylist"Productracket"
        PurchaseRacket.add(purchaseRacket);
    }
    public void ModifyRacket(Scanner input) {
        //the function of modify the racket stored
        if (PurchaseRacket.isEmpty()) {
            System.out.println(M.red + M.bold + "There are no rackets in your shopping cart." + M.stop);
            return;
        }
        //list the chosen racket first
        ListRackets(input);
        System.out.println(
                M.bold + "Type in the number (1 to " + PurchaseRacket.size() + ") before the racket you want to modify:" + M.stop
        );
        //then rely on user's import to find which racket to modify
        try {
            int modifyNumber1 = input.nextInt();
            input.nextLine();
            if (modifyNumber1 >= 1 && modifyNumber1 <= PurchaseRacket.size()) {
                PurchaseRacket purchaseRacket = PurchaseRacket.get(modifyNumber1 - 1);

                System.out.println(M.italic + "Modifying racket: " + purchaseRacket.brand + "'s racket " +
                        purchaseRacket.name + ", the balance point is " +
                        purchaseRacket.BalancePoint + "mm, the rigidity of handle is " +
                        purchaseRacket.RigidityOfShaft +
                        ", " + purchaseRacket.RacketCategory + " category." + M.stop);
                //same to "AddRacket"
                String brand="";
                boolean InvalidBrand=false;
                while (!InvalidBrand){
                    System.out.println("""
                                    -----------------
                                    \u001B[3mType in the brand\u001B[0m
                                    \u001B[1m(Yonex, Victor, Lining)\u001B[0m""");
                    brand = input.nextLine().trim();
                    if (brand.equalsIgnoreCase("Yonex")||
                            brand.equalsIgnoreCase("Victor")||
                            brand.equalsIgnoreCase("Lining")){
                        InvalidBrand=true;
                    }
                    else {
                        System.out.println("""
                                        \u001B[31mThe brand isn't existed in our project,sorry.
                                        Please type in the correct brand,thanks.\u001B[0m
                                        """);
                    }
                }
                //ask user to type in the name and get the name
                System.out.println("\u001B[3mType in the name\u001B[0m");
                String name = input.nextLine().trim();
                //ask user to type in the balance point and get it

                double BalancePoint=0.0;
                boolean InvalidBalancePoint=false;
                while (!InvalidBalancePoint){
                    input.nextLine();
                    System.out.println("""
                                    \u001B[3mType in the balance point\u001B[0m
                                    \u001B[1m(xxx milimeter,often between 280 to 320)\u001B[0m""");
                    try {
                        BalancePoint = input.nextDouble();
                    }catch (Exception e){
                        System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                        input.nextLine();
                    }
                    if (BalancePoint<=320 && BalancePoint>=280) {
                        InvalidBalancePoint = true;
                    }
                    else {
                        System.out.println("""
                                        \u001B[31mInvalid Balance Point,
                                        Please type in valid number ranges from 280 to 320,thanks.\u001B[0m
                                        """);
                    }
                }
                //ask user to type in the rigidity of handle and get it
                input.nextLine();
                int RigidityOfShaft=0;
                boolean InvalidRigidity=false;
                while (!InvalidRigidity){
                    System.out.println("""
                                    \u001B[3mType in the rigidity of shaft\u001B[0m
                                    \u001B[1m(1 t 9)\u001B[0m""");
                    try {
                        RigidityOfShaft = input.nextInt();
                    }catch (Exception e) {
                        System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                        input.nextLine();
                    }
                    if (RigidityOfShaft>=1 && RigidityOfShaft<=9){
                        InvalidRigidity=true;
                    }
                    else {
                        System.out.println("""
                                        \u001B[31mInvalid Rigidity of shaft,
                                        Please type in valid number ranges from 1 to 9,thanks.\u001B[0m
                                        """);
                    }
                }
                //ask user to type in the category and get it
                input.nextLine();
                String RacketCategory="";
                boolean InvalidCategory=false;
                while (!InvalidCategory){
                    System.out.println("""
                                    \u001B[3mType in the category\u001B[0m
                                    \u001B[1m(attack,balance,velocity)\u001B[0m""");
                    RacketCategory = input.nextLine().trim();
                    if (RacketCategory.equalsIgnoreCase("attack")||
                            RacketCategory.equalsIgnoreCase("balance")||
                            RacketCategory.equalsIgnoreCase("velocity")){
                        InvalidCategory=true;
                    }
                    else {
                        System.out.println("""
                                        \u001B[31mInvalid category,
                                        Please type in correct category,thanks.\u001B[0m
                                        """);
                    }
                }
                System.out.println(M.white+"Press any button to continue"+M.stop);
                input.nextLine();
                //assign "ProductRacket"
                PurchaseRacket modifyracket = new PurchaseRacket(brand,name,BalancePoint,RigidityOfShaft,RacketCategory);
                //add"ProductRacket" to the arraylist"Productracket"
                //set()method to modify racket
                PurchaseRacket.set(modifyNumber1-1,modifyracket);

                System.out.println(M.red + "Racket information modified successfully. Press any button to continue." + M.stop);
                input.nextLine();
            } else {
                System.out.println(M.red + "Invalid racket number entered. Press any button to continue." + M.stop);
                input.nextLine();
            }
        } catch (Exception e) {
            System.out.println(M.red + "Invalid option entered." + M.stop + M.strikethrough + e + M.stop);
            input.nextLine();
        }
    }
    public void ListRackets(Scanner input){
        //print the information about the racket
        //get the amounts of product
        int size1=PurchaseRacket.size();
        if (size1==0){
            input.nextLine();
            System.out.println(M.red+M.bold+"You haven't chosen any racket."+M.stop);
        }
        else {
            input.nextLine();
            System.out.println(M.bold+"----Racket you have chosen:----"+M.stop);
            //walk through the arraylist"Productracket"
            //foreach loop
            for (int i = 0; i < PurchaseRacket.size(); i++) {
                PurchaseRacket purchaseRacket = PurchaseRacket.get(i);
                System.out.println(M.italic+"(" + (i+1) + ")" + purchaseRacket.brand + "'s racket:" +
                        purchaseRacket.name + ",the balance point is " +
                        purchaseRacket.BalancePoint + "mm" + ",the rigidity of handle is " +
                        purchaseRacket.RigidityOfShaft +
                        "," + purchaseRacket.RacketCategory + " category." + "\n"+M.stop
                );

            }
            System.out.println(M.bold+"You have chosen " + size1 + " rackets."+M.stop);
            System.out.println(M.white+"Press any button to continue"+M.stop);
            input.nextLine();
        }
    }

    public void DeleteRacket(Scanner input){
        //same as "ModifyRacket" just change modify to delete
        while (true){
        if (PurchaseRacket.isEmpty()){
            System.out.println(M.red+M.bold+"Their exists no racket in your shopping cart."+M.stop);
            return;
        }
        ListRackets(input);
        System.out.println(
                M.bold+"Type in the number (1 to "+PurchaseRacket.size()+"),before the rackets you want to delete."+M.stop
        );
        try {
            int deletenumber1=input.nextInt();
            input.nextLine();
            if (deletenumber1>=1 && deletenumber1<=PurchaseRacket.size()){
                //remove()method to delete racket
                PurchaseRacket.remove(deletenumber1-1);
                System.out.println(M.red+"Delete successfully, press any button to continue."+M.stop);
                input.nextLine();
                break;
            }
            else {
                System.out.println(M.red+"Delete unsuccessfully, try again and ensure you have enter true number."+M.stop);
                System.out.println(M.white+"Press any button to continue"+M.stop);
                input.nextLine();
                break;
            }
        }catch (Exception e){
            System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
            input.nextLine();
        }
     }
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public double getBalancePoint() {
        return BalancePoint;
    }

    public int getRigidityOfShaft() {
        return RigidityOfShaft;
    }

    public String getRacketCategory() {
        return RacketCategory;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalancePoint(double balancePoint) {
        BalancePoint = balancePoint;
    }

    public void setRigidityOfShaft(int rigidityOfShaft) {
        RigidityOfShaft = rigidityOfShaft;
    }

    public void setRacketCategory(String racketCategory) {
        RacketCategory = racketCategory;
    }
}



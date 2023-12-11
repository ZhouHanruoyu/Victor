import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRacket {
    public  String brand;
    public  String name;
    public  double BalancePoint;
    public  int RigidityOfShaft;
    public  String RacketCategory;
    public List<ProductRacket> Productracket;

    public ProductRacket(){
        this.Productracket=new ArrayList<>();
    }

    public ProductRacket(String brand,String name,double BalancePoint,int RigidityOfShaft,String RacketCategory) {
        this.brand = brand;
        this.name = name;
        this.BalancePoint = BalancePoint;
        this.RigidityOfShaft = RigidityOfShaft;
        this.RacketCategory = RacketCategory;
        ;
    }
    public void showProductRacketMenu(Scanner input) {
        do {
            System.out.println("""
                    ----------------------------
                    Choose the rackets
                    Press the button to continue
                    1.Type in the information
                    0.Exit
                    ----------------------------
                    """);
            try {
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
                            input.nextLine();
                            System.out.println("""
                        Type in the balance point
                        (xxx milimeter,often between 280 to 320)""");
                            try {
                                BalancePoint = input.nextDouble();
                            }catch (Exception e) {
                                System.out.println("Invalid option entered.");
                                input.nextLine();
                            }
                            if (BalancePoint<=320 && BalancePoint>=280) {
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
                        int RigidityOfShaft=0;
                        boolean InvalidRigidity=false;
                        while (!InvalidRigidity){
                            System.out.println("""
                        Type in the rigidity of shaft
                        (1 t 8)""");
                            try {
                                RigidityOfShaft = input.nextInt();
                            }catch (Exception e) {
                                System.out.println("Invalid option entered.");
                                input.nextLine();
                            }
                            if (RigidityOfShaft>=1 && RigidityOfShaft<=8){
                                InvalidRigidity=true;
                            }
                            else {
                                System.out.println("""
                                    Invalid Rigidity of shaft,
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
                        ProductRacket productRacket = new ProductRacket(brand,name,BalancePoint,RigidityOfShaft,RacketCategory);
                        //add"ProductRacket" to the arraylist"Productracket"
                        Productracket.add(productRacket);
                        break;
                    case 0:
                        return;
                    default :
                        System.out.println("Invalid option entered:");
                        return;
                }
            }catch (Exception e) {
                System.out.println("Invalid option entered.");
                input.nextLine();
            }
        }while (true);
    }
    public void ListRackets(Scanner input){
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
                System.out.println("(" + (i+1) + ")" + productracket.brand + "'s racket:" +
                        productracket.name + ",the balance point is " +
                        productracket.BalancePoint + "mm" + ",the rigidity of handle is " +
                        productracket.RigidityOfShaft +
                        "," + productracket.RacketCategory + " category." + "\n"
                );

            }
            System.out.println("You have chosen " + size1 + " rackets.");
            System.out.println("Press ant button to continue.");
            input.nextLine();
        }
    }

    public void DeleteRacket(Scanner input){
        while (true){
        if (Productracket.isEmpty()){
            System.out.println("Their exists no racket in your shopping cart.");
            return;
        }
        ListRackets(input);
        System.out.println(
                "Type in the number (1 to "+Productracket.size()+"),before the rackets you want to delete."
        );
        try {
            int deletenumber1=input.nextInt();

            input.nextLine();
            if (deletenumber1>=1 && deletenumber1<=Productracket.size()){
                Productracket.remove(deletenumber1-1);
                System.out.println("Delete successfully, press any button to continue.");
                input.nextLine();
                break;
            }
            else {
                System.out.println("Delete unsuccessfully, try again and ensure you have enter true number.");
                System.out.println("Press any button to continue.");
                input.nextLine();
                break;
            }
        }catch (Exception e) {
            System.out.println("Invalid option entered.");
            input.nextLine();
            break;
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



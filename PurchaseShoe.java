import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PurchaseShoe {
    public String brand;
    public String name;
    public String ShoeCategory;
    public List<PurchaseShoe> PurchaseShoe;
    public PurchaseShoe(){
        this.PurchaseShoe=new ArrayList<>();
    }
    public PurchaseShoe(String brand,String name,String ShoeCategory){
        this.brand=brand;
        this.name=name;
        this.ShoeCategory=ShoeCategory;
    }
    //same to class"PurchaseRacket"
    public void showPurchaseShoeMenu(Scanner input) {
        do {
            System.out.println("""
                    \u001B[35m----------------------------\u001B[0m
                    \u001B[4m\u001B[1mShoes List:
                    Press the button to continue\u001B[0m
                    |\u001B[3m1.Add shoes you want to purchase\u001B[0m
                    |\u001B[3m2.Modify chosen shoes\u001B[0m
                    |\u001B[3m3.List chosen shoes\u001B[0m
                    |\u001B[3m4.Delete chosen shoes\u001B[0m
                    |\u001B[3m5.Return\u001B[0m
                    \u001B[35m----------------------------\u001B[0m
                    """);
            try {
                int choice=input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        AddShoes(input);
                        break;
                    case 2:
                        ModifyShoes(input);
                        break;
                    case 3:
                        ListShoes(input);
                        break;
                    case 4:
                        DeleteShoes(input);
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
    public void AddShoes(Scanner input){
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


        //ask user to type in the category and get it
        input.nextLine();
        String ShoeCategory="";
        boolean InvalidCategory=false;
        while (!InvalidCategory){
            System.out.println("""
                                    \u001B[3mType in the category\u001B[0m
                                    \u001B[1m(protect,comprehensive,balance,velocity)\u001B[0m""");
            ShoeCategory = input.nextLine().trim();
            if (ShoeCategory.equalsIgnoreCase("protect")||
                    ShoeCategory.equalsIgnoreCase("comprehensive")||
                    ShoeCategory.equalsIgnoreCase("balance")||
                    ShoeCategory.equalsIgnoreCase("velocity")){
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
        PurchaseShoe purchaseShoe = new PurchaseShoe(brand,name,ShoeCategory);
        //add"ProductRacket" to the arraylist"Productracket"
        PurchaseShoe.add(purchaseShoe);
    }
    public void ModifyShoes(Scanner input) {
        if (PurchaseShoe.isEmpty()) {
            System.out.println(M.red + M.bold + "There are no rackets in your shopping cart." + M.stop);
            return;
        }

        ListShoes(input);

        System.out.println(
                M.bold + "Type in the number (1 to " + PurchaseShoe.size() + ") before the racket you want to modify:" + M.stop
        );
        try {
            int modifyNumber2 = input.nextInt();
            input.nextLine();
            if (modifyNumber2 >= 1 && modifyNumber2 <= PurchaseShoe.size()) {
                PurchaseShoe purchaseShoe = PurchaseShoe.get(modifyNumber2 - 1);

                System.out.println(M.italic + "Modifying racket: " + purchaseShoe.brand + "'s racket " +
                        purchaseShoe.name  + purchaseShoe.ShoeCategory + " category." + M.stop);

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


                //ask user to type in the category and get it
                input.nextLine();
                String ShoeCategory="";
                boolean InvalidCategory=false;
                while (!InvalidCategory){
                    System.out.println("""
                                    \u001B[3mType in the category\u001B[0m
                                    \u001B[1m(protect,comprehensive,balance,velocity)\u001B[0m""");
                    ShoeCategory = input.nextLine().trim();
                    if (ShoeCategory.equalsIgnoreCase("protect")||
                            ShoeCategory.equalsIgnoreCase("comprehensive")||
                            ShoeCategory.equalsIgnoreCase("balance")||
                            ShoeCategory.equalsIgnoreCase("velocity")) {
                        InvalidCategory = true;
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
                PurchaseShoe modifyshoe = new PurchaseShoe(brand,name,ShoeCategory);
                //add"ProductRacket" to the arraylist"Productracket"
                PurchaseShoe.set(modifyNumber2-1,modifyshoe);

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
    public void ListShoes(Scanner input){
        //print the information about the racket
        //get the amounts of product
        int size1=PurchaseShoe.size();
        if (size1==0){
            input.nextLine();
            System.out.println(M.red+M.bold+"You haven't chosen any racket."+M.stop);
        }
        else {
            input.nextLine();
            System.out.println(M.bold+"----Racket you have chosen:----"+M.stop);
            //walk through the arraylist"Productracket"
            //foreach loop
            for (int i = 0; i < PurchaseShoe.size(); i++) {
                PurchaseShoe purchaseShoe = PurchaseShoe.get(i);
                System.out.println(M.italic+"(" + (i+1) + ")" + purchaseShoe.brand + "'s racket:" +
                        purchaseShoe.name +
                        "," + purchaseShoe.ShoeCategory + " category." + "\n"+M.stop
                );

            }
            System.out.println(M.bold+"You have chosen " + size1 + " rackets."+M.stop);
            System.out.println(M.white+"Press any button to continue"+M.stop);
            input.nextLine();
        }
    }

    public void DeleteShoes(Scanner input){
        while (true){
            if (PurchaseShoe.isEmpty()){
                System.out.println(M.red+M.bold+"Their exists no racket in your shopping cart."+M.stop);
                return;
            }
            ListShoes(input);
            System.out.println(
                    M.bold+"Type in the number (1 to "+PurchaseShoe.size()+"),before the rackets you want to delete."+M.stop
            );
            try {
                int deletenumber1=input.nextInt();
                input.nextLine();
                if (deletenumber1>=1 && deletenumber1<=PurchaseShoe.size()){
                    PurchaseShoe.remove(deletenumber1-1);
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

    public String getShoeCategory() {
        return ShoeCategory;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShoeCategory(String shoeCategory) {
        ShoeCategory = shoeCategory;
    }
}


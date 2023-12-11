import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductShoe {
    public String brand;
    public String name;
    public String ShoeCategory;
    public List<ProductShoe> Productshoe;
    public ProductShoe(){
        this.Productshoe=new ArrayList<>();
    }
    public ProductShoe(String brand,String name,String ShoeCategory){
        this.brand=brand;
        this.name=name;
        this.ShoeCategory=ShoeCategory;
    }
    public void showProductShoeMenu(Scanner input){
        do {
            System.out.println("""
                    Choose the badminton shoes
                    1.Type in the information
                    2.Exit
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
            }catch (Exception e) {
                System.out.println("Invalid option entered.");
                input.nextLine();
            }
        }while (true);
    }

    public void ListShoes(Scanner input){
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
    public void DeleteShoes(Scanner input){
        while (true){
        if (Productshoe.isEmpty()){
            System.out.println("Their exist no shoes in your shopping cart.");
            return;
        }
        ListShoes(input);
        System.out.println(
                "Type in the number (1 to "+Productshoe.size()+" ),before the shoes you want to delete."
        );
        try {
            int deletenumber2=input.nextInt();
            input.nextLine();
            if (deletenumber2>=1 && deletenumber2<=Productshoe.size()){
                Productshoe.remove(deletenumber2-1);
                System.out.println("Delete successfully,press any button to continue.");
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


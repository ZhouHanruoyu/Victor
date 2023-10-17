import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("The Car Project V1.0");
        Scanner input=new Scanner(System.in);
        Car car1=new Car();
        System.out.println("Enter a car make");
        String make = input.nextLine();
        System.out.println("Enter a car price");
        float price = input.nextFloat();

        car1.setMake(make);
        car1.setPrice(price);
        car1.display();
    }
}

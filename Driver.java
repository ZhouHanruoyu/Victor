import java.util.Scanner;

public class Driver {

    Spot spot;
    Scanner input = new Scanner(System.in);

    public static void main(String args[]){
     System.out.println("Spot console V1.0");
     new Driver();
    }
    Driver(){
        spot=new Spot();
        drawSpot();
    }
    private void drawSpot(){
        System.out.println("xCoord is : "+spot.xCoord);
        System.out.println("yCoord is : "+spot.yCoord);
        System.out.println("diameter is : "+spot.diameter);
    }
}

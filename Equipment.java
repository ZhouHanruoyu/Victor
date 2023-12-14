import java.util.Scanner;

public class Equipment {
    EquipmentInformation e=new EquipmentInformation();
    String[]racketinformation= e.racketInformation;
    public Equipment() {
    }

    public void showEquipmentsMenu(Scanner input) {
        while (true) {
            System.out.println("""
                    Please type in a number: 
                    \u001B[31m'1'\u001B[0m to search,
                    \u001B[31m'2'\u001B[0m to return,
                    \u001B[31m'0'\u001B[0m to exit.
                    \u001B[37m(just for search,if you want to buy any products,go to purchase)\u001B[0m
                    """);
            try {
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        EquipmentRacket(input);
                        break;
                    case 2:
                        return;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println(M.red+"Invalid option entered:"+M.stop+M.strikethrough+choice+M.stop);
                        System.out.println(M.white+"Press any button to continue"+M.stop);
                        input.nextLine();
                        break;
                }
            } catch (Exception e){
                System.out.println(M.red+"Invalid option entered."+M.stop+M.strikethrough+e+M.stop);
                input.nextLine();
            }
        }
    }
        public void EquipmentRacket(Scanner input) {
            String[] racket = {"Yonex-ASTROX", "Yonex-ARCSABER", "Yonex-VOLTRIC", "Yonex-DUORA", "Yonex-NANORAY" };
            while (true) {
                System.out.println("""
                        \u001B[1mType in the racket series to search\u001B[0m
                        \u001B[37m(input over to return):\u001B[0m
                        """);
                //assign what user type in to variable"search",trim()is to erase meaningless contents
                String search = input.nextLine().trim();

                //create boolean variable"compare" to judge if what user type in exists in my program
                boolean compare = false;
                String LowerCaseSearch = search.toLowerCase().trim();
                //when user type in "over",return to last menu,
                if (search.equalsIgnoreCase("over")) {
                    return;
                } else {
                    for (String rackets:racket) {
                        if (rackets.contains(search)) {
                            System.out.println(rackets);
                            compare = true;
                        } else if (rackets.contains(LowerCaseSearch)) {
                            System.out.println(rackets);
                            compare = true;
                        }
                    }
                }
                System.out.println(M.italic+"Enter the 'continue' get more information");
                String judge=input.nextLine().trim();
                if (judge.equalsIgnoreCase("continue")){
                    System.out.println("Please enter the specific name:"+M.stop);
                    String name=input.nextLine().trim();
                    for (int i=0;i<racket.length;i++) {
                        if (racket[i].equalsIgnoreCase(name)) {
                            System.out.println(racketinformation[i]);
                        }
                    }
                }

                if (!compare) {
                    System.out.println(M.red+M.bold+"Can't find the racket series you search"+M.stop);
                }
                System.out.println(M.white+"Press any button to continue(type in over to return)"+M.stop);
                String over=input.nextLine().trim();
                if (over.equalsIgnoreCase("over")){
                    return;
                }
            }
        }
}

import java.util.Scanner;

public class Athlete {
    public Athlete(){
    }
    public void showAthlete(Scanner input) {
        String[] player = {"Lin Dan", "Chen Long", "Shi Yu qi","Lee Chong wei","Victor Axelsen"};
        /*endless loop
        to make the function run repeatedly until user want to exit
        * */
        while (true) {
            System.out.println("""
                Press the athlete name to search(press over to return):
                """);
            //assign what user type in to variable"search",trim()is to erase meaningless contents
            String search = input.nextLine().trim();

            //create boolean variable"compare" to judge if what user type in exists in my program
            boolean compare=false;
            String LowerCaseSearch=search.toLowerCase();
            //when user type in "over",return to last menu,
            if (search.equalsIgnoreCase("over")) {
                return;
            }
            else{
                for (String players:player) {
                    if (players.contains(search)) {
                        System.out.println(players);
                        compare = true;
                    }else if (players.contains(LowerCaseSearch)){
                        System.out.println(players);
                        compare = true;
                    }
                }
            }
            if (!compare){
                System.out.println("Can't find the athlete you search");
            }
            System.out.println("Press any button to continue(press over to return)");
            input.nextLine();
        }
    }
}

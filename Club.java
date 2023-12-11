import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Club {
    public List<String> Club;
    public List<String>Members;
    public Club(){
        this.Club=new ArrayList<>();
        this.Members=new ArrayList<>();
    }
    public void CreateClub(Scanner input){
        input.nextLine();
        do {
            System.out.println("""
                -----------------
                Enter in number;
                Enter 1 to continue to create your club;
                Enter 0 to exit.
                """);
                int i= input.nextInt();
                input.nextLine();
                switch (i){
                    case 1:
                        System.out.println("Naming your club:");
                        String ClubName=input.nextLine();
                        Club.add(ClubName);
                        if (!Club.isEmpty()){
                            System.out.println("Club created successfully!");
                        }else {
                            System.out.println("Club haven't been created,please try again.");
                        }
                        break;
                    case 0:
                        return;
                }
        }while (true);
    }
    public void AddClubMembers(Scanner input){
        input.nextLine();
        for (int i = 0; i < Club.size(); i++) {
            System.out.println((i + 1) + ")" + Club.get(i));
        }
        System.out.println("Choose a club you want to enter and type in the number before it.");
        int index=input.nextInt();
        input.nextLine();
        System.out.println("Then type in your name,type over when finish");
        while (true) {
            String MemberName = input.nextLine();
            if (MemberName.equalsIgnoreCase("over")){
                break;
            }
            String membername = Club.get(index - 1) + "-" + MemberName;
            Members.add(membername);
        }
    }
    public void DissolveClub(Scanner input){
        input.nextLine();
        ListClubAndMembers(input);
        String dissolve;
        while (true) {
            System.out.println("""
                Press the member name to dissolve(press over to return):
                """);
            //assign what user type in to variable"search",trim()is to erase meaningless contents
            dissolve = input.nextLine().trim();

            //create boolean variable"compare" to judge if what user type in exists in my program
            boolean compare=false;
            String LowerCaseSearch=dissolve.toLowerCase();
            //when user type in "over",return to last menu,
            if (dissolve.equalsIgnoreCase("over")) {
                return;
            }
            else{
                for (int i=0;i< Members.size();i++) {
                    if (Members.contains(dissolve)) {
                        Members.remove(dissolve);
                        compare = true;
                    }else if (Members.contains(LowerCaseSearch)){
                        Members.remove(dissolve);
                        compare = true;
                    }
                }
            }
            if (!compare){
                System.out.println("Can't find the member you search");
            }
            System.out.println("Press any button to continue(press over to return)");
            input.nextLine();
        }
    }
    public void ListClubAndMembers(Scanner input){
        for (String member : Members) {
            System.out.println("Club:" + member);
        }
        input.nextLine();
    }
    public void ExitClub(Scanner input){
        input.nextLine();
        ListClubAndMembers(input);
        String exit;
        while (true) {
            System.out.println("""
            Type in the member name to dissolve(Type in 'over' to return):
            """);
            //assign what user type in to variable"search",trim()is to erase meaningless contents
            exit = input.nextLine().trim();

            //create boolean variable"compare" to judge if what user type in exists in my program
            boolean compare=false;
            String LowerCaseSearch=exit.toLowerCase();
            //when user type in "over",return to last menu,
            for (int i=0;i<Members.size();i++) {
                if (Members.get(i).contains(exit) || Members.get(i).toLowerCase().contains(LowerCaseSearch)) {
                    Members.remove(i);
                    compare = true;
                    break; // stop loop after removing one match
                }
            }

            if (!compare){
                System.out.println("Can't find the member you search");
            } else {
                System.out.println("Member has been removed successfully.");
            }

            System.out.println("Press any button to continue(press over to return)");
            String userInput = input.nextLine();
            if (userInput.equals("over")) {
                break; // exit loop if user inputs "over"
            }
        }
    }
}

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
                        \u001B[33m---------------------------------------\u001B[0m
                    Enter in number:
                    Enter \u001B[31m'1'\u001B[0m to continue to create your club;
                    Enter \u001B[31m'0'\u001B[0m to return.
                    \u001B[33m---------------------------------------\u001B[0m
                    """);
            try {
                int choice= input.nextInt();
                input.nextLine();
                switch (choice){
                    case 1:
                        System.out.println(M.underline+"Naming your club:"+M.stop);
                        String ClubName=input.nextLine().trim();
                        Club.add(ClubName);
                        if (!Club.isEmpty()){
                            System.out.println(M.red+"Club created successfully!"+M.stop);
                        }else {
                            System.out.println(M.red+"Club haven't been created,please try again."+M.stop);
                        }
                        break;
                    case 0:
                        return;
                    default:
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
    public void AddClubMembers(Scanner input){
        input.nextLine();
        for (int i = 0; i < Club.size(); i++) {
            System.out.println((i + 1) + ")" + Club.get(i));
        }
        System.out.println(M.underline+M.italic+"Choose a club you want to enter and type in the number before it."+M.stop);
        int index=input.nextInt();
        input.nextLine();
        System.out.println(M.underline+M.italic+"Then type in your name,type over when finish"+M.stop);
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
            System.out.println(M.underline+"Type in the club name to dissolve"+M.stop
                    +M.white+"\n(Type in 'over' to return):"+M.stop);
            //assign what user type in to variable"search",trim()is to erase meaningless contents
            dissolve = input.nextLine().trim();

            //create boolean variable"compare" to judge if what user type in exists in my program
            boolean compare=false;
            String LowerCaseSearch=dissolve.toLowerCase().trim();
            //when user type in "over",return to last menu,
            for (int i=0;i<Members.size();i++) {
                if (Members.get(i).contains(dissolve) || Members.get(i).toLowerCase().contains(LowerCaseSearch)) {
                    Members.remove(i);
                    compare = true;
                    break; // stop loop after removing one match
                }
            }
            if (!compare){
                System.out.println(M.red+"Can't find the club you search"+M.stop);
            } else {
                System.out.println(M.red+"Club has been removed successfully."+M.stop);
            }

            System.out.println(M.underline+"Press any button to continue"+M.stop
                    +M.white+"\n(type in over to return)"+M.stop);
            String userInput = input.nextLine().trim();
            if (userInput.equals("over")) {
                break; // exit loop if user inputs "over"
            }
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
        //call the function ListClubAndMembers(input)
        ListClubAndMembers(input);
        //create a variable to judge if user want to exit from a club or return
        String exit;
        while (true) {
            System.out.println(M.underline+"Type in the member name to exit"+M.stop
                    +M.white+"\n(Type in 'over' to return):"+M.stop);
            //assign what user type in to variable"exit",trim()is to erase meaningless contents
            exit = input.nextLine().trim();
            //create boolean variable"compare" to judge if the member user type in exists in my program
            boolean compare=false;
            String LowerCaseSearch=exit.toLowerCase().trim();
            for (int i=0;i<Members.size();i++) {
                if (Members.get(i).contains(exit) || Members.get(i).toLowerCase().contains(LowerCaseSearch)) {
                    Members.remove(i);
                    compare = true;
                    break; // stop loop after removing one match
                }
            }

            if (!compare){
                System.out.println(M.red+"Can't find the member you search"+M.stop);
            } else {
                System.out.println(M.red+"Member has been removed successfully."+M.stop);
            }

            System.out.println(M.underline+"Press any button to continue"+M.stop
                    +M.white+"\n(type in over to return)"+M.stop);
            String userInput = input.nextLine().trim();
            if (userInput.equals("over")) {
                break; // exit loop if user inputs "over" and return to last menu
            }
        }
    }
}

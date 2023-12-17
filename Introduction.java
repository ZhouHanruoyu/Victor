import java.util.Scanner;

public class Introduction {
     //import Scanner and create an object "input" of Scanner
    Scanner input=new Scanner(System.in);
    //modified interface variable
    public static final String INTRODUCTION = """
Badminton, also known as shuttlecock, is a popular indoor sport played between two or four players.
It is believed to have originated in India and was introduced to England in the 19th century as a game called 'Poona'.
The name 'badminton' was derived from the Duke of Beaufort's Badminton House in Gloucestershire, where the game was played.

The modern game of badminton,originated in Birmingham,British,is played with lightweight rackets made of carbon fiber or other materials,
and a shuttlecock made of goose feathers or synthetic materials.
The objective of the game is to hit the shuttlecock over the net and into the opponent's court without them returning it.

Badminton is a fast-paced and physically demanding sport that requires quick reflexes, agility, and endurance.
There are several different types of shots in badminton, including the smash, drop shot, and clear.
Players aim to use a combination of these shots to outmaneuver and outscore their opponents.

ver the years, badminton has grown in popularity around the world and is now an Olympic sport.
It is played at both amateur and professional levels, with international competitions;
such as the BWF World Championships and the Thomas Cup attracting top players from all over the globe.

Overall, badminton is a thrilling and exciting sport that requires skill, strategy, and athleticism.
Whether you're a casual player or a serious competitor, there's always room for improvement and new challenges in this dynamic game.
            """;
//get the content of INTRODUCTION
    public static String getIntroduction(){
        return INTRODUCTION;
    }
    //used to print the following content
    public static void printIntroduction(){
        System.out.println("---------Introduction---------");
        System.out.println(Introduction.getIntroduction());
        System.out.println("Press any button to continue.");
    }
}

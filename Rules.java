public class Rules {
  public static final String RULES_TEXT1 = "1. The competition adopts the best of three games system." +
                                            " The first player to reach 21 points in each game wins.";
    public static final String RULES_TEXT2 ="2. Before the game starts, the players of both sides decide which side will choose to serve first or later by throwing coins," ;
    public static final String RULES_TEXT3 ="3. If the score is 20-20, the winner needs to surpass his opponent by 2 points to win.";
    public static final String RULES_TEXT4 ="4. If the score is 29-29, the party who gets the 30th point first wins.";
    public static final String RULES_TEXT5 ="5. Serving rules: At the beginning of the game or when the server scores an even number, " +
    "the server serves at the right half; When the server scores an odd number," +
    "serve at the left half.";
    public static final String RULES_TEXT6 = "6. Rules of rest and changing sides between matches: In a game," +
            "when the leading side reaches 11 points, both sides have a rest time of 60 seconds; " +
            "Between the two games, both sides have a 2-minute break;" +
            "In the deciding game, when the leading side reaches 11, the two sides exchange venues.\n";
    public static String getRules(){
        return RULES_TEXT1+
                RULES_TEXT2+
                RULES_TEXT3+
                RULES_TEXT4+
                RULES_TEXT5+
                RULES_TEXT6;

    }
}

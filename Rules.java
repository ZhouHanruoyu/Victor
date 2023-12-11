public class Rules {
    public static final String RULES= """
            In 1992, badminton became an official Olympic sport, and at that time, 
            the scoring system used was the best of three games with a 15-point format.
            Under this system, only the serving side could score points by winning a rally. 
                
            However, this format led to matches lasting for a long time, 
            with instances where spectators left before the match concluded, 
            and live broadcasts were often interrupted. These issues hindered the development of badminton as a sport.
                                
            In order to address the lengthy duration of matches, 
            the Badminton World Federation (BWF) introduced a new rule:
            seven-point format with the best of five games and a rotational serving system in June 2001. 
            However, this reform did not last long as the seven-point system weakened the entertainment value of badminton, 
            which is a sport that tests both athletes' physical endurance and tactical abilities. 
            Therefore, in May 2002, the BWF reverted back to the 15-point system.
                                
            In 2006, the BWF officially implemented the best of three games with a 21-point format, which is still used today. 
            This system significantly improved the viewing experience of badminton matches. 
            With the popularity of television and online media, professional badminton tournaments gained more coverage,
            greatly enhancing the commercial value of the sport.
                                
            In recent years, several countries have produced talented badminton players, 
            leading to an increase in the competitiveness of the sport. 
            However, the development of badminton has reached a bottleneck. 
            To address this, the BWF started testing a best of five games with an 11-point format in some tournaments starting from 2014.
                                
            During the 2018 BWF Annual General Meeting, the proposal for an 11-point format became a topic of discussion among member countries. 
            The 11-point format, compared to the 21-point format, has a faster pace and is more advantageous for attacking players, but it may lack in showcasing tactical aspects of the game. Ultimately, the proposal was rejected as it did not receive the required two-thirds majority vote.
                                
            At the 2021 BWF Annual General Meeting, the proposal for an 11-point format was once again put on the agenda. 
            In the voting held on May 22,2022, the proposal received 66.31% of the votes, 
            falling short of the required two-thirds majority support and thus was rejected again.
                                
                                         
            The instrumented rules now:                    
            The competition adopts the best of three games system.
            1.The first player to reach 21 points in each game wins.
            2. Before the game starts, the players of both sides decide which side will choose to serve first or later by throwing coins,
            3. If the score is 20-20, the winner needs to surpass his opponent by 2 points to win.
            4. If the score is 29-29, the party who gets the 30th point first wins.
            5. Serving rules: At the beginning of the game or when the server scores an even number,
            the server serves at the right half; When the server scores an odd number,serve at the left half.
            6. Rules of rest and changing sides between matches: In a game,
            when the leading side reaches 11 points, both sides have a rest time of 60 seconds;
            Between the two games, both sides have a 2-minute break;
            In the deciding game, when the leading side reaches 11, the two sides exchange venues.
                
            CHALLENGE:    
            The challenge rule in badminton is that during a match, 
            when one party has doubts about whether the ball judged by the referee is out of bounds, touched the net, or violated the rules, 
            they can request a challenge to ask the referee to confirm again.
            
            The specific rules for challenging are as follows:
            1.Each team has two chances to challenge, and once the two chances are used up, no more challenges can be made.
            2.Challenges can only be made after the referee has made a judgment, 
            and one party has raised objections and is willing to challenge.
            3.The challenge must be made within 5 seconds after the judgment is made, 
            and the arm should be raised inside the sideline of the court to indicate the challenge. 
            If it exceeds 5 seconds or raises the arm outside the sideline, the challenge will be invalid.
            4.When the referee accepts the challenge, 
            the judgment needs to be confirmed through video replay to determine whether the original judgment was correct. 
            If the video replay confirms that the original judgment was correct, 
            the challenger will lose the challenge opportunity and deduct one point. 
            If the video replay confirms that the judgment was wrong, 
            the challenger will retain the challenge opportunity, continue the game, and not lose any points.
                    """ ;


    public static String getRules(){
        return RULES;

    }
    public static void printRules(){
        System.out.println("-----------Rules-----------");
        System.out.println(Rules.getRules());
        System.out.println("Press any button to continue.");
    }
}

public class LittleLeagueBaseballGame extends BaseballGame {
    public LittleLeagueBaseballGame(String name1, String name2) {
        super(name1, name2);
    }
    public void setscore1(int inning, int score) {
        if(inning>5)
        {
            System.out.println("No inning "+ inning);}
        else
        {super.setscore1(inning, score);}
    }
    public void setscore2(int inning, int score) {
        if (inning > 5)
        {System.out.println("No inning "+ inning);}
        else {
            super.setscore2(inning,score);
        }
    }
}
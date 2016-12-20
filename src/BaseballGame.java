public class BaseballGame {
    private String name1;
    private String name2;
    private int[] score1;
    private int[] score2;

    public BaseballGame(String name1, String name2)
    {
        this.name1 = name1;
        this.name2 = name2;
        this.score1 = new int[8];
        for (int i = 0; i <score1.length;i++)
        {
            score1[i]= -1;
        }
        this.score2 = new int[8];
        for (int i = 0; i <score2.length;i++)
        {
            score2[i]= -1;
        }
    }

    public String getname1() {
        return name1;
    }

    public void setname1(String name1) {
        this.name1 = name1;
    }

    public String getname2() {
        return name2;
    }

    public void setname2(String name2) {
        this.name2 = name2;
    }

    public int getscore1(int inning) {
        return score1[inning];
    }

    public void setscore1(int inning, int score) {
        if(inning<countInning(score1))
        {
            System.out.println("Cannot change inning score");
        }
        else
        if(inning>score1.length)
        {
            System.out.println("Game already over");
        }
        else
        if(inning>countInning(score1))
        {
            System.out.println("Haven't reach that inning");
        }
        else
        {score1[inning] = score ;}
    }

    public int getscore2(int inning) {
        return score2[inning];
    }

    public void setscore2(int inning, int score) {
        if(inning<countInning(score2))
        {
            System.out.println("Cannot change inning score");
        }
        else
        if(inning>score2.length)
        {
            System.out.println("Game already over");
        }
        else
        if(inning>countInning(score2))
        {
            System.out.println("Haven't reach that inning");
        }
        else
        {score2[inning] = score ;}
    }

    public void add(String teamname, int score)
    {
        if(teamname.equals(name1))
        {
            setscore1(countInning(score1), score);
        }
        else
        {
            setscore2(countInning(score2), score);
        }

    }

    public int countInning(int[] teamscore)
    {
        int counter = 0;
        for(int i = 0; i<teamscore.length; i++)
        {
            if (teamscore[i] != -1)
            {
                counter++;
            }
        }
        return counter;
    }
}

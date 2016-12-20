public class DemoBaseballGame {
    public static void main(String[] args)
    {
        BaseballGame game1 = new BaseballGame("One","Two");
        game1.setscore1(0,10);
        game1.setscore2(2,100);
        game1.setscore2(0,20);
        System.out.println(game1.getscore1(0));
        System.out.println(game1.getscore2(0));
        System.out.println(game1.getname1());
    }
}
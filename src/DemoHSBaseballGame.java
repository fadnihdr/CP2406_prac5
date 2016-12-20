public class DemoHSBaseballGame {
    public static void main(String[] args)
    {
        HighSchoolBaseballGame game1 = new HighSchoolBaseballGame("One", "Two");
        game1.setscore1(0, 10);
        game1.setscore2(2, 100);
        game1.setscore2(0, 20);
        game1.setscore2(8,20);
        System.out.println(game1.getscore1(0));
        System.out.println(game1.getscore2(0));
        System.out.println(game1.getname1());
    }
}
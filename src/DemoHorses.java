/**
 * Created by fadni on 20/12/2016.
 */
public class DemoHorses {
    public static void main(String[] args)
    {
        Horse horse1 = new Horse("horse1","black",1996);
        System.out.println(horse1.getName() + " " + horse1.getColor() + " " + horse1.getBirthyear());
        RaceHorse horse2 = new RaceHorse("horse2", "green", 1992, 1);
        System.out.println(horse2.getName() + " " + horse2.getColor() + " " + horse2.getBirthyear() + " " + horse2.getNumberOfRaces());

    }
}
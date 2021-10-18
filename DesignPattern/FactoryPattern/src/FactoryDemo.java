/**
 * Every sport should be extended from Sport Class.
 * Then override the description method according to sport.
 * getting actual object at runtime and execute the program
 */
public class FactoryDemo {

    public static void main(String[] args) {
        Sport rugby = SportFactory.getSport(Sport.RUGBY);
        System.out.println(rugby.description());
        Sport volleyBall = SportFactory.getSport(Sport.VOLLEYBALL);
        System.out.println(volleyBall.description());
        Sport footBall = SportFactory.getSport(Sport.FOOTBALL);
        System.out.println(footBall.description());
    }
}

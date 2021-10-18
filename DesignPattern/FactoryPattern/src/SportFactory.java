public class SportFactory {

    /**
     * getting code from argument and creating actual object using code
     * it is called polymorphism and one object has multiple shapes.
     * @param code
     * @return
     */
    public static Sport getSport(String code) {
        Sport sport = null;
        if (Sport.RUGBY.equals(code)){
            sport = new Rugby();
        } else if (Sport.FOOTBALL.equals(code)){
            sport = new FootBall();
        } else if (Sport.VOLLEYBALL.equals(code)){
            sport = new VolleyBall();
        }
        return sport;
    }

}

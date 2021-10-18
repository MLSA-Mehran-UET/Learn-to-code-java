/**
 * Sport is abstract class, it is used for store common things for all sports.
 */
public abstract class Sport {

    public static final String FOOTBALL = "FOOTBALL";
    public static final String VOLLEYBALL = "VOLLEYBALL";
    public static final String RUGBY = "RUGBY";

    public String code = "";

    /**
     * please, specify sport description here.
     * @return
     */
    public String description() {
        return "please, specify sport description here.";
    }
}

/**
 * Every project has Utility or Helper class for
 * which are used for store common attributes and common functions.
 * Since these attribute and functions are common to the whole project,
 * We don't need to create multiple objects.
 * We would say one object is enough for whole project.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        //you can't  create new object here like below.
        //because Util has private constructor
        //Util util = new Util();

        Util util = Util.getUtil();
        util.description();
    }
}

public class Util {

    //create single object for class,
    //set private for restricting outside access
    private static Util util = new Util();

    //create private constructor
    //Then cannot create object on outside
    private Util(){}

    //expose the one and only single object util for outside access
    public static Util getUtil(){
        return util;
    }

    public void description(){
        System.out.println("Im the one and only util");
    }

}

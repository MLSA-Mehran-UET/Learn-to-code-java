/******************************************************************************

Bicycles Example for Classes and Objects demonstrating how to use:
- Classes
- Objects
- Enums

Contributed by: Milton (@jmrchelani)

*******************************************************************************/

class Bicycle {
    
    private Bicycle_Type type;
    
    static enum Bicycle_Type {
        NORMAL,
        SPORT
    }
    
    public Bicycle() {
        this.type = Bicycle_Type.NORMAL;
    }
    
    public Bicycle(Bicycle_Type type) {
        this.type = type;
    }
    
    public String getType() {
        if(this.type == Bicycle_Type.NORMAL) {
            return "Normal";
        }
        else if(this.type == Bicycle_Type.SPORT) {
            return "Sport";
        }
        else {
            return "Undefined";
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Bicycle sportsBicycle = new Bicycle(Bicycle.Bicycle_Type.SPORT);
		Bicycle normalBicycle = new Bicycle(Bicycle.Bicycle_Type.NORMAL);
		
		System.out.println("Type of sportsBicycle is: " + sportsBicycle.getType());
		System.out.println("Type of normalBicycle is: " + normalBicycle.getType());

	}
}

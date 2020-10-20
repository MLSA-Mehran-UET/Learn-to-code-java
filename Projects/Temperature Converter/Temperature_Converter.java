import java.util.Scanner;
public class Tem_Convert
{  
    public static void repeat(){
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while(a)
        {
            char choice;
            System.out.println("Do you want continue [y/n]?");
            choice = sc.next().charAt(0);
            switch(choice){
                case 'Y':
                    Temp_Convert(); 
                    break;
                case 'y':
                    Temp_Convert(); 
                    break;
                case 'n':
                    a = false;
                    System.exit(0);
                case 'N':
                    a = false;
                    System.exit(0);
                default:
                    a = false;
                    System.exit(0);
            }
        }
    }

    public static void Temp_Convert()
    {
        double celcius, farhenhiet, kelvin;
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter");
        System.out.println("You can Perform any of the following conversions \n");
        System.out.println("\tChoose any of the followning Conversion");
        System.out.println("1 : Celsius into Farhenhiet");
        System.out.println("2 : Farhenhiet into Celsius");
        System.out.println("3 : Kelvin into Celsius");
        System.out.println("4 : Celsius into Kelvin");
        System.out.println("5 : Kelvin into Farhenhiet");
        System.out.println("6 : Farhenhiet into Kelvin \n");
        System.out.println("Please select an appropriate option(1-6) : ");
        option = sc.nextInt();
        
        switch(option)
        {
            case 1:
                System.out.println("Enter temperature in Celcius : ");
                celcius = sc.nextDouble();
                farhenhiet = (celcius * 9/5)+32;
                System.out.println("The temperture in Farhenhiet = "+ String.format("%.2f",farhenhiet)+" F");
                break;
            case 2: 
                System.out.println("Enter temperature in Farhenhiet : ");
                farhenhiet = sc.nextDouble();
                celcius = (5.0/9)*(farhenhiet - 32);
                System.out.println("The temperture in Celsius = "+ String.format("%.2f",celcius)+" C"); 
                break;
            case 3:
                System.out.println("Enter temperature in Kelvin : ");
                kelvin = sc.nextDouble();
                celcius = kelvin - 273.15;
                System.out.println("The temperture in Celsius = "+ String.format("%.2f",celcius)+" C"); 
                break;
            case 4:
                System.out.println("Enter temperature in Celsuis : ");
                celcius = sc.nextDouble();
                kelvin = celcius + 273.15;
                System.out.println("The temperture in Kelvin = "+ String.format("%.2f",kelvin)+" K");  
                break;
            case 5:
                System.out.println("Enter temperature in Kelvin : ");
                kelvin = sc.nextDouble();
                farhenhiet = ((kelvin-273.15) * 9/5)+32;
                System.out.println("The temperture in Farhenhiet = "+ String.format("%.2f",farhenhiet)+" F"); 
                break;
            case 6: 
                System.out.println("Enter temperature in Farhenheit : ");
                farhenhiet = sc.nextDouble();
                kelvin = ((5.0/9)*(farhenhiet - 32))+273;
                System.out.println("The temperture in Kelvin = "+String.format("%.2f",kelvin)+" K"); 
                break;
            default:
                System.out.println("Invalid entry, Try again");    
                repeat();
        }	
    }

    public static void main (String[] args)
    {
        Temp_Convert();
        repeat();
    }
}
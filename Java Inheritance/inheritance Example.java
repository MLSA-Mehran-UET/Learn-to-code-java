class BaseDemo{
	int a=1,b=2;
public BaseDemo(){
}	
BaseDemo(int c, int d){
	a=c;
	b=d;
}
public void show(){
	System.out.print(a+" "+b);
	System.out.print("Base class");
}
}
class subclassdemo extends BaseDemo{
subclassdemo(){
	super(2,3);
}
public void show(){
System.out.print(a+" "+b);
System.out.print("Subclass and also overridden method");
}
}
class test{
public static void main(String arg[]){
BaseDemo ob=new BaseDemo();
BaseDemo ob2=new BaseDemo(5,6);
subclassdemo ob1=new subclassdemo();
ob.show();
System.out.println();
ob1.show();
System.out.println();
ob2.show();
}
}
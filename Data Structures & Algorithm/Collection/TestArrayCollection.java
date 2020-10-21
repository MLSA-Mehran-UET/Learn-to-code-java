public class TestArrayCollection{
    public static void main(String[]args)
    {
        String []s = {"AB","CD","EF","GH"};
        Collection bag = new ArrayCollection();
        for(int i=0;i<s.length;i++)
            bag.add(s[i]);
        System.out.println(bag);
        System.out.println(bag.toString());
        if(bag.remove("CD"))
            System.out.println(bag);
        else
            System.out.println("Element not found.");
        if(bag.remove("YZ"))
            System.out.println(bag);
        else
            System.out.println("Element not found.");
        Iterator it = bag.iterator();
        it.next();
        it.next();
        it.remove();
        System.out.println(bag);
        System.out.println(bag.toString());
        bag.add("YZ");
        bag.add("IZ");
        it.next();
        it.remove();
        bag.remove("YZ");
        System.out.println(bag);
        it.next();
        it.remove();
        System.out.println(bag);
        it.next();
        it.remove();
        System.out.println(bag);
        
    }
}
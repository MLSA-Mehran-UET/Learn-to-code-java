package methods;

import java.util.HashMap;

public class BeansC {

    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<String, String>();
        test t = new test();
        a.put("sam", "khan");
           a.put("majd", "khan");
              a.put("owais", "shaikh");
                 a.put("yahyah", "khan");
             //    t.setName("kashif");
               //  t.setPrice(100);
             
       // System.out.println(t.getName());
        //System.out.println(t.getPrice());
        System.out.println(a);

    }
}

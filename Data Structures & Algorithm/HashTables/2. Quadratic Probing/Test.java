public class Test{
    public static void main(String []args){
        HashTable hashTable = new HashTable(8);
        hashTable.put("waqar","sirai.waqar.ali@gmail.com");
        hashTable.put("ahmed","ahmedali.siyal1996@gmail.com");
        hashTable.put("bilawal","b786j786@gmail.com");
        hashTable.put("laiba","Laibamemon94@gmail.com");
        hashTable.put("natasha","natasha@gmail.com");
        hashTable.put("usama","muhammadusamashaikh110@gmail.com");
        hashTable.put("uzair","uzairkhanbapar@gmail.com");
        hashTable.put("imtiaz","imtiazahmedburiro@gmail.com");
        hashTable.put("ahmed ali","ahmedalikeerio2017@gmail.com");
        hashTable.put("bakhtawar","bakhtawarsolangi786@gmail.com");
        hashTable.put("muddassir","ahmedmudassir392@gmail.com");

        System.out.println("E-mail: "+hashTable.get("waqar"));
        System.out.println("E-mail: "+hashTable.get("ahmed"));
        System.out.println("E-mail: "+hashTable.get("bilawal"));
        System.out.println("E-mail: "+hashTable.get("laiba"));
        System.out.println("E-mail: "+hashTable.get("natasha"));
        System.out.println("E-mail: "+hashTable.get("usama"));
        System.out.println("E-mail: "+hashTable.get("uzair"));
        System.out.println("E-mail: "+hashTable.get("imtiaz"));
        System.out.println("E-mail: "+hashTable.get("ahmed ali"));
        System.out.println("E-mail: "+hashTable.get("bakhtawar"));
        System.out.println("E-mail: "+hashTable.get("muddassir"));

        hashTable.remove("muddassir");
        System.out.println();

        System.out.println("E-mail: "+hashTable.get("waqar"));
        System.out.println("E-mail: "+hashTable.get("ahmed"));
        System.out.println("E-mail: "+hashTable.get("bilawal"));
        System.out.println("E-mail: "+hashTable.get("laiba"));
        System.out.println("E-mail: "+hashTable.get("natasha"));
        System.out.println("E-mail: "+hashTable.get("usama"));
        System.out.println("E-mail: "+hashTable.get("uzair"));
        System.out.println("E-mail: "+hashTable.get("imtiaz"));
        System.out.println("E-mail: "+hashTable.get("ahmed ali"));
        System.out.println("E-mail: "+hashTable.get("bakhtawar"));
        System.out.println("E-mail: "+hashTable.get("muddassir"));
    }
}
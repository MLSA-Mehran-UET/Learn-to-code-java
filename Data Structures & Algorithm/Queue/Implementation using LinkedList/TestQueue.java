public class TestQueue{
    public static void main(String[]args)
    {
        LinkedQueue buyQueue = new LinkedQueue();
        LinkedQueue sellQueue = new LinkedQueue();
        buyQueue.add(2200);
        buyQueue.add(2000);
        buyQueue.add(2500);
        buyQueue.add(2300);

        sellQueue.add(3000);
        sellQueue.add(2800);
        sellQueue.add(2000);
        sellQueue.add(4000);

        Integer buy,sell;
        int count = 1;
        int buySum=0,sellSum=0;
        
        for(int i=buyQueue.size();i>0;i--){
            buy = (Integer)buyQueue.remove();
            sell = (Integer)sellQueue.remove();
            buySum+=buy;
            sellSum+=sell;
            if(sell>buy)
                System.out.println("Profit on Product "+count+":"+(sell-buy));
            else if(sell<buy)
                System.out.println("Loss on Product "+count+":"+(buy-sell));
            else 
                System.out.println("No profit and no loss on product "+count);
            ++count;
        }

        if(sellSum>buySum)
            System.out.println("Total profit on all products: "+(sellSum-buySum));
        else if(sellSum<buySum)
            System.out.println("Total loss on all products: "+(buySum-sellSum));
        else
            System.out.println("No profit and no loss on all products");

        /*
        LinkedQueue queue = new LinkedQueue();
        try{
            System.out.println("First Object: "+queue.first());
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        queue.add("Waqar");
        queue.add("Usama");
        queue.add("Uzair");
        queue.add("Imtiaz");
        System.out.println(queue.toString());
        Object []array = queue.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Second Object: "+queue.second());
        System.out.println("SecondLast Object: "+queue.secondLast());
        try{
            System.out.println("First Object: "+queue.first());
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Size: "+queue.size());
        System.out.println("isEmpty: "+queue.isEmpty());*/
    }
}
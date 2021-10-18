/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.PriorityQueue;
/**
 *
 * @author Sameer
 */
public class pQueue {
  public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<String>();  
          pq1.add("sam");
          pq1.add("khan");
          pq1.add("Black");
          pq1.add("White");
          System.out.println("First Priority Queue: "+pq1);
          PriorityQueue<String> pq2 = new PriorityQueue<String>();  
          pq2.add("sam");
          pq2.add("khan");
          pq2.add("Black");
          pq2.add("Orange");
          System.out.println("Second Priority Queue: "+pq2);
         for (String e : pq1){
             System.out.println(pq2.contains(e));
          }      
     }
}

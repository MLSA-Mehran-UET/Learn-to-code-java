import java.util.*;
/*This java program group all Anagrams together from an array of strings(An anagram is a word or phrase
 *  formed by rearranging the letters of a different word or phrase, typically 
 *  using all the original letters exactly once) and returns a list of Grouped Anagrams as output.*/
public class Solution {

     public static void main(String []args){       
        String string[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(string));
     }
     
     
     static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
	/*Iterating each string and sorting them in alphabetical order*/
        for(String s: strs) {
            char charArray[] = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
         /*After sorting string, Storing that sorted string as a Key in map*/
            if(!map.containsKey(sorted)) {
            map.put(sorted, new LinkedList<String>());
        }
        map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }

}

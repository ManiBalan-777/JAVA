import java.util.*;

class LS {
    public static void main(String args[]) {
        int max=0;String ms="";
        String s = "this this this is the longest word word word word word word in the world and this the one in the world god damn this";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = s.split(" ");

        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
     
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if(max<entry.getValue()){   
                max=entry.getValue();
               
            }
           
        }
        for (Map.Entry<String,Integer> e: wordCountMap.entrySet()) {
            if(max==e.getValue()){
                ms=e.getKey();
            }
        }
        System.out.println(ms);
    }
}
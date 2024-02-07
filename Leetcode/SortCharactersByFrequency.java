package Leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;



public class SortCharactersByFrequency {
    public static void main(String[] args) {
        // String str = "aaaccc";
        // String str = "tree";
        String str = "Aabb";
        System.out.println(frequencySort(str));
        System.out.println(frequency(str));
        
    }
    
    // Using Priority Queue
    static String frequency(String s){
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i);
            if(mp.containsKey(c)){
                int currentValue = mp.get(c);
                mp.put(c,currentValue+1);
            }
            else{
                mp.put(c, 1);
            }
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        
        pq.addAll(mp.entrySet());
        
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        
        return result.toString();
    }
    // Using Hashmap

    static String frequencySort(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i);
            if(mp.containsKey(c)){
                int currentValue = mp.get(c);
                mp.put(c,currentValue+1);
            }
            else{
                mp.put(c, 1);
            }
        }
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        mp.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        // Printing sorted map
        String str = "";
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            // System.out.println(": " + entry.getValue());
            for(int i = 0 ; i < entry.getValue() ; i++){
                str += entry.getKey() ;
            }
        }
        return str;

    }
}

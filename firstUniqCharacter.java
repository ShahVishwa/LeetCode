/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Vishwa
 */
public class firstUniqCharacter {
    public static int firstUniqChar(String s){
        if(s.length() == 0){
            return -1;
        }
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        int ans = -1;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        char temp = '\0';
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Character, Integer> entry = iterator.next();
            if(entry.getValue() == 1){
                temp = entry.getKey();
                break;
            }
        }
        
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == temp){
                ans = j;
            }
        }
        return ans;
    }
}

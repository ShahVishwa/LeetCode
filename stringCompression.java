/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Vishwa
 */
public class stringCompression {
    
        public static int compress(char[] chars){
        
//        HashMap<Character, Integer> map = new LinkedHashMap<>();
//        
//        for(int i = 0; i < chars.length; i++){
//            if(map.containsKey(chars[i])){
//                map.put(chars[i], map.get(chars[i])+1);
//            } else {
//                map.put(chars[i], 1);
//            }
//        }
//        int j = 0;
//        Set<Entry<Character, Integer>> entrySet = map.entrySet();
//        Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
//        while(iterator.hasNext()){
//            Entry<Character, Integer> entry = iterator.next();
//            chars[j++] = entry.getKey();
//            int temp = entry.getValue();
//            if(temp == 1){
//                continue;
//            } else {
//                char[] temp1 = ("" + temp).toCharArray();
//                for(int k = 0; k < temp1.length; k++){
//                    chars[j++] = temp1[k];
//            }
//            } 
//        }
//        if(j <= chars.length){
//            return j;
//        } else {
//            return chars.length;
//        }
//-----------------------------------------------------------------------------------------------------------------
        int j = 0;
        int k = 0;
        int length = chars.length;
        char last = chars[0];
        for(int i = 0; i < length; i++){
            if(chars[i] == last){
                j++;
            } else {
                chars[k++] = last;
                if(j != 1){
                    char[] temp = ("" + j).toCharArray();
                    j = 0;
                    for(int a = 0; a < temp.length; a++){
                        chars[k++] = temp[a];
                    }
                }
                j = 0;
                last = chars[i];
                j++;
            }
        } 
        chars[k++] = last;
        if(j != 1){   
            char[] temp = ("" + j).toCharArray();
            for(int a = 0; a < temp.length; a++){
                chars[k++] = temp[a];
            }
        }
        if(k <= length){
            return k;
        } else {
            return length;
        }
    }
    
}

package leetcode;

/**
 *
 * @author Vishwa Shah
 */
public class reverseWords {
    
    public void reverseWords(char[] str){
        String sentence = new String(str);
        String[] words = sentence.split(" ");
        int a = 0;
        for(int i = words.length-1; i >=0; i-- ){
            char[] word = words[i].toCharArray();
            for(int j = 0; j < word.length; j++){
                str[a++] = word[j];
            }
            if(i != 0){
                str[a++] = ' ';
            }
        }
    }
    
}

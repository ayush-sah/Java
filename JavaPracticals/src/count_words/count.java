/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count_words;

/**
 *
 * @author Ayush
 */
public class count {
    public int count_spaces(String s){
        if(s.length()==0)
            return -1;
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' ')
                c++;
        }
        return c;
    }
}

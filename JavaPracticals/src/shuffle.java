/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
import java.util.*;

public class shuffle {
    public static void main(String[] args) {
        LinkedList<String> cards = new LinkedList<String>();
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        cards.add("9");
        cards.add("8");
        cards.add("7");
        cards.add("6");
        cards.add("5");
        cards.add("4");
        cards.add("3");
        cards.add("2");
        cards.add("Ace");
        
        System.out.println("Before Shuffling....." + cards);
        for(int i = 0; i < 100; i++){
            String str = cards.get(new Random().nextInt(10));
            cards.remove(str);
            if(new Random().nextInt(2)==0)
                cards.addFirst(str);
            else
                cards.addLast(str);
        }
        System.out.println("\nAfter Shuffling......" + cards);
    }
}

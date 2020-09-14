package Exp3;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        HashMap<Integer, Double> marks= new HashMap<>();
        
        System.out.print("Enter the number of students in the class: ");
        int n = sn.nextInt();
        System.out.println();
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter the marks scored by roll no. " + (i+1) + ": ");
            Double m = sn.nextDouble();
            marks.put((i+1), m);
        }
        
        System.out.println("\n\n<---Before Sorting--->");
      	System.out.println("Roll no. -   Marks");
        marks.entrySet().forEach(m -> {
          	System.out.println("    " + m.getKey() + "    -   " + m.getValue());
        });
      	
      	HashMap<Integer, Double> sort_marks = new LinkedHashMap<>();
      	int key;
      	Double min;
      	for(int i = 0; i < n; i++){
          	min = 1000000000000000000D;
          	key = -1;
          	for(Map.Entry<Integer, Double> m : marks.entrySet()){
              	if(m.getValue() < min){
                  	key = m.getKey();
                  	min = m.getValue();
                }
            }
          	sort_marks.put(key,min);
          	marks.remove(key);
        }
        
      	marks = sort_marks;
      	System.out.println("\n\n<---After Sorting--->");
      	System.out.println("Roll no. -   Marks");
        marks.entrySet().forEach(m -> {
            System.out.println("    " + m.getKey() + "    -   " + m.getValue());
        });
    }
}

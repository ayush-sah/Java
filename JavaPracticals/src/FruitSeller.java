import java.util.*;
public class FruitSeller {
    public static void main(String[] args) {
        ArrayList<String> FruitsList1 = new ArrayList<String>();
        FruitsList1.add("Apple");
        FruitsList1.add("Mango");
        FruitsList1.add("Banaa");
        FruitsList1.add("Grapes");
        
        Fruit F1 = new Fruit(FruitsList1); // Non Generic
        Fruits<String> F2 = new Fruits<String>(FruitsList1); // Generic
      
      	ArrayList<Integer> FruitsList2 = new ArrayList<Integer>();
        FruitsList2.add(45541);
        FruitsList2.add(12486);
        FruitsList2.add(96325);
        FruitsList2.add(32145);
        
        // Fruit F3 = new Fruit(FruitsList2); // Non Generic
        Fruits<Integer> F4 = new Fruits<Integer>(FruitsList2); // Generic
    }
}

class Fruit{
    Fruit(ArrayList<String> F){
  		System.out.println("<---Non Generic Class Output--->");
        for(String var: F){
            System.out.println(var);
        }
    }
}

class Fruits<T>{
    Fruits(ArrayList<T> F){	
  		System.out.println("\n<---Generic Class Output--->");
        for(T var: F){
            System.out.println(var);
        }
    }
}
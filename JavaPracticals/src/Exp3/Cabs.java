package Exp3;

import java.util.*;
import java.lang.*;

class Car{
    public int number, revenue;
    public String Location;
    public Car(int number, String Location, int revenue){
        this.number = number;
        this.Location = Location;
        this.revenue = revenue;
    }
}
public class Cabs{
    public static List<Car> Cars = new LinkedList<Car>(); // Storing car numbers and their location
    public ArrayList<String> Station = new ArrayList<String>(); // Storing Station where company operation
    
    Cabs(){
        //Adding Station to list
        Station.add("Borivali");
        Station.add("Kandivali");
        Station.add("Malad");
        Station.add("Goregaon");
        Station.add("RamMandir");
        Station.add("Jogeshwari");
        Station.add("Andheri");
        
        //Allocation random location to cars
        for(int i = 0; i < 20; i++){
            Car c = new Car(i+1, Station.get(new Random().nextInt(7)), 0);
            Cars.add(c);
        }
    }
    
    public String get_previous_station(String s){
        for(int i = 0; i < 6; i++){
            if(Station.get(i+1)==s)
                return Station.get(i);
        }
        return null;
    }
    
    public String get_next_station(String s){
        for(int i = 1; i < 7; i++){
            if(Station.get(i-1)==s)
                return Station.get(i);
        }
        return null;
    }
    
    public int select_car(String l, int level1, int level2){
        for(Car c: Cars){
            if(c.Location == l)
                return c.number;
        }
        if(level1 == level2)
            return select_car(get_previous_station(l),++level1, level2);
        else
            return select_car(get_next_station(l),level1, ++level2);
    }
    
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Cabs ola = new Cabs();
        for(int i = 0; i < 10; i++){
            System.out.println("\n\n<--- Customer #" + (i+1) + " --->");
            int loc, dest;
            while(true){
                System.out.println();
                for(int j = 0; j < 7; j++)
                    System.out.println((j+1)+ ". " + ola.Station.get(j));
                System.out.print("Select your location: ");
                loc = sn.nextInt();
                System.out.println();
                for(int j = 0; j < 7; j++){
                    System.out.println((j+1)+ ". " + ola.Station.get(j));
                }
                System.out.print("Select your Destination: ");
                dest = sn.nextInt();
                if(loc == dest){
                    System.out.println("\nLocation and destination can not be the same.\n Please try again");
                }
                else{
                    break;
                }
            }
            int car_num = ola.select_car(ola.Station.get(loc-1),0,0);
            for(Car C: Cars){
                if(C.number==car_num){
                    if(C.Location.equals(ola.Station.get(loc-1)))
                        System.out.println("\n\nCar no. " + C.number + " is at " + C.Location + " and enroute to pick you up.");
                    C.Location = ola.Station.get(loc-1);
                    System.out.println("Customer has been picked from " + C.Location + ".");
                    C.Location = ola.Station.get(dest-1);
                    System.out.println("Customer has been dropped at " + C.Location + ".");
                    C.revenue += Math.abs(dest-loc)*150;
                    System.out.println("Total fare = ₹ " + (Math.abs(dest-loc)*150));
                }
            }
        }
        int total_rev = 0;
        
        System.out.println("<---Today's Report--->");
        for(Car C:Cars){
            System.out.println("Car #" + C.number + " has earned ₹ " + C.revenue);
            total_rev += C.revenue;
        }
        System.out.println("\n\nTotal amount earned by the company is ₹ " + total_rev);
    }
}
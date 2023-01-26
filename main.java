package assingment4; 
import java.util.*; 
public class assingment4 { 
 public static void main(String args[]) { 
 System.out.println("enter 1 to book \n enter 2 to sound book "); 
 Scanner x = new Scanner(System.in); 
 int y = x.nextInt(); 
 if (y == 1) { 
 publication z = new book(); 
 z.readdata(); 
 z.printdata(); 
 } else if (y == 2) { 
 publication z = new soundbook(); 
 z.readdata(); 
 z.printdata(); 
 } else { 
 System.out.println(" faild choose "); 
 } 
 } 
}
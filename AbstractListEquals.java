// Java program to demonstrate 
// equals() method 
// for String value 
  
import java.util.*; 
  
public class AbstractListEquals { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 
  
            // Creating object of AbstractList<String> 
            AbstractList<String> 
                arrlist1 = new ArrayList<String>(); 
  
            // Populating arrlist1 
            arrlist1.add("A"); 
            arrlist1.add("B"); 
            arrlist1.add("C"); 
            arrlist1.add("D"); 
            arrlist1.add("E"); 
  
            // print arrlist1 
            System.out.println("First ArrayListlist : "
                               + arrlist1); 
  
            // Creating another object of AbstractList<String> 
            AbstractList<String> 
                arrlist2 = new ArrayList<String>(); 
  
            // Populating arrlist2 
            arrlist2.add("A"); 
            arrlist2.add("B"); 
            arrlist2.add("C"); 
            arrlist2.add("D"); 
            arrlist2.add("E"); 
  
            // print arrlist2 
            System.out.println("Second ArrayList : "
                               + arrlist2); 
  
            // comparing first ArrayList to another 
            // using equals() method 
            boolean value = arrlist1.equals(arrlist2); 
  
            // print the value 
            System.out.println("Are both list equal : "
                               + value); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 





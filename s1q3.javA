import java.util.*;

class q3
{


  
public static void main (String[] args)
  
{
     
int r,a,v;    
Scanner input = new Scanner (System.in);
    
System.out.println ("Enter any number:");
    
r = input.nextInt ();
    


a=4*3.14*r*r;


    
System.out.println("Area of a Sphere:" +a);
 

v=4/3*3.14*r*r*r;   
System.out.println ("Volume of a Sphere:" +v);
  
}

}
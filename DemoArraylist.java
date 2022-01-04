import java.util.*;
class Laptop implements Comparable< Laptop>{
    String brand ;
    int ram ;
    double price ;
    public Laptop(String brand , int ram ,double price){
        this.brand =brand;
        this.ram =ram;
        this.price =price;
    }
     public int compareTo(Laptop lp){
         if(ram==lp.ram){
             return 0; 
         }    
        else if(ram > lp.ram){
            return 1;
        }
       else 
          return -1;
    }
}
public class DemoArraylist 
{
     public  static void main(String... args)
     {
	ArrayList<Laptop>  ar = new ArrayList<Laptop>();
	Laptop lp1 = new Laptop("Lenovo" , 8 ,65000);
	Laptop lp2 = new Laptop("DELL" , 4 ,57000.099);
	Laptop lp3 = new Laptop("Macbook" , 16 ,88000.0);
	Laptop lp4 = new Laptop("HP" , 32 ,98000.0);

 	ar.add(lp1);
	ar.add(lp2);
	ar.add(lp3);
	ar.add(lp4);	
	Collections.sort(ar);
	   Iterator<Laptop> itr = ar.iterator();
	         while(itr.hasNext())    {
		Laptop temp = itr.next();
		System.out.printf("%-10s%02d  %f\n",temp.brand ,temp.ram, temp.price );
		}
       }
}
/*  Output :

DELL           04      57000.099000
Lenovo       08      65000.000000
Macbook    16      88000.000000
HP                32      98000.000000

*/
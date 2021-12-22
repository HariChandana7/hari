//INSERTIONSORT:

public class Insertion  
{  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {12,18,19,13,17,11,16,15,14,10};    
        System.out.println("Initial Array");    
        for(int i:arr1){    
            System.out.print(i+"  ");    
        }    
        System.out.println();    
            
        insertionSort(arr1); 
           
        System.out.println("Sorted Array");    
        for(int i:arr1){    
            System.out.print(i+"   ");    
        }    
    }    
}    

//Output :
//Initial Array
//12  18  19  13  17  11  16  15  14  10
//Sorted Array
//10  11  12  13  14  15  16  17  18  19



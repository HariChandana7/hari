// BUBBLESORT :

public class Bubblesort
{  
    static void bubbleSort(int arr[])
     {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
    public static void main(String... args) {  
        int arr[] ={3,14,8,0,6,7,2,11,9,5};  
         
        System.out.println("Initial array :");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + "  ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);
         
        System.out.println("Sorted Array :");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + "  ");  
        }  

}  
}  

//Output :
//Initial array :
//3  14  8  0  6  7  2  11  9  5
//Sorted Array :
//0  2  3  5  6  7  8  9  11  14




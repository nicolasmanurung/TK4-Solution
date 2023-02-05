import java.util.ArrayList;

public class SelectionSort {
    public void selectionSortAscending(ArrayList<Integer> arr){
        int [] arr = new int [] {6,13,1,2,8};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
	}

}
}

    }

    public void selectionSortDescending(ArrayList<Integer> arr){
        int[]data={6,13,1,2,8};
	    System.out.println("Sebelum Proses Sorting...");
	    tampil(data);
	    
	    
	    SelectionSort2.sort(data);
	    System.out.println("Sesudah Sorting...");
	    tampil(data);
	 }
	   static void tampil(int[]arr){
	     for (int i = 0; i < arr.length; i++) {
	       System.out.print(arr[i]+" ");
	     }
	    System.out.println();

    }
}

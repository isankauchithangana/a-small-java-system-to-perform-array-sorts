import java.util.*;
public class project8 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\nEnter size of array     >> ");
        int n=scanner.nextInt();
        int arr[]=new int[n]; //declaring array
        System.out.print("\nEnter elements in array >>\n"); //get elements by user
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+" = ");
            arr[i]=scanner.nextInt();
        }
        select3(arr,n); //this for a menu
    }
    

    public static void select3(int[] arr,int n){
        System.out.print("\nEnter 1 to Insert an element to created array >>\n");
        System.out.print("\nEnter 2 to Delete an element by created array >>\n");
        System.out.print("\nEnter 3 to perform Sorting tasks              >>\n\n");
        System.out.print("\nYour choice...................................>>\n");
        int choice3=scanner.nextInt();
        switch(choice3){
            case 1:
            System.out.print("\nEnter position to enter array >>\n");
            int pos=scanner.nextInt();
            System.out.print("\nEnter element to enter array  >>\n");
            int ele=scanner.nextInt();        
            arr= insertElement(n,arr,ele,pos); //call insert enement method
            select(arr);        
            break;

            case 2:
            System.out.print("\nWhat position should delete   >>\n");
            int dpos=scanner.nextInt();
            arr = deleteElement(arr, dpos); //call delete element method
            select(arr);
            break;
            
            case 3:
            select(arr);
            break;
        }  
    }

    public static int[] insertElement(int n, int arr2[],int ele, int pos)
    {
        int i;
        int newarr[] = new int[n + 1]; // creating new array because when insert elements array length should be increased
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr2[i];
            else if (i == pos - 1)
                newarr[i] = ele;
            else
                newarr[i] = arr2[i - 1];
        }
        return newarr;
    }

    public static int[] deleteElement(int[] arr2, int dpos)
    {

        if (arr2 == null || dpos < 0 ||  dpos >= arr2.length) {

        return arr2;
    }


    int[] newarr = new int[arr2.length - 1]; // here also create a new array because when deleting elements from array the array length should be decreased 

 
    for (int i = 0, k = 0; i < arr2.length; i++) {


        if (i ==  dpos) {
            continue;
        }


        newarr[k++] = arr2[i];
    }

    return newarr;
    }
 
    // a simple method to display array
    public static void display(int[] arr2){    
        System.out.println("The array elements are >>");
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
    
    // insertion sort Ascending order
    public static void insertionsort(int[] arr2){ 
        System.out.println("\n\n-----------------------------");
        System.out.println("  I N S E R T I O N S O R T  ");
        System.out.println("-----------------------------\n");
        int n = arr2.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr2[i];
            int j = i - 1;
  

            while (j >= 0 && arr2[j] > temp) {
                arr2[j + 1] = arr2[j];
                j = j - 1;
            }
            arr2[j + 1] = temp;
            System.out.println("\n\nStep "+i+" >>\n");
            for(int k=0; k<arr2.length; k++){
            System.out.print(+arr2[k]+" , ");
      
        } 
            
    }
     
 
        System.out.println("\n\n\n--------------------------------------------------");
        System.out.println("Sorted array is (INSERTION SORT) >> Ascending Order\n");
        for(int in=0; in<arr2.length; in++){
            System.out.print(+arr2[in]+",");
        }
        System.out.println("\n--------------------------------------------------\n");
    }

    //insertion sort descending order
    public static void insertionsortDescending(int[] arr2){
        System.out.println("\n\n-----------------------------");
        System.out.println("  I N S E R T I O N S O R T  ");
        System.out.println("-----------------------------\n");
        int n = arr2.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr2[i];
            int j = i - 1;
  

            while (j >= 0 && arr2[j] < temp) {
                arr2[j + 1] = arr2[j];
                j = j - 1;
            }
            arr2[j + 1] = temp;
            System.out.println("\n\nStep "+i+" >>\n");
            for(int k=0; k<arr2.length; k++){
            System.out.print(+arr2[k]+" , ");
      
        } 
            
    }
     
 
        System.out.println("\n\n\n----------------------------------------------------");
        System.out.println("Sorted array is (INSERTION SORT) >> Descending Order\n");
        for(int in=0; in<arr2.length; in++){
            System.out.print(+arr2[in]+",");
        }
        System.out.println("\n----------------------------------------------------\n");
    }


    // selection sort ascending order
    public static void selectionsort(int[] arr2){
        System.out.println("\n\n\n-----------------------------");
        System.out.println("  S E L E C T I O N S O R T  ");
        System.out.println("-----------------------------\n");
        int temp,minele,minposi;
        for(int i=0; i<arr2.length; i++){
            minele=arr2[i];
            minposi=i;
            for(int j=i; j<arr2.length; j++){
                if(arr2[j]<minele){
                minele=arr2[j];
                minposi=j;
                }
            }
        if(minele<arr2[i]){
            temp=arr2[i];
            arr2[i]=arr2[minposi];
            arr2[minposi]=temp;
        }

        System.out.println("\n\nStep "+(i+1)+" >>\n");
            for(int k=0; k<arr2.length; k++){
            System.out.print(+arr2[k]+" , ");
      
        } 

        }
        System.out.println("\n\n---------------------------------------------------");
        System.out.println("Sorted array is (SELECTION SORT) >> Ascending Order\n");
        for(int i=0; i<arr2.length; i++){
            System.out.print(+arr2[i]+",");
        }
        System.out.println("\n---------------------------------------------------\n");

    }


    // selection sort descending order
    public static void selectionsortDescending(int[] arr2){
        System.out.println("\n\n\n-----------------------------");
        System.out.println("  S E L E C T I O N S O R T  ");
        System.out.println("-----------------------------\n");
        int temp,minele,minposi;
        for(int i=0; i<arr2.length; i++){
            minele=arr2[i];
            minposi=i;
            for(int j=i; j<arr2.length; j++){
                if(arr2[j]>minele){
                minele=arr2[j];
                minposi=j;
                }
            }
        if(minele>arr2[i]){
            temp=arr2[i];
            arr2[i]=arr2[minposi];
            arr2[minposi]=temp;
        }

        System.out.println("\n\nStep "+(i+1)+" >>\n");
            for(int k=0; k<arr2.length; k++){
            System.out.print(+arr2[k]+" , ");
      
        } 

        }
        System.out.println("\n\n---------------------------------------------------");
        System.out.println("Sorted array is (SELECTION SORT) >> Descending Order\n");
        for(int i=0; i<arr2.length; i++){
            System.out.print(+arr2[i]+",");
        }
        System.out.println("\n---------------------------------------------------\n");

    }
   
    //bubble sort ascending order
    public static void bubblesort(int[] arr2){
        System.out.println("\n\n\n-----------------------------");
        System.out.println("  B U B B L E S O R T  ");
        System.out.println("-----------------------------\n");
        
        int n = arr2.length;
    
        
        for (int i = 0; i < n - 1; i++){
          for (int j = 0; j < n - i - 1; j++){
            if (arr2[j] > arr2[j + 1]) {
              int temp = arr2[j];
              arr2[j] = arr2[j + 1];
              arr2[j + 1] = temp;
            }
          }
        System.out.println("\n\nStep "+(i+1)+" >>\n");
        for(int k=0; k<arr2.length; k++){
        System.out.print(+arr2[k]+" , ");
        } 
            } 
        

        System.out.println("\n\n-------------------------------------------------");
        System.out.println("Sorted array is (BUBBLE SORT) >>  Ascending Order\n");
        for(int i=0; i<arr2.length; i++){
            System.out.print(+arr2[i]+",");
        }
        System.out.println("\n-------------------------------------------------\n");   
    }


    //bubble sort descending order
    public static void bubblesortDescending(int[] arr2){
        System.out.println("\n\n\n-----------------------------");
        System.out.println("  B U B B L E S O R T  ");
        System.out.println("-----------------------------\n");
        
        int n = arr2.length;
    
        
        for (int i = 0; i < n - 1; i++){
          for (int j = 0; j < n - i - 1; j++){
            if (arr2[j] < arr2[j + 1]) {
              int temp = arr2[j];
              arr2[j] = arr2[j + 1];
              arr2[j + 1] = temp;
            }
          }
        System.out.println("\n\nStep "+(i+1)+" >>\n");
        for(int k=0; k<arr2.length; k++){
        System.out.print(+arr2[k]+" , ");
        } 
            } 
        

        System.out.println("\n\n------------------------------------");
        System.out.println("Sorted array is (BUBBLE SORT) >> Descending Order\n");
        for(int i=0; i<arr2.length; i++){
            System.out.print(+arr2[i]+",");
        }
        System.out.println("\n------------------------------------------------\n");   
    }


    // here a sub menu
    public static void select(int[] arr2){
     
        int choice;
      
        System.out.println("\nEnter 1 to display array                       >>>\n");
        System.out.println("Enter 2 to perform Insertion sort in JAVA      >>>");
        System.out.println("Enter 3 to perform Selectiion sort in JAVA     >>>");
        System.out.println("Enter 4 to perform Bubble sort in JAVA         >>>\n");
        System.out.println("Your choice....................................>>>");
        choice=scanner.nextInt();
        switch(choice){
            case 1:
            display(arr2);
            select2(arr2);
            break;

            case 2:
            select4(arr2);
            int choice4=scanner.nextInt();
            switch(choice4){
                case 1:
                insertionsort(arr2);
                break;
                case 2:
                insertionsortDescending(arr2);
                break;
            } 
            select2(arr2);
            break;

            case 3:
            select4(arr2);
            choice4=scanner.nextInt();
            switch(choice4){
                case 1:
                selectionsort(arr2);
                break;
                case 2:
                selectionsortDescending(arr2);
                break;
            } 
            select2(arr2);
            break;

            case 4:
            select4(arr2);
            choice4=scanner.nextInt();
            switch(choice4){
                case 1:
                bubblesort(arr2);
                break;
                case 2:
                bubblesortDescending(arr2);
                break;
            } 
            select2(arr2);
            break;

    } 
    
}


//here also a sub menu
public static void select2(int[] arr2){
        System.out.println("\nEnter 1 to create an new array                               >>>");
        System.out.println("Enter 2 to insert an element to created array                >>>");
        System.out.println("Enter 3 to delete an element from created array              >>>\n");
        System.out.println("Enter 4 to perform SORTS on current array                    >>>\n");
        System.out.println("Your choice..................................................>>>");
        int choice2=scanner.nextInt();
        switch( choice2){
            case 1:
            main(null);
            break;

            case 2:
            int n=arr2.length;
            System.out.print("\nEnter position to enter array >>\n");
            int pos=scanner.nextInt();
            System.out.print("\nEnter element to enter array  >>\n");
            int ele=scanner.nextInt();        
            arr2= insertElement(n,arr2,ele,pos);
            select(arr2);
            break;

            case 3:
            System.out.print("\nWhat position should delete   >>\n");
            int dpos=scanner.nextInt();
            arr2 = deleteElement(arr2, dpos);
            select(arr2);
            break;

            case 4:
            select(arr2);
            break;
        }
    }

    public static void select4(int[] arr2){
        System.out.println("Enter 1 to sort in Ascending order             >>>");
        System.out.println("Enter 2 to sort in Descending order            >>>");
        System.out.println("Your choice....................................>>>");

    }

}



public class largestno {
  public static void search(int arr[])
  {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for (int i=0; i< arr.length ; i++)
    {
        if (arr [i]< smallest)
        {
            smallest = arr[i];
        
        } 
         if (arr [i]> largest)
        {
            largest = arr[i];
        
        } 
    }
    System.out.println("largest no is  " + largest);
    System.out.println("smallest no is  " + smallest);
   }
   public static void main(String[] args) {
    int arr [] = {1,2,34,5,4,14,4,57,124};
    search( arr);
   
}

}


public class linear_search{
  public static int search(int arr[], int key){
    for (int i=0; i< arr.length ; i++)
    {
        if (arr [i]== key)
        {
            return i;
        
        } 
    }return-1;
   }
   public static void main(String[] args) {
    int arr [] = {1,2,34,5,4,14,4,57,124};
    int key = 34;
    int index = search(arr,key);
    if (index == -1 )
    {
        System.out.println("key not found");
    }
    else{
        System.out.println("key is at index  " + index);
    }   
}

}

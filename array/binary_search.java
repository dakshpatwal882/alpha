public class binary_search {
  public static int search(int arr[], int key){
    int start=0;
    int end= arr.length-1; 
    while (start<= end) {
        int mid = (start+end)/2;
        if ( arr[mid] == key)
        {
            return mid;
        }
        if( arr[mid] <= key)
        {
            start = mid+1;
        }
        else {
            end = mid -1;
        }

    }return -1;
   }
   public static void main(String[] args) {
    int arr [] = {1,2,34,45,57,124};
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

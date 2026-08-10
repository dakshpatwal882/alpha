public class last_occ {
   
    public static int lo(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        int is_found=lo(arr, key, i+1);
        if (is_found==-1 && arr[i]==key){
            return i;
        }return is_found;
     
    }
    public static void main(String[] args) {
        int arr[]={4,5,66,23,24,234,5,5};
        int key = 5;
        int idx = lo(arr, key, 0);
        System.out.println(idx);
    }
}


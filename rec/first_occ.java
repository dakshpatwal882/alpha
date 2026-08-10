public class first_occ {
    public static int fo(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return fo(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={4,5,66,23,24,234,5,5};
        int key = 6;
        int idx = fo(arr, key, 0);
        System.out.println(idx);
    }
}


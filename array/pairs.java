public class pairs {

    public static void search(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int x = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + x + ", " + arr[j] + ") ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 34, 5, 4, 14, 4, 57, 124};

        search(arr);
    }
}
import java.util.ArrayList;
import java.util.Collections;
public class opration {
    public static void swap(ArrayList<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println("list");
        System.out.println(list);
        System.out.println("rev");
        for(int i = list.size()-1; i>0;i--){
            System.out.println(i);
        }
        System.out.println("max");
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<list.size();i++){
            if (max<list.get(i)) {
                max = list.get(i);
                // max = Math.max(max; list.get(i));
            }
            
        }
        System.out.println(max);
        System.out.println("swap");
    
        int index1= 3;
        int index2 = 7;
        swap(list,index1,index2);
        
        System.out.println("sort");

        System.out.println("assendiing");
        Collections.sort(list);
        System.out.println(list);

        
        System.out.println("desendiing");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

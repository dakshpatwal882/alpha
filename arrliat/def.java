import java.util.ArrayList;
public class def{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Boolean> list2 = new ArrayList<>();
        ArrayList <String> list3= new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        int ele = list.get(1);
        System.out.println(ele);
        list.set(3, 24);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.size());
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }
    }
}

import java.util.ArrayList;

public class multidem {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> List1= new ArrayList<>();
        ArrayList<Integer> List2= new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List2.add(1);
        List2.add(2);
        List2.add(3);
        List2.add(4);
        mainList.add(List2);
        mainList.add(List1);
        System.out.println(mainList);
        
    }
}

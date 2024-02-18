package arraylist;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String > a=new ArrayList();
        a.add("A");
        a.add("B");
        a.add("C");
        System.out.println(a);
        System.out.println(a.get(0));
        a.remove(1);
        System.out.println(a);
    }
}

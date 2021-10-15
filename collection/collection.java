import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collection {
    public static void main(String args[])
    {
    List<Integer> list=new ArrayList<>();
    list.add(90);
    list.add(80);
    list.add(0,100);
    //list.add("hi");

    for(int item:list)
    {
        System.out.println(item);
    }
    System.out.println(list.capacity());
}
}
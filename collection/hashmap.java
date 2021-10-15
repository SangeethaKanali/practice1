import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashmap {
    public static void main(String args[])
    {
    Map<String,String> list=new HashMap<>();
    list.put("Sangeetha","09849284");
    list.put("Saroja","90389058");
    list.put("sakthivel","null");
    list.put("null","788490");
    list.put("null","89839");
    list.put("null","null");

    System.out.println(list.keySet());
    
    //list.forEach((k,v)->System.out.println("name="+k+"   phone number"+v));


}
}

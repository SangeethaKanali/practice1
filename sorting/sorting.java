import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sorting {
    public static void main(String args[])
   {
        //int arr[]={9,87,92,2};
        
    
   /* for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            int temp=0;
            if(arr[j]<arr[i])
            {
                temp=arr[i];//temp=9
                arr[i]=arr[j];//9=2;
                arr[j]=temp;//2=temp

            }
        }
        System.out.print(arr[i]+ " ");
    }*/

    /*Arrays.sort(arr);
    System.out.printf("%s",Arrays.toString(arr));  */
    /*Integer arr[] ={7,4,2,8};
    Arrays.sort(arr,Collections.reverseOrder());
    System.out.printf("%s",Arrays.toString(arr));*/
    ArrayList<String> list=new ArrayList<>();
    list.add("sangeetha");
    list.add("naveenkumar");
    list.add("nisa");
    if(list.contains("a"))
    {
    Collections.sort(list,Collections.reverseOrder());
   
    }
    System.out.println(list);

}

    private static char chartAt(ArrayList<String> list) {
        return 0;
    }
}

 interface mul{
     void print();
    
}
interface hey{
    void show();
}
class multipleinheritance implements mul,hey
{
    public void print(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
        }
        
    }
    public void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String args[])
    {
        multipleinheritance obj=new multipleinheritance();
        int num[]={8,9,6,8,4};
        obj.print(num);
        obj.show();
    }
    @Override
    public void print() {
        // TODO Auto-generated method stub

        
    }

}

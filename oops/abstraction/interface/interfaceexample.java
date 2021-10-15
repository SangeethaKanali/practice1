 interface printable {
     void display();
    
}
class interfaceexample implements printable
{
    public void display()
        {
            System.out.println("hi");
        }
    public static void main(String args[])
    {
        printable obj=new interfaceexample();
        obj.display();
        
    }
}

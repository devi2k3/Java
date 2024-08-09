import java.util.*;
class pal{
    public static void main(String[] args)
    {
        String p,q="";
        System.out.println("enter a string/number to check wether it is palindrom or not : ");
        Scanner s=new Scanner(System.in);
        p=s.nextLine();
        int length=p.length();
        for(int i=length-1; i>=0;i--)
        {
            q=q+p.charAt(i);
        }
        if(p.equals(q))
        {
            System.out.println("its a palindrom ");
        }
        else
        {
            System.out.println("its not a palindrom ");
        }
    }
}
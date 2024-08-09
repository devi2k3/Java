import java.util.*;
class mazicnumber{
    public static void main(String[]args)
    {
        int m,n1,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = scanner.nextInt();
        
        while(n>9){
        while(n>0)
        {
           m=n%10;
           sum=sum+m;
           n=n/10;
           
        }
        n=sum;
        sum=0;
        }
        if(n==1)
        {
            System.out.println("ita a mazic number");
        }
        else{
            System.out.println("ita not a mazic number");
        }
       
        
    }
}
import java.util.*;
class righttrianglepattern{
    public static void main(String[] args)
    {
        int n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a value:");
        n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
        
            }
            System.out.println();
        }
        
    }
}
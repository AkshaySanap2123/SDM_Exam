import java.util.Scanner;

public class Prime {
    int i, count;
    public static void main(String[] args) {
        int i, count;
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter 1 to n");

        for(int j=2;j<=n;j++)    
        {
            count = 0;
            for( i=0;i<=j;i++)
            {
                if(j%1 == 0)
                {
                    count ++;
                }
            }
            if(count == 2)
            {
                System.out.println(j+ " ");
            }
        }
    }
}


import java.util.Scanner;
public class invertedtrianglewithnumber
{
    public static void main(String[] args) 

    {
        Scanner sc = new Scanner(System.in);      
        int n = 11;         
        for(int i=0;i<n-1;i++)
        {
            for(int k=0;k<=i;k++)
            {
                                    System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++)
            {
                                    if(i%2==0)
                                    System.out.print("* "); 
                                    else
                                    System.out.print(n-i-1+" ");
            }
                                    System.out.println(" ");
        }

    }
}
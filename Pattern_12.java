import java.io.*;
import java.util.*;

public class Pattern_12
{
    public static void main(String[] args) {
        // Question 12
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st =1;
        int sp =n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                if(j%2==1){
                    System.out.print("*");
                }else{
                    System.out.print("!");
                }
            }
            System.out.println();
            if(i<n){
                st+=2;
                sp-=1;
            }
        }
    }
}
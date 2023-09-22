import java.io.*;
import java.util.*;

public class Pattern_07{
    public static void main(String[] args) {
        // Question 07
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

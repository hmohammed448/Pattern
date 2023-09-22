import java.io.*;
import java.util.*;

public class Pattern_33{
    public static void main(String[] args) {
        // Question 33
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int star = 1;
        int space = n - 1;

        for(int row=1;row<=n;row++){

            int count = 1;
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
                count++;
            }
            // star
            for(int i=1;i<=star;i++){
                if(count==n){
                    System.out.print("0\t");
                }else{
                    System.out.print(count+"\t");
                }
                count++;
            }

            count = n-1;
            // 2nd Half star
            for(int i=1;i<=star;i++){
                if(i==1) continue;
                System.out.print(count+"\t");
                count--;
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
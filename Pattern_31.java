import java.io.*;
import java.util.*;

public class Pattern_31{
    public static void main(String[] args) {
        // Question 31
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = n;

        for(int row=1;row<=n;row++){
            int count = n;
            // star
            for(int i=1;i<=star;i++){
                if(count==row){
                    System.out.print("* ");
                }else{
                    System.out.print(count+" ");
                }
                count--;
            }

            System.out.println();
        }
    }
}
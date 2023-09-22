import java.io.*;
import java.util.*;

public class Pattern_16{
    public static void main(String[] args) {
        // Question 16
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int star = n;
        int space = n - 1;
        for(int row=1;row<=(n*2)-1;row++){
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }

            if(row<n){
                space--;
                star--;
            }else{
                star++;
                space++;
            }

            System.out.println();
        }
    }
}
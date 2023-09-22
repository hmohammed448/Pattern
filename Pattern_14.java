import java.io.*;
import java.util.*;

public class Pattern_14{
    public static void main(String[] args) {
        // Question 14
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int star = 1;
        int space = n/2;
        for(int row=1;row<=n;row++){
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }
            if(row<=n/2){
                space--;
                star++;
            }else{
                star--;
                space++;
            }
            System.out.println();
        }
    }
}
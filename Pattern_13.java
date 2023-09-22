import java.io.*;
import java.util.*;

public class Pattern_13{
    public static void main(String[] args) {
        // Question 13
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int star = 1;
        int space = (n/2) + 1;
        for(int row=1;row<=n;row++){
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            if(row<=n/2){
                star++;
                space--;
            }else{
                star--;
                space++;
            }
            System.out.println();
        }
    }
}
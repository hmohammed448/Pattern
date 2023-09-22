import java.io.*;
import java.util.*;

public class Pattern_17{
    public static void main(String[] args) {
        // Question 17
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int star = (n/2) + 1;
        int space = 0;
        for(int row=1;row<=n/2;row++){
            // star
            for(int i=1;i<star;i++){
                System.out.print("*\t");
            }
            // space
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }

            // space
            for(int i=0;i<=space;i++){
                System.out.print("\t");
            }
            // star
            for(int i=1;i<star;i++){
                System.out.print("*\t");
            }

            if(row<=n/2){
                star--;
                space+=1;
            }else{
                star++;
                space-=1;
            }

            System.out.println("");
        }

        System.out.println();

        star = 1;
        space = (n/2) + 1;
        for(int row=1;row<=n/2;row++){
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }
            // space
            for(int i=1;i<space;i++){
                System.out.print("\t");
            }

            // space
            for(int i=2;i<space;i++){
                System.out.print("\t");
            }
            // star
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }

            if(row<=n/2){
                space-=1;
                star++;
            }else{
                star--;
                space+=1;
            }

            System.out.println("");
        }
    }
}
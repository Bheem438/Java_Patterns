
//n=5
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
//
package Pattern;

import java.util.Scanner;

public class Inverted_HalfPyramidNumbers {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

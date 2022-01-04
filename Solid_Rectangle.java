//
//Solid Rectangle Pattern
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

package Pattern;
import java.util.Scanner;

public class Solid_Rectangle {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

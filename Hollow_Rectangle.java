//Hollow Rectengle Pattern
//        * * * * *
//        *       *
//        *       *
//        * * * * *



package Pattern;
import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || i==n || j==1 || j==m){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}


//n = 5
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

package Pattern;

import java.util.Scanner;

public class FloydsTringle{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int number = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                number = number + 1;
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
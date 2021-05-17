package people_help;
import java.util.*;

public class rishabhPanchal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int row = 1;
        while (row <= n) {
            for (int cst = 1; cst <= nst; cst++) {
                if (cst+row <=n-n/2+1||cst-row>n-n/2-2||row-cst>n-n/2-2||row+cst>n+n/2) {
                    System.out.print("*      ");
                }
                else{
                    System.out.print("       ");
                }
            }
            System.out.println();
            row++;
        }
    }
}

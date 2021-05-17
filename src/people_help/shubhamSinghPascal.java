package people_help;
import java.util.*;
public class shubhamSinghPascal {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nsp=n-1;
        int row =1;
        int nst=1;
        int i=0;
        while(row<=n){

            for(int csp = 1;csp<=n+1;csp++)
                System.out.print(" ");


            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            int number =1;
            int j=0;
            for(int cst=1;cst<=nst;cst++){
                if(cst%2==0){
                    System.out.print("  ");
                }
                else{
                    System.out.print(number+" ");
                    number = number*(i - j)/(j + 1);
                    j++; }

            }
            System.out.println("");
            nst+=2;
            nsp--;
            i++;
            row++;
        }

    }
}
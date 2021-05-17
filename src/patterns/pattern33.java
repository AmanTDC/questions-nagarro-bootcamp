package patterns;

public class pattern33 {
    public static void main(String[] args) {
        int n = 10;
        int nst = 1;
        int nsp = n - 1;

        for(int row = 1 ; row<=10 ; row++){
            for(int csp = 1;csp<=nsp;csp++){
                System.out.print("   ");
            }
            int cnt = n-row+1;
            for(int cst = 1;cst<=nst;cst++){
                if(cst<row) {
                    System.out.print(cnt + "  ");
                    cnt++;
                }
                else if(cst==row)
                    System.out.print("0  ");
                else{
                    cnt--;
                    System.out.print(cnt+"  ");
                }

            }
            System.out.println();
            nst+=2;
            nsp-=1;
        }
    }

}

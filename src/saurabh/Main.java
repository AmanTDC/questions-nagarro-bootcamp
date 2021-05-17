import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        while (true) {
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '%') {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int a = 0;
                if (ch == '+') {
                    a = n1 + n2;
                } else if (ch == '-') {
                    a = n1 - n2;
                } else if (ch == '/') {
                    a = n1 / n2;
                } else if (ch == '%') {
                    a = n1 % n2;
                } else if(ch =='*'){
                    a = n1 * n2;
                }
                System.out.println(a);
                //change
                ch = sc.nextLine().charAt(0);

            }
            else if (ch == 'X' || ch == 'x') {
                System.exit(0);
            }
            else {
                System.out.println("Invalid operation. Try again.");
                ch = sc.nextLine().charAt(0);
            }
        }
    }
}
package quick_methods;
import java.util.*;
public class input_taker {
    static Scanner sc = new Scanner(System.in);
    static int ni(){
        return sc.nextInt();
    }
    static long nl(){
        return sc.nextLong();
    }
    static String ns(){
        return sc.next();
    }
    static <T> void print(T e){
        System.out.print(e);
    }
    public static void main(String[] args) {

        print(ni());
        print(ns());
        print(ni());
        print(ns());
    }
}

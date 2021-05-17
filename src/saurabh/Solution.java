package saurabh;
import java.util.*;
class Point2D{
    int x;
    int y;
    Point2D(int a,int b){
        x=a;
        y=b;
    }
    Point2D(){}
    double dist2D(Point2D p){
        return Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2));
    }
    void printDistance(double d){
        System.out.println(Math.ceil(d));
    }


}
class Point3D extends Point2D{
    int z;
    Point3D(int a,int b,int c){
        super(a,b);
        z=c;
    }
    double dist3D(Point3D p){
        return Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2)+Math.pow(z-p.z,2));
    }

}


public class Solution {
    public static void main(String[] args) {

        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(4,5,6);
        Point2D p = new Point2D(0,0);
        p.printDistance(p1.dist2D(p2));
        p = p1;
        p.printDistance(p1.dist3D(p2));


    }
}

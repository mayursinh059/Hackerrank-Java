
import java.util.*;
import java.io.*;

class Solution{
    static void series(double x, double y, double n){
        double ans = x;
        double i;
        for(i=0;i<n;i++){
            double z = Math.pow(2,i);
            //System.out.print(ans + " ");
            ans = ans + y*z;
            System.out.print((int)ans + " ");
        }
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n>0){
            int a,b,c;
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            series(a,b,c);
            System.out.println();
            n--;
        }
        in.close();
    }
}

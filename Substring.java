import java.util.Scanner;
class Substring{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1=in.nextLine();
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(s1.substring(a,b));
    }
}

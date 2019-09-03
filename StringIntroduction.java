import java.util.Scanner;
public class Intro{
  public static void main(String []args){
    Scanner ravi = new Scanner(System.in);
        String s1 = ravi.nextLine();
        String s2 = ravi.nextLine();
        String s3;
        int l1 = s1.length() + s2.length();
        if(s1.charAt(0) > s2.charAt(0) ){
             s3 = "Yes";
        }else{
            s3 = "No";
        } 
        System.out.println(l1);
        System.out.println(s3);
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1,s1.length())+" "+ s2.substring(0,1).toUpperCase()+s2.substring(1,s2.length()));
  }
}

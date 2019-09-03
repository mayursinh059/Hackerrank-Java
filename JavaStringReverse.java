import java.util.Scanner;
class Palindrome{
    static void palindrome_ver1(String S){
        int i=0,count=0;
        int j=S.length()-1;
        String str = S.toLowerCase();
        while(i<=j && j>=i){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
            j--;
            i++;
        }if(S.length()%2==0){
            if(count==((S.length())/2)){
                System.out.println("The String Is Palindrome!!");
            }else{
                System.out.println("The String Is NOT Palindrome!!");
            }
        }else{
            count = count -1;
            if(count==((S.length())/2)){
                System.out.println("The String Is Palindrome!!");
            }else{
                System.out.println("The String Is NOT Palindrome!!");
            }
        }   
    }
    static void palindrome_ver2(String S){
        int i=0,count=0;
        int j=S.length()-1;
        String str = S.toLowerCase();
        while(i<=j && j>=i){
            if(str.charAt(i)!=str.charAt(j)){
                count++;
            }
            j--;
            i++;
        }
        if(count == 0){
            System.out.println("The String Is Palindrome!!"); 
        }else{
            System.out.println("The String Is NOT!! Palindrome!!");
        }
    }
    //version3 can be done by simply reversing the string and check with the original string :)
    public static void main(String[] args){
        Scanner ravi = new Scanner(System.in);
        System.out.println("Enter a string or a number to check it is a palindrome or not :");
        String S = ravi.nextLine();
        palindrome_ver2(S);
    }
}

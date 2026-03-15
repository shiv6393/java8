import java.util.Scanner;

public class StringCompression {
 public static String getCompressedString(String st){
    String ans="";
    int n=st.length();
    int i=0;
    while(i<n){
        char currentChar=st.charAt(i);
        int count=1;
        while(i+1<n && st.charAt(i)==st.charAt(i+1)){
            count++;
            i++;
        }
        ans+=currentChar;
        if(count>1){
            ans+=count;
        }
        i++;
    }
    return ans;
 }
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String st=sc.next();
    String result=getCompressedString(st);
    System.out.println(result);
 }
}
public class FindLcm {
    public static int LCM(int a, int b) {

        // write your code here
        int n=Math.min(a,b);
        int m=Math.max(a,b);
        for(int i=1;i<=n;i++ ){
            int num=m*i;
            if(num%n==0)return num;
        }
        return 1;

        // return LCM of a and b
    }
    public static void main(String[] args) {
        int a=4;
        int b=6;
        int result=LCM(a, b);
        System.out.println(result);
    }
}

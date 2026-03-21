public class GcdByEuclidionTheorm {
    public static int gcd(int a, int b) {
        // code here
       int n=Math.min(a,b);
       int m=Math.max(a,b);
       if(n==0)return m;
       
       return gcd(m%n,n);
    }
    public static void main(String[] args) {
        int a=48;
        int b=18;
        int result=gcd(a, b);
        System.out.println(result);
    }
}

public class MaxConjecutiveBits {
    public static int maxConsecBits(int[] arr) {
        // code here
        int zero=0;
        int one=0;
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                one=0;
                 ans=Math.max(ans,zero);
            }
            else {
                one++;
                zero=0;
                 ans=Math.max(ans,one);
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,0,0,1};
        int result=maxConsecBits(arr);
        System.out.println(result);
    }
}

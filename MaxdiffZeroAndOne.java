public class MaxdiffZeroAndOne {
    public static int maxSubstring(String s) {
        // code here
        int n=s.length();
        int prediff=s.charAt(0)=='1'?-1:1;
        int ans=prediff;
        for(int i=1;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                prediff=Math.max(prediff-1,-1);
            }
            else prediff=Math.max(prediff+1,1);
            
            ans=Math.max(ans,prediff);
        }
        
        return ans;
    }
    public static void main(String []args){
        String s="110100110";
        int result=maxSubstring(s);
        System.out.println(result);
    }
    
}

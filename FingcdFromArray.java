public class FingcdFromArray {
    int gcd(int a,int b){
        int n=Math.min(a,b);
        int m=Math.max(a,b);
        while(n!=0){
            m=m%n;
            int temp =n;
            n=Math.min(n,m);
            m=Math.max(temp,m);
        }
        return m;
    }
    public int findGCD(int[] nums) {
        int n=nums.length;
        int min=1001;
        int max=0;
       for(int i=0;i<n;i++){
        min=Math.min(nums[i],min);
        max=Math.max(nums[i],max);
       }
       return gcd(min,max);
    }
    public static void main(String[] args) {
        FingcdFromArray obj=new FingcdFromArray();
        int[] nums={2,5,6,9,10};
        int result=obj.findGCD(nums);
        System.out.println(result);
    }
    
}

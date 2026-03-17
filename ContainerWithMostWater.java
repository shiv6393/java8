public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;
        int j=n-1;
        int i=0;
        int maxWater=0;
        while(i<j){
            maxWater=Math.max(maxWater,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i++;
            }
            else j--;

        } return maxWater;
        
        
    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater obj=new ContainerWithMostWater();
        int result=obj.maxArea(height);
        System.out.println(result);
        
    }
    
}

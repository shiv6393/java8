import java.util.Scanner;

public class MaxAvgSum {
    public static double getMaxAvg(int[]arr,int k){
        double ans=0.0;
        int n=arr.length;
        int j=0;
        double sum=0d;
        for(int i=0;i<n;i++){
            sum +=arr[i];
            while(i-j+1>k){
                sum -=arr[j];
                j++;
            }
            if(i-j+1==k){
                ans=Math.max(ans,sum/k);
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double result=getMaxAvg(arr,k);
        System.out.println(result);
    }
    
}

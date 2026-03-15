import java.util.Scanner;

public class EqulibriumWeight {
   public int findEquilibriumPoint(int[]weights){
    int n=weights.length;
    int leftSum[]=new int[n];
    int rightSum[]=new int[n];
    int left=0;
    int right=0;
    for(int i=0;i<n;i++){
        leftSum[i]=left;
        rightSum[n-i-1]=right;
        left+=weights[i];
        right+=weights[n-i-1];
    }
    for(int i=0;i<n;i++){
        if(leftSum[i]==rightSum[i]){
            return i;
        }
    }
    return -1;

    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of weights");
    int n=sc.nextInt();
    int[]weights=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the weight"+i+1);
        weights[i]=sc.nextInt();
    }
    EqulibriumWeight equlibriumWeight=new EqulibriumWeight();
    int equilibriumPoint=equlibriumWeight.findEquilibriumPoint(weights);
    if(equilibriumPoint!=-1){
        System.out.println("Equilibrium point is at index: "+equilibriumPoint);
    }else{
        System.out.println("No equilibrium point found.");
    }
    
}
    
}

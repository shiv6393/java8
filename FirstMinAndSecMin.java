import java.util.ArrayList;

public class FirstMinAndSecMin {
       public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
          int curr=arr[i];
          if(curr<min){
              secMin=Math.min(min,secMin);
              min=curr;
          }
          else if (secMin>curr && min!=curr){
              secMin=curr;
          }
          
        }
        ArrayList<Integer>ans=new ArrayList<>();
        if(min==Integer.MAX_VALUE || secMin==Integer.MAX_VALUE)ans.add(-1);
        else {
            ans.add(min);
            ans.add(secMin);}
            return ans;
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        FirstMinAndSecMin obj=new FirstMinAndSecMin();
        ArrayList<Integer> result=obj.minAnd2ndMin(arr);
        System.out.println(result);
        
    }
    
}

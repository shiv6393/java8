import java.util.ArrayList;
import java.util.HashMap;

public class DisstinctElementsInDistinctWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n=arr.length;
        int i=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(i=0;i<k;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            
        }
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(mpp.size());
        for(i=k;i<n;i++){
            if(mpp.get(arr[i-k])==1)mpp.remove(arr[i-k]);
            else mpp.put(arr[i-k],mpp.get(arr[i-k])-1);
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            ans.add(mpp.size());
        }
        return ans;
    }
    public static void main(String[] args) {
        DisstinctElementsInDistinctWindow obj=new DisstinctElementsInDistinctWindow();
        int[] arr={1,2,1,3,4,2,3};
        int k=4;
        ArrayList<Integer> result=obj.countDistinct(arr, k);
        System.out.println(result);
        
    }
}

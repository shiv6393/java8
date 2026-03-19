import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumber {
     static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int n=arr.length;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0)q.offer(i);
        }
        List<Integer>ans=new LinkedList<>();
        if(q.isEmpty())ans.add(0);
        else ans.add(arr[q.peek()]);
        for(int i=k;i<n;i++){
           if(arr[i]<0)q.offer(i);
           if(!q.isEmpty() && q.peek()==(i-k))q.remove();
           if(q.isEmpty())ans.add(0);
           else ans.add(arr[q.peek()]);
           
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr={-8, 2, 3, -6, 10};
        int k=2;
        List<Integer> result=firstNegInt(arr, k);
        System.out.println(result);
        
    }
    
}


public  class MergeSortOnLinkedList {
   static ListNode mergeSort(ListNode head){
        if(head== null || head.next ==null)return head;
        ListNode mid=findMid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=mergeSort(left);
        right=mergeSort(right);
        return merge(left,right);
        
    }
    static ListNode findMid(ListNode head){
        if (head == null) {
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
   static ListNode merge(ListNode l,ListNode r){
        ListNode i=l;
        ListNode j=r;
        ListNode head=new ListNode();
        ListNode temp=head;
        while(i != null && j != null){
            if(i.val>j.val){
             ListNode node =new ListNode(j.val);
             temp.next=node;
             temp=node;
             j=j.next;
            }
            else{
                ListNode node =new ListNode(i.val);
             temp.next=node;
             temp=node;
             i=i.next; 
            }

        }
        if(i!=null){
             temp.next=i;
        }
         if(j!=null){
             temp.next=j;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        for(int i=0;i<10;i++){
            int n=(int)(Math.random()*100);
            ListNode node=new ListNode(n);
            temp.next=node;
            temp=node;
        }
        temp=dummy.next;
        System.out.println("List before sorted");
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
       temp =mergeSort(dummy.next);
       System.out.println("List after sorted");
       while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

    }

}  


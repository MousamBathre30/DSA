import java.util.*;
public class Linkedlist {
    // defination 
    // linked list is contagious memory allocation data struture 
    // in java we store in refrerecnce . (oops )
    // referance is a variable what is point into the obj.
    // node - data - next always 

    // --- to make a class 
    // code 
    // class Node {
    //     int data ; // node has two property 
    //     Node next; 

    //     public Node (int data ){
    //         This.data=data;
    //         this.next= null;
    //     }
    // }
    // head node (starting node ) , tail node (last (not null value ) )

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
  // methods 
  //opearation 
  // 1. Add in linked list 
  // -- add first -- add Last 
  // step 1 create a new node 
  // step 2 new node's next = head 
  // step 3 head = new node 


  // 2. print a Linked list 
  // 1--2--3--4--null 
  // head-----tail---
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
         // t(C) O(1) constatant 
        
          // step 1 create a new node 
          Node newNode= new Node(data);
          size++;
          
          if(head==null){
            head=tail=newNode;
            return;
          }
          // // step 2 new node's next = head (linking step)

          newNode.next=head; 


         // step 3 head = new node 

         head=newNode;

    } 

    public  static void  addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print (){ // O(N)
        if(head==null){
            System.out.println(" ll is empty ");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ->  ");
            temp=temp.next;
        }
        System.out.println();
    }

    // 2- Add in the  Middle 
    // add(index,data)


    public void add(int idx, int data){ 
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0; 
        while(i < idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // 3..Size of a linkedlist 
    // ll.size 
    // in this operaton whenever annd whereever the node is created where the size
    // is ++.

    // 4. remove in a Linked list 
    // remove first --- remove last 

    public int removeFirst(){ 

        // speacial case 
        if(size==0){
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
  // remove last 

  public int removeLast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    } else if (size==1){
        int val= head.data;
        head = tail=null;
        size=0; 
        return val;
    }
    Node prev=head;
    for(int i=0; i<size-2; i++){
        prev=prev.next;
    }
    int val= prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
  }

  // 5 search in key in itreative 
  public int iteSearch(int key ){
    Node temp= head;
    int i=0;
    while(temp != null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
  }
 

  // 6  search a key in recursive method  
  public int helper(Node head, int key){
    if(head==null){
        return -1;

    }
    if(head.data == key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx ==-1){
        return -1;
    }
    return idx+1;

    
  }
  public int recursiveSearch(int key)
  {
     return helper(head,  key);
  }
  //7 reverse a linked list 
  // itearative Approach 
  // proecc 
  // step 1 
    
   public void reverse(){
     // O(n)
    Node prev=null;
    Node curr = tail = head;

    Node next;
    while (curr != null){
        next= curr.next;
        curr.next= prev;
        prev = curr;
        curr= next; 
    }
    head= prev;
   }

  // problem 8  :- 
   // find & remove Nth node from end 
   // irerative @Approcach 

   public void deleteNthfromend(int n){
    // calculate sise 
    int sz=0; 
    Node temp = head;
    while(temp != null){
        temp=temp.next;
        sz++;
    }
    if(n == sz){
        head= head.next;
        return; 

    }
    int i=1;
    int itofind=sz-n;
    Node prev= head;
    while(i<itofind){
        prev=prev.next;
        i++;
    }
    prev.next= prev.next.next;
    return; 
   } 

   // 9 check if a ll is a palindrome 
   // step 1 find middle 
   // even -- odd 2 end half reverse 
   public Node findMid(Node head){
    Node slow=head;
    Node fast= head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast= fast.next.next;
    }
     return slow;  

   }    

    public boolean checkPalindrome(){

          if(head == null || head.next == null ){
            return true;
         }
        // step 1 find mid
        
        Node midNode = findMid(head);


        // step 2 reverse 2nd half 
        Node prev=null ;
        Node curr = midNode;
        
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr=next;
        } 

         Node right=prev;
         Node left= head;

        // step 3 check left half 
        while(right != null){
            if(left.data != right.data){
                return false;

            }
            left= left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(4);
    //     ll.addLast(5);
    //     ll.add(2,3);
    //     ll.print(); // 
    //    //System.out.println(ll.size);
    // //    ll.removeFirst();
    // //    ll.print();

    // //    ll.removeLast();
    // //    ll.print();
    //  //  System.out.println(ll.size);
    // //  System.out.println(ll.iteSearch(3));
    // //  System.err.println(ll.Search(10));
    // System.out.println(ll.recursiveSearch(3));
    // System.out.println(ll.recursiveSearch(10));
    // ll.reverse();
    // ll.print();
    // ll.deleteNthfromend(3);
    // ll.print();        
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(5);
    ll.addLast(1);
    ll.print();
   System.out.println( ll.checkPalindrome());
    }
}

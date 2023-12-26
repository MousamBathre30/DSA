import java.util.ArrayList;
import java.util.Collections;
public class Classroom {
    //array list is a inbuid datastructure .
// linear type 
// introduction to array list 
// different b/w array vs arraylist 
/*
 *   array has fixed size << arraylist has dynamic size (inbuilt )
 *   primitive data type can be stored >> can't be stored directly (class )
 *   class hava capital letter 
 */
  

     public static void swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
     }
    public static void main(String[] args) {
    //     // syntax 
    //     // java collection framework 
    //     // className objname= new className();
    //     // in this <> for type of 
         // ArrayList < Integer > list = new ArrayList<>();
    //     ArrayList < String > list2= new ArrayList<>();
    //     ArrayList< Boolean > list3=new ArrayList<>();

    //     // Opearation in ArrayList 
    //     //add 
      //   list.add(1);
       //  list.add(2);
        // list.add(3);
        //  list.add(4); // time complaxity  (1) constant time 
    //     list.add(1, 9); // O(n) linear 
     
    //     System.out.println(list);

    //     // get element 
    //    int element = list.get(3);
    //    System.out.println(element); // time O(1)

    //    // Remove element , Delete 
    //    list.remove(3);  // O(N) linearly 
    //    System.out.println(list); 

    //    // set element 
    //    list.set(2,10);
    //    System.out.println(list);

    //    // contains element 
    //    System.out.println(list.contains(1));
    //    System.out.println(list.contains(11)); 

    //    // size of arraylist 
    //    System.out.println(list.size()); // method 
    //    // print array list 
    //    for(int i=0; i<list.size(); i++){
    //     System.out.print(list.get(i) + " ");
    //    }
    //    System.out.println();

       // problem 1 
       // print reverse of an arraylist  O(n)
       // list 

    //    for(int i=list.size()-1; i>=0; i--){
    //     System.out.print(list.get(i)+" ");
    //    }
    //    System.out.println();
      

       // problem 2
       // find maximum in an arraylist 
    //    int max=Integer.MIN_VALUE;

    //    for(int i=list.size()-1; i>=0; i--){
    //     if(list.get(i)>max){
    //         max=list.get(i);
    //     }
    //    }
    //    // max=Math.max(max,list.get(i));
    //    System.out.println("max element = "+ max);
       

       // problem 3 
       // swap 2 number 
      //  int indx1=1, index2=3;
      //  System.out.println(list);
      //  swap(list, indx1, index2);
      //  System.out.println(list);

       // problem 4 
       // sorting an arraylist 
       //collections.sort()  asending 

   //     Collections.sort(list);
   //     System.out.println(list);
   //     // decending 
   //     Collections.sort(list, Collections.reverseOrder());
   //     // Comparators - fnx logic  defined the logic 
   //     System.out.println(list);

   //     //implementation 
   //     // 
   //     // Multi-dimentsional Arraylist 
   //     // syntax 
   //     ArrayList< ArrayList <Integer>> mainlist= new ArrayList<>();
   //     ArrayList<Integer> list4= new ArrayList<>();
   //     list4.add(1); list4.add(2);
   //     mainlist.add(list4);
   //     ArrayList<Integer> list5= new ArrayList<>();
   //     list5.add(9);
   //     list5.add(8);
   //     mainlist.add(list5);
   //     for(int i=0; i<mainlist.size(); i++){
   //      ArrayList<Integer> currList= mainlist.get(i);
   //      for(int j=0; j<currList.size(); j++){
   //          System.out.print(currList.get(j)+" ");
   //      }
   //      System.out.println();
   //     }
   //     System.out.println(mainlist);

       ArrayList<ArrayList<Integer>> mainList2= new ArrayList<>();
       ArrayList<Integer> list6= new ArrayList<>();
       ArrayList<Integer> list7= new ArrayList<>();
       ArrayList<Integer> list8= new ArrayList<>(); 

       for(int i=1; i<=5; i++){
         list6.add(i*1); // 1,2,3,4,5
         list7.add(i*2);// 2,4,6,8,10
         list8.add(i*3);// 3,6,9,12,15 
       }
        mainList2.add(list6);
        mainList2.add(list7);
        mainList2.add(list8);
        
        System.out.println(mainList2); 

        // nested loops 
        for(int i=0; i<mainList2.size(); i++){
         ArrayList<Integer> currList = mainList2.get(i);
         for(int j=0; j<currList.size(); j++){
            System.out.print(currList.get(j)+ " ");
         }
         System.out.println();
        }
   //  }
    // 48:27 
      }
}


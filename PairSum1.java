import java.util.*;
public class PairSum1 {

    public static boolean pairsum1(ArrayList<Integer> list, int target){
          // brute force 
        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         if(list.get(i)+ list.get(j)== target){
        //             return true;
        //         }
        //     }
        // }
       // return false;
        
         // 2 pointer approach 
         int lp=0;
         int rp=list.size()-1;
         while(lp != rp){
            //case 1
            if(list.get(rp)+ list.get(lp)== target){
                return true;
            } else if((list.get(rp)+ list.get(lp)) < target){
                lp++;
            }else{
                rp--;
            }
            //case 2
            //case 3
         }

         return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
   // pair sum 2 is sorted and rotated 
   // find pivot point 
   // modular arthmatic mod % 
   // case 1 lp=(lp+1)%n
   // case 2 rp=(n+rp-1)%n 
     int bp=-1;
     for(int i=0; i<list.size(); i++){
        if(list.get(i)> list.get(i+1)){
            // breaking point 
            bp=i;
            break;
        }
     }
     int lp= bp+1; // smalleast 
     int rp = bp;// target 
    int n=list.size();

     while(lp != rp){
        // case 1 
        if(list.get(lp)+ list.get(rp)== target){
            return true;
        }

        if(list.get(lp)+ list.get(rp) < target){
            lp=(lp+1)%n;
        }else{
            rp=(n+rp-1)%n;
        }
     }
     return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       list.add(10);
       int target=16;
        
      // System.out.println(pairsum1(list, target));
      System.out.println(pairSum2(list, target));

    }
}

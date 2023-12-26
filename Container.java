 import java.util.*;
public class Container {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        // brute 
        // for(int i=0; i<height.size(); i++){
        //     for(int j=i+1; j<height.size(); j++){
        //         int heightOFcontainer=Math.min(height.get(i),height.get(j));
        //         int width=j-i;
        //         int currWater= heightOFcontainer * width;
        //         maxWater=Math.max(maxWater, currWater);
        //     }
        // }
          
        // 2 pointer approach 
        int lePointer=0;
        int riPointer=height.size()-1;
        while(lePointer < riPointer)
       {
            int ht=Math.min(height.get(riPointer), height.get(lePointer));
            int width=riPointer-lePointer;
            int currWater= ht*width;
            maxWater=Math.max(maxWater, currWater);
            if(height.get(lePointer) < height.get(riPointer)){
                lePointer++;

            }else{
                riPointer--;
            }
            
        
        }

        return maxWater;
    }
    public static void main(String[] args) {
        // Container with most water (IMP)
        // Brute force - pair sum -- nested loops 
        // optimize Two pointer approach 
        // take one by one to take all posible ways to max \

        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
         height.add(8);
          height.add(6);
           height.add(2);
            height.add(5);
             height.add(4);
              height.add(8);
               height.add(3);
                height.add(7);

        System.out.println(storeWater(height));

    }
}

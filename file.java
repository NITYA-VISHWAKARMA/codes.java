import java.util.HashMap;
class main{
    public static void main(String []args){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(1, 10);
        map.put(1, 10);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(11,0));

        for (int x:map.keySet()){
            System.out.println(map.get(x));
        }
        int ar[] ={1,2,2,3,4,6,6,};
        for (int x : ar){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        System.out.println(map);
         
// 

        HashMap<Character,Integer> map = new HashMap<>();
        String str = "aacdde";
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);  
        for (char ch : str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }

// 

         HashMap<Integer,Integer>map = new HashMap<>();
         int arr[] = {2,7,5,4};
         int target = 9;
         for(int i=0; i<arr.length; i++){
           int diff=target-arr[i];
         
         if(map.containsKey(diff)){
            System.out.println(map.get(diff) + " "+ i);
            break;
         }
         map.put(arr[i],i);
        }
    }
}

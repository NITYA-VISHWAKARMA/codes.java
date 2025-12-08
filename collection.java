import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// public class main{
//     public static void main(String []args){
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         Iterator<Integer> it = list.iterator();
//         while (it.hasNext()) {
//             System.out.println(it.next());
    //         if(it.next()==6){
    //             it.remove();
    // }
// }    
//     }
    

// public class main{
//     public static void main(String []args){
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         Iterator<Integer> it = list.iterator();
//             while (it.hasNext()) {
//             System.out.println(it.next());
//             if(it.next()==6){
//                 it.remove();
//          }
//         }
//     }
// }

// public class main{
//     public static void main(String []args){
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         Iterator<Integer> it = list.iterator();
//         listIterator<Integer> it = list.listIterator();
//         while (it.hasNext()) {
//             Integer x= it.next();
//             if(x==7){
//             it.add(10);
//             it.set(5);
//         }
//             System.out.println(list);
//         }
//             // System.out.println(list);
//     }
// }

public class main{
    public static void main(String []args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        Iterator<Integer> it = list.iterator();
        ListIterator<Integer> it = list.listIterator();
         while (it.hasNext()) {
            Integer x=it.next();
            System.out.println(x);
        }
        while (it.hasPrevious()) {
            Integer y=it.previous();
            System.out.println(y);
        }
    }
}






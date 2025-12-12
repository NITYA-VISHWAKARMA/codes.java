 class myThread implements Runnable{

      public void run(){
        System.out.println("hello");
      }
    }

class Main {
    public static void main(String[] args) {
        myThread task = new myThread();
        Thread t1 = new Thread(task);
        // Thread t2 = new Thread(task);
        t1.start();
        // t2.start();
        }
}
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int data = list.stream().reduce(0,(a,b)->a+b);
        List<Integer> res = list.stream().filter(n->n>7).toList();
        List<Integer> mapRes = list.stream().map(n->n*2).toList();
        List<Integer> skip= list.stream().skip(2).toList();
        List<Integer> limit= list.stream().limit(2).toList();
        List<Integer> sort = list.stream().sorted((a,b)->a-b).toList();
         System.out.println(data);
        System.out.println(res);
        System.out.println(mapRes);
        System.out.println(skip);
        System.out.println(limit);
        System.out.println(sort);

    }
}
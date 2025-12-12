// class MyThread extends Thread{
//     public void run(){
//         int i;
//         System.out.println("hello");
//         System.out.println(Thread.currentThread().getName());
//         for (i=0;i<5;i++){
//             System.out.println(i + "t1");
//             try {
//                 Thread.sleep(2000);           
//             } catch (Exception e) {
               
//             }
//         }
//     }
// }


// class main{
//     public static void main(String []args){
//         System.out.println(Thread.currentThread().getName());
//         MyThread t1 = new MyThread();
//         t1.start();
//         try {
//             t1.join();
//         } catch (Exception e) {
           
//         }
//         int i;
//          for (i=0;i<5;i++){
//             System.out.println(i + "main");
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//             }
//     }
// }
// }

// class MyThread extends Thread{
//         public void run(){
//             for( int i=0;i<=5;i++){
//                 System.out.println("downloading file" + (i*20) +"%");
//             }
            
//             try {
//             Thread.sleep(2000);
//         } catch (Exception e) {
            
//         }
//         }
//     }


// class main {

//      public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start();
//         try {
//             t1.join();
//         } catch (Exception e) {
//         }
//         for (int i=0;i<=5;i++){
//             System.out.println("Timer"+" "+ i);
//         }
//         try {
//             Thread.sleep(400);
//         } catch (Exception e) {
           
//         }
//      }
//     }
// }

class Bank { 
     int balance = 100;
  synchronized   void withdraw(int amt) {
            System.out.println(Thread.currentThread().getName() + " checking balance...");
            if (balance >= amt) {
                System.out.println(Thread.currentThread().getName() + " proceeding withdraw...");
                balance = balance - amt;
                System.out.println("Balance left: " + balance);
            } else {
                System.out.println("Not enough balance");
            }
        }
    }

    class MyThread extends Thread {
        Bank b;
        MyThread(Bank b) { this.b = b; }

        public void run() {
            b.withdraw(100);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Bank b = new Bank();
            MyThread t1 = new MyThread(b);
            MyThread t2 = new MyThread(b);
            t1.setName("om");
            t2.setName("Aman");
            t1.start();
            t2.start();
        }
    }








    


// package Day39;

// public class Thread_priorities {
//   public static void main(String[] args) {
//     System.out.println("extending in class");
//     Thread1 t1 = new Threead1("Sabita ");
//     Thread1 t2 = new Thread1("Janaki");
//     Thread1 t3 = new Thread1("Nilam");
//     Thread1 t4 = new Thread1("Nabraj");
//     Threead1 t5 = new Threead1("Sona");
//     t1.setPriority(Thread.MAX_PRIORITY);
//     t5.setPriority(Thread.MIN_PRIORITY);
//     t3.setPriority(Thread.MIN_PRIORITY);
//     t2.setPriority(Thread.MIN_PRIORITY);
//     t4.setPriority(Thread.MIN_PRIORITY);
//     t1.start();
//     t2.start();
//     t3.start();
//     t4.start();
//     t5.start();

//   }
// }

// // by extending the thread in class
// class Threead1 extends Threead {
//   public Thread1(String name) {
//     super(name);
//     // System.out.println(name);
//   }

//   public void run() {
//     int i = 0;
//     while (i < 100) {
//       System.out.println("Arigatō " + getName());
//       i++;
//     }
//   }
// }

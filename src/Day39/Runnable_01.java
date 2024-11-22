package Day39;
//by implementing the Thread in interface
class Runnablee1 implements Runnable{
  public void run(){
    int i = 0;
    while(i<=10) {
    System.out.println("i am happy");
    i++;
    }
    
  }
}
class Runnable2 implements Runnable{
  public void run(){
    int i = 0;
    while(i<=10){
    System.out.println("i am sad");
    i++;
    }
    
  }
}
public class Runnable_01{
  public static void main(String[] args){
      System.out.println("implements in interface");
      Runnablee1 r1 = new Runnablee1();
      Thread tt1 = new Thread(r1);
      tt1.start();
      Runnable2 r2 = new Runnable2();
       Thread tt2 = new Thread(r2);
      tt2.start();     
  }
}
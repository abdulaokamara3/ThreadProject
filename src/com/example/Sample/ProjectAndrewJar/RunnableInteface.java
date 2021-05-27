package com.example.Sample.ProjectAndrewJar;

public class RunnableInteface {
    public static void main(String[] args) {
 // Thread thread = new Thread(new RunnableInteface());
//       Thread hht = new Thread();
//        hht.start();
        System.out.println("..Application started...1");
        Runnable rr = new Myclass();
        Thread thread= new Thread(rr);
        thread.start();
   //     Myclass ppp= new Myclass();
  //      ppp.start();
  //      ppp.executeTask();
        for (int i =5;i<=10;i++){
          System.out.println("Print the document3 " + i);
      }
        System.out.println("...Application finished...3");
    }
}
//class Myclass{
//    public void  executeTask(){
//        for (int i =5;i<=10;i++){
//            System.out.println("Print the document 2 " + i);
//        }
//    }
//
//}
class pp{

}
class Myclass extends pp implements Runnable{

    public void  run(){
        for (int i =5;i<=10;i++){
            System.out.println("Print the document2 " + i);
        }
    }

}

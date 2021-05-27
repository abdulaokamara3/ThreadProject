package com.example.Sample.ProjectAndrewJar;

public class MyThread {

    public static void main(String[] args) {
        System.out.println("excute me first");
        Kanu kanu = new Kanu();
        //kanu.additionOfTwoNumber("andrew",6.3);
        T1 gigi = new T1(kanu,"woo");
        gigi.start();
        System.out.println("i am last");
    }
}
//this is the first class
  class Kanu{
        //the for loop should be within a method
     public void additionOfTwoNumber(String name,double age){
         for (int j=0;j<=age;j++){
             try {
                 Thread.sleep(3000);
             }catch (InterruptedException tt){
                tt.printStackTrace();
             }
             System.out.println("my name is " +name+ "and the age is "+j);
         }
     }
    }
//this is the second class
class T1 extends Thread{
    Kanu oju;
    String voice;

    public T1(Kanu oju, String voice) {
        this.oju = oju;
        this.voice = voice;
    }
    public void run(){
       // System.out.println("her voice is melode" +voice);
            oju.additionOfTwoNumber("agnes ",13);

    }
}
//this is the third class
//class T2 extends Thread{
//
//}
//

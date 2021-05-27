package com.example.Sample.ProjectAndrewJar;

public class synApp {
    //representing main thread
//  //  public static void main(String[] args) {
//        System.out.println("== Application Started== ");
//        Printers ff = new Printers();
//        //ff.printDemo(5,"Atomic chemistry");
//        myThread mmThread = new myThread(ff);
//        mmThread.start();
//
//        System.out.println("%% Application ended %% ");
//    }
}
class myThread extends Thread{
    Printers waterbk;

    public myThread(Printers waterbk) {
        this.waterbk = waterbk;
    }
    public void run() {
        waterbk.printDemo(10,"may");
    }
}
class Printers{
    public void printDemo(int num,String doc){
        for (int i= 0;i<=num;i++){
            System.out.println(">> printing document >>" +doc+"  "+i);

        }
    }

}

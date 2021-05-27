    package com.example.Sample.ProjectAndrewJar;
        public class Main{
                public static void main(String[] args) {
            // write your code here
                    System.out.println("==Application Started ==");
    //                Main.Printer pp =new  Main().new Printer();
    //                pp.printDocument(2,"river");
                    Printer printer = new Printer();
                    //printer.printDocument(3,"mary.pdf");
                    Ojuku ojuku = new Ojuku(printer);
                    youOjuku ojukuw = new youOjuku(printer);
                    ojuku.start();
//                    try {
//                        ojuku.join();
//                    }catch (InterruptedException pp){
//                        pp.printStackTrace();
//                    }

                    ojukuw.start();
                    System.out.println("==Application finished==");
                     }
        }
    class Printer{
        void printDocument(int numberOfCopy,String docName){
            for (int i = 1;i<=numberOfCopy;i++){
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException uu){
                    System.out.println("hanndle the exception error :" +uu);
                }

                System.out.println("print document " +docName +" " +i);
            }
        }
    }
    class Ojuku extends Thread{
            Printer prr;

        public Ojuku(Printer prr) {
            this.prr = prr;
        }

        public void run(){
            synchronized (prr) {
                prr.printDocument(4, "noted");
            }
            }
    }
    class youOjuku extends Thread{
        Printer prr;

        public youOjuku(Printer prr) {
            this.prr = prr;
        }

        public void run(){
            synchronized (prr) {
               // System.out.println(prr);
               prr.printDocument(8, "noted");
            }
        }


    }



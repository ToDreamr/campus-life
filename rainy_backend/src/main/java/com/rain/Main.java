package com.rain;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Main {
    //创建几个线程来实现循环打印ABC
    public static void main(String[] args) {
        int num = 1;
        PrintABC printABC = new PrintABC(num,10);

        //创建线程实现：
        Thread A=new Thread(new A(printABC));
        Thread B=new Thread(new B(printABC));
        Thread C=new Thread(new C(printABC));

        A.start();
        B.start();
        C.start();
    }
}

    class A implements Runnable{

        private PrintABC printABC;
        public A(PrintABC printABC){
            super();
            this.printABC=printABC;
        }

        @Override
        public void run() {
            printABC.printA();
        }
    }
    class B implements Runnable{

        private PrintABC printABC;
        public B(PrintABC printABC){
            super();
            this.printABC=printABC;
        }

        @Override
        public void run() {

            printABC.printB();
        }
    }
    class C implements Runnable{

        private PrintABC printABC;
        public C(PrintABC printABC){
            super();
            this.printABC=printABC;
        }

        @Override
        public void run() {

            printABC.printC();
        }
    }
    class PrintABC{
        private  final Lock lock=new ReentrantLock();
        private int  num;//当前线程号码数
        private int loop;
        public PrintABC(int num,int loop){
            super();
            this.num=num;
            this.loop=loop;
        }

        public void printA(){
            for (int i = 0; i <loop; ) {
                try{
                    lock.lock();//加上锁，占用线程
                    while(num==1){
                            System.out.println("A");
                        num=2;
                        i++;
                    }
                }finally{
                    lock.unlock();//释放锁资源
                }
            }
        }


        public void printB(){
            for (int i = 0; i <loop; ) {
                try{
                    lock.lock();//加上锁，占用线程
                    while(num==2){
                            System.out.println("B");
                        num=3;
                        i++;
                    }
                }finally{
                    lock.unlock();//释放锁资源
                }
            }
        }


        public void printC(){
            for (int i = 0; i <loop; ) {
                try{
                    lock.lock();//加上锁，占用线程
                    while(num==3){
                            System.out.println("C");
                        num=1;
                        i++;
                    }
                }finally{
                    lock.unlock();//释放锁资源
                }
            }
        }
    }
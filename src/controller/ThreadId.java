package controller;

public class ThreadId extends Thread{
    private long idThreads;

    public ThreadId(int idThreads) {
        this.idThreads = getId();
    }

    @Override
    public void run() {
        System.out.println(idThreads);
    }
}

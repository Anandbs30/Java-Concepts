package V33_MultiThreadding.Synchronization.Locking.DeadLock;

class Pen1 {
    public synchronized void writeWithPenAndPaper(Paper1 paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper1 {
    public synchronized void writeWithPaperAndPen(Pen1 pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + pen);
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

class Task3 implements Runnable {
    private Pen1 pen;
    private Paper1 paper;

    public Task3(Pen1 pen, Paper1 paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}

class Task4 implements Runnable {
    private Pen1 pen;
    private Paper1 paper;

    public Task4(Pen1 pen, Paper1 paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
    	//Here below we used the synchronized keyword so through this Deadlock is not occur.
        synchronized (pen){
            paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen
        }
    }
}


public class DeadLock_Resolve {
    public static void main(String[] args) {
        Pen1 pen = new Pen1();
        Paper1 paper = new Paper1();
        Thread thread1 = new Thread(new Task3(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task4(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
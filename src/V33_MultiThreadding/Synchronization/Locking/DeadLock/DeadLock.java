package V33_MultiThreadding.Synchronization.Locking.DeadLock;
/*
 * DeadLock is an situation in the multithreading where two or more threads are blocked forever, waiting for each other to release a source. 
 * This typically occurs when two or more threads have circular dependencies on a set of blocks  
 * 
 * The DeadLock occurs when below 4 conditions are met simultaneously.
 * 1). Mutual Exclusion : Only one thread can access a resource at a time.
 * 2). Hold and Wait : A thread holding at least one resource is waiting to acquire additional resources held by other threads.
 * 3). No Preemption : Resources cannot be forcibly taken from threads holding them.
 * 4). Circular Wait : A set of threads is waiting for each other in a circular chain.
 * 	
 */

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + pen);
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen){
            paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen
        }
    }
}


public class DeadLock {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

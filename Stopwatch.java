package assignment;

public class Stopwatch {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;
    public void start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop(){
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }
    public long getElapsedTimeSecs(){
        long elapsed;
        if (running){
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }else {
            elapsed = ((stopTime - startTime) / 1000);
        }
        return elapsed;
    }

    public static void main(String[] args) {
        Stopwatch obj = new Stopwatch();
        obj.start();
        obj.stop();
        System.out.println("elapsed time in seconds:" +obj.getElapsedTimeSecs());
    }
}

package TemplateMethodPattern;

/**
 * Created by mevur on 2017/4/25.
 */
public class HummerH1Model extends CarModel {
    @Override
    public void start() {
        System.out.println("Hummer H1 start.");
    }

    @Override
    public void stop() {
        System.out.println("Hummer H1 stop.");
    }

    @Override
    public void alarm() {
        System.out.println("Hummer H1 is alarming.");
    }

    @Override
    public void engineBoom() {
        System.out.println("Hummer H1 engine is booming.");
    }

    @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}

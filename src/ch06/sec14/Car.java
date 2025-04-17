package ch06.sec14;

public class Car {

    private int speed;
    private boolean stop;

    public Car(){
    }

    public Car(int speed, boolean stop) {
        this.speed = speed;
        this.stop = stop;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed<0){
            this.speed = 0;
            return;
        }else{
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        if(stop){
            this.speed = 0;
        }else{
            this.stop = stop;
        }
    }
}

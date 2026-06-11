package ai0611.lab.subcar;

import ai0611.lab.car.Car;

public class Schoolbus extends Car {
    @Override
    public  void  upSpeed(int speed) {
        super.upSpeed(speed);
        if(this.speed >= 100){
            this.speed = 100;
        }

    }
}

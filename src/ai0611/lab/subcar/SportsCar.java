package ai0611.lab.subcar;

import ai0611.lab.car.Car;

public class SportsCar  extends ai0611.lab.car.Car {
    @Override
    public  void  upSpeed(int speed) {
        super.upSpeed(speed);
        if(this.speed >= 500){
            this.speed = 500;
        }
    }

}

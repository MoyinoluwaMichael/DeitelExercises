package tdd;

public class AutomaticBike {

    public boolean isOn;
    public boolean isOff;
    public int speed;


    public void setIsOn(boolean power) {
        isOn = power;
        if (isOn){
            isOff = false;
        }
    }
    public boolean getIsOn() {
        return isOn;
    }
    public void setIsOff(boolean power) {
        isOff = power;
        if (isOff) {
            isOn = false;
        }
    }
    public boolean getIsOff() {
        return isOff;
    }
    public void setSpeed(int kmh){
        if (isOn) {
            speed = kmh;
        }
    }
    public int getSpeed(){
        return speed;
    }
    public void accelerate(int gear){
        if(isOn) {

            if (speed >= 0 && speed <= 20 && gear == 1){
                speed += gear;
            }
            if (speed >= 21 && speed <= 30 && gear == 2){
                speed += gear;
            }
            if (speed >= 31 && speed <= 40 && gear == 3){
                speed += gear;
            }
            if (speed >= 41 && gear == 4){
                speed += gear;
            }
        }
    }
    public void decelerate(int gear){
        if (isOn) {

            speed = speed - gear;
        }
    }

}

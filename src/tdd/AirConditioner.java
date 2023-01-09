package tdd;

public class AirConditioner {
    private boolean isOn;
    private boolean isOff;
    private int temperature;

    public void setOn(boolean power){
        isOn = power;
        if (isOn){
            isOff = false;
        }
    }
    public boolean getIsOn(){
        return isOn;
    }
    public boolean getIsOff(){
        return isOff;
    }
    public void setOff(boolean power) {
        isOff = power;
        if (isOff){
            isOn = false;
        }
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int degree){
        if (isOn && degree >= 16 && degree <= 30){
            temperature = degree;
        }
    }
    public void increaseTemperature(int degree) {
        if (isOn && temperature + degree <= 30) {
            temperature = temperature + degree;
        }
        else if (temperature + degree > 30) {
            temperature = 30;
        }
    }
    public void decreaseTemperature(int degree) {
        if (isOn && temperature - degree >= 16) {
            temperature = temperature - degree;
        }
        else if (temperature - degree < 16) {
            temperature = 16;
        }
    }
}

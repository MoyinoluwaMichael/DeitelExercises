package tdd;

public class Mp3PlayerDevice {
    private boolean isOn;
    private boolean isOff;
    private String powerStatus;
    private int batteryStatus;

    public void setPower(String action) {
        if (action.equalsIgnoreCase("on")) {
            isOff = false;
            isOn = true;
            System.out.println(getPowerStatus());
            System.out.println("Battery level: " + getBatteryStatus()+"%");

            String lowBatteryMessage = "Your battery is low, consider charging your mp3 player.";
            if (batteryStatus < 10) {
                System.out.println(lowBatteryMessage);
            }
            displayInitialScreen();

        } else if (action.equalsIgnoreCase("off")) {
            isOn = false;
            isOff = true;
            getPowerStatus();
        }
    }

    public String getPowerStatus() {
        if (isOn) {
            powerStatus = "POWER ON!";
        } else if (isOff) {
            powerStatus = "POWER OFF!";
        }
        return powerStatus;
    }

    public void setBattery(int percentage) {
        batteryStatus += percentage;
    }

    public void charge(int timeInMinute) {
        int percentagePerMinute = 2;
        batteryStatus += timeInMinute * percentagePerMinute;
        if (batteryStatus > 100) {
            batteryStatus = 100;
        }
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }


    private void displayInitialScreen() {
        System.out.print("""
                ORAIMO MP3 PLAYER
                1. Power off
                2. Playlist
                3. Charge
                                
                Select options: """);
    }
}



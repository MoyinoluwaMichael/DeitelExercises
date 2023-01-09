package chapterFive.assignment.mp3Player;

public class Mp3Player {
    private boolean power;
    private int batteryStatus;

    public void setPowerOn(boolean powerStatus) {
        if (powerStatus) {
            getPowerStatus();
            getBatteryStatus();
            displayInitialScreen();
            power = true;
        }
    }

    public void setPowerOff(boolean powerStatus) {
        if (!powerStatus) {
            power = false;
        }
    }

    public boolean getPowerStatus() {
        if (power) {
            System.out.println("POWER ON!");
        }
        return power;
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
        if (batteryStatus < 10){
            System.out.println("Your battery is low, consider charging.");
        }
        System.out.print("Battery level: ");
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




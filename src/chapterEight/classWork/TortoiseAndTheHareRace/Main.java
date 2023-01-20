package chapterEight.classWork.TortoiseAndTheHareRace;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final SecureRandom random = new SecureRandom();

        RaceTrack newRace = new RaceTrack();
        TimeUnit.SECONDS.sleep(2);

        while (!newRace.isWon() && !newRace.isTie()) {
            newRace.move(1 + random.nextInt(10));
            TimeUnit.SECONDS.sleep(2);
        }
    }
}

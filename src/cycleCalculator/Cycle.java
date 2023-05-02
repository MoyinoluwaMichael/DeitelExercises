package cycleCalculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Cycle {
    private Period period = new Period();
    private LocalDate ovulationDate;
    private SafePeriod[] safePeriods = new SafePeriod[]{new SafePeriod(), new SafePeriod()};


    public Period getPeriod() {
        return period;
    }

    public void setOvulationDate(LocalDate ovulationDate) {
        this.ovulationDate = ovulationDate;
    }

    public SafePeriod[] getSafePeriods() {
        return safePeriods;
    }

    public void setSafePeriods(SafePeriod[] safePeriods) {
        this.safePeriods = safePeriods;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        return String.format("""
                PERIOD
                %s
                Ovulation date: %s
                FIRST SAFE PERIOD
                %s
                SECOND SAFE PERIOD
                %s
                """, period, ovulationDate.format(formatter), safePeriods[0], safePeriods[1]);
    }
}

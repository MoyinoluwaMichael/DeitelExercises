package cycleCalculator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Cycle> cycles = new ArrayList<>();
    private Cycle lastCycle;
    private int cycleInterval;
    private int periodLength;

    public Calculator(String lastPeriodDate, int periodLength, int cycleInterval) {
        this.periodLength = periodLength;
        String[] dates = lastPeriodDate.split("/");
        LocalDate firstDayDateOfTheLastCycle = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
        lastCycle = new Cycle(firstDayDateOfTheLastCycle, firstDayDateOfTheLastCycle.plusDays(periodLength));
        lastCycle.setEndDate(lastCycle.getStartDate().plusDays(periodLength));
        this.cycleInterval = cycleInterval;
    }

    public List<Cycle> calculateCyclesOverThePeriodOf(int periodInMonth) {
        LocalDate startDate = lastCycle.getEndDate().plusDays(cycleInterval);
        cycles.add(new Cycle(startDate, startDate.plusDays(periodLength)));
        for (int i = 0; i < periodInMonth; i++) {
            startDate = cycles.get(i).getEndDate().plusDays(cycleInterval);
            cycles.add(new Cycle(startDate, startDate.plusDays(periodLength)));
        }
        return cycles;
    }
}

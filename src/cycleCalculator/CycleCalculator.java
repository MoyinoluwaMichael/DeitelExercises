package cycleCalculator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CycleCalculator {

    private List<Cycle> cycles = new ArrayList<>();
    private LocalDate lastPeriodStartDate;
    private int cycleInterval;
    private int periodLength;

    public CycleCalculator(String lastPeriodStartDate, int periodLength, int cycleInterval) {
        String[] dates = lastPeriodStartDate.split("/");
        this.lastPeriodStartDate = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
        this.periodLength = periodLength;
        this.cycleInterval = cycleInterval;
    }

    public List<Cycle> calculateCyclesOverThePeriodOf(int periodInMonth) {
        cycles.add(calculateNextCycle(lastPeriodStartDate));
        for (int i = 0; i < periodInMonth; i++) {
            cycles.add(calculateNextCycle(cycles.get(i).getPeriod().getStartDate()));
        }
        return cycles;
    }

    private Cycle calculateNextCycle(LocalDate lastPeriodStartDate) {
        Cycle cycle = new Cycle();
        cycle.getPeriod().setStartDate(lastPeriodStartDate.plusDays(cycleInterval));
        cycle.getPeriod().setEndDate(cycle.getPeriod().getStartDate().plusDays(periodLength));
        cycle.setOvulationDate(cycle.getPeriod().getStartDate().plusDays(14));
        cycle.getSafePeriods()[0].setStartDate(cycle.getPeriod().getEndDate());
        cycle.getSafePeriods()[0].setEndDate(cycle.getSafePeriods()[0].getStartDate().plusDays(3));
        cycle.getSafePeriods()[1].setStartDate(cycle.getPeriod().getStartDate().plusDays(cycleInterval-3));
        cycle.getSafePeriods()[1].setEndDate(cycle.getPeriod().getStartDate().plusDays(cycleInterval-1));
        return cycle;
    }
}

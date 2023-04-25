package cycleCalculator;

import java.time.LocalDate;

public class Cycle {
    private LocalDate startDate;
    private LocalDate endDate;


    public Cycle(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return String.format("""
                Start date: %s
                End date: %s
                """, startDate, endDate);
    }
}

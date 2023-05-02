package cycleCalculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SafePeriod {
    private LocalDate startDate;
    private LocalDate endDate;

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

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        return String.format("""
                Start date: %s
                End date: %s
                """, startDate.format(formatter), endDate.format(formatter));
    }
}

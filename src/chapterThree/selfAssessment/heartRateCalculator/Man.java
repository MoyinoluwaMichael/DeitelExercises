package chapterThree.selfAssessment.heartRateCalculator;

public class Man {
    private String name;
    private String firstName;
    private String lastName;
    private int dateOfBirthInDay;
    private int dateOfBirthInMonth;
    private int dateOfBirthInYear;


    public Man(String firstName, String lastName, int dobInDay, int dobInMonth, int dobInYear){
        name = firstName + lastName;
        dateOfBirthInDay = dobInDay;
        dateOfBirthInMonth = dobInMonth;
        dateOfBirthInYear = dobInYear;
    }
    public Man(){}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getName(){
        name = firstName + " " + lastName;
        return name;
    }
    public void setDateOfBirthInDay(int dobInDay){
        dateOfBirthInDay = dobInDay;
    }
    public int getDateOfBirthInDay(){
        return dateOfBirthInDay;
    }
    public void setDateOfBirthInMonth(int dobInMonth){
        dateOfBirthInMonth = dobInMonth;
    }
    public int getDateOfBirthInMonth(){
        return dateOfBirthInMonth;
    }
    public void setDateOfBirthInYear(int dobInYear){
        dateOfBirthInYear = dobInYear;
    }
    public int getDateOfBirthInYear(){
        return dateOfBirthInYear;
    }
    public void setAge(){
    }
    public int getAge(){
        return 2022 - getDateOfBirthInYear();
    }
    public int calculateMaximumHeartRate(){
        int maximumHeartRateFormula = 220;
        return maximumHeartRateFormula - getAge();
    }
    public double calculateMinimumTargetHeartRate(){
        int maximumHeartRateFormula = 220;
        int maximumHeartRate = maximumHeartRateFormula - getAge();
        return (50.0/100) * (double)maximumHeartRate;
    }
    public double calculateMaximumTargetHeartRate(){
        int maximumHeartRateFormula = 220;
        int maximumHeartRate = maximumHeartRateFormula - getAge();
        return (85.0/100) * (double)maximumHeartRate;
    }








}

package chapterThree.selfAssessment.computerizationOfHealthRecords;

public class HealthProfile {
    private String name;
    private String gender;
    private String dateOfBirth;
    private int age;
    private double height;
    private double weight;
    private String bmiStatus;

    public HealthProfile(String firstName, String lastName, String gender, int dobInDay, int dobInMonth, int dobInYear,
                         double heightInInches, double weightInPounds){
        name = firstName + " " + lastName;
        this.gender = gender;
        dateOfBirth = String.valueOf(dobInDay) + ":" + String.valueOf(dobInMonth) + ":" + String.valueOf(dobInYear);
        int presentYear = 2022;
        age = presentYear - dobInYear;
        height = heightInInches;
        weight = weightInPounds;
    }


    public void setName(String firstName, String lastName){
        name = firstName + " " + lastName;
    }
    public String getName(){
        return name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setDateOfBirth(int day, int month, int year){
        dateOfBirth = String.valueOf(day) + ":" + String.valueOf(month) + ":" + String.valueOf(year);
        int presentYear = 2022;
        age = presentYear - year;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(double heightInInches){
        height = heightInInches;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(int weightInPounds){
        weight = weightInPounds;
    }
    public double getWeight(){
        return weight;
    }
    public int getMaximumHeartRate(){
        int maximumHeartRateFormula = 220;
        return maximumHeartRateFormula - age;
    }
    public String getTargetHeartRateRange(){
        int maximumHeartRateFormula = 220;
        double minimumTargetHeartRate =  (50.0/100) * (double)getMaximumHeartRate();
        double maximumTargetHeartRate = (85.0/100) * (double)getMaximumHeartRate();
        return String.valueOf(minimumTargetHeartRate + " - " + maximumTargetHeartRate);

    }
    public double getBmi(){
        double bmi = (weight * 703)/(height*height);
        if (bmi < 18.5){
            bmiStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            bmiStatus = "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            bmiStatus = "Overweight";
        }
        else {
            bmiStatus = "Obesity";
        }
        return bmi;
    }
    public String getBmiStatus(){
        return bmiStatus;
    }


}

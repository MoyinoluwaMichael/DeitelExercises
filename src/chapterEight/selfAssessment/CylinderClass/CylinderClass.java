package chapterEight.selfAssessment.CylinderClass;

public class CylinderClass {
    private int radius;
    private int height;


    public CylinderClass(){
        radius = 1;
        height = 1;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            throw new IllegalArgumentException("Radius must be positive number");
        }
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0){
            throw new IllegalArgumentException("Height must be positive number");
        }
        this.height = height;
    }
    public double calculateCylinderVolume(){
        return Math.PI * (radius*radius) * height;
    }
}

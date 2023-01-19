package chapterEight.selfAssessment.CylinderClass;

public class CylinderClassTest {
    public static void main(String[] args) {

        CylinderClass cylinder = new CylinderClass();
        cylinder.setHeight(45);
        cylinder.setRadius(23);
        System.out.println(cylinder.calculateCylinderVolume());
    }
}

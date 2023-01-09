package chapterThree.selfAssessment.car;

public class CarApplication {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota Corolla","2020",2540000);
        Car car2 = new Car("Venza","2022",10000000);

        double car1Price = car1.getPrice();
        String car1Model = car1.getModel();
        String car1Year = car1.getYear();

        double car2Price = car2.getPrice();
        String car2Model = car2.getModel();
        String car2Year = car2.getYear();

        System.out.printf("%s, %s's price is: %.3f%n%s, %s's price is: %.3f%n%n",car1Model,car1Year,car1Price,car2Model,car2Year,car2Price);

        car1.calculateDiscount(0.05);
        car1Price = car1.getPrice();
        car2.calculateDiscount(0.007);
        car2Price = car2.getPrice();

        System.out.println("Effecting discount...\n");

        System.out.printf("%s, %s's new price is: %.3f%n%s, %s's new price is: %.3f",
                car1Model,car1Year,car1Price,car2Model,car2Year,car2Price);

    }
}

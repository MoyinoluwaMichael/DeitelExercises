package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        System.out.println(getNumber.get());
    }
    static Supplier<Integer> getNumber = () -> 4;
}

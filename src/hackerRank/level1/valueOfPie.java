package hackerRank.level1;

public class valueOfPie {
    public static void main(String[] args) {
        double pie = 4;
        double copy = pie;
        int count = 0;
        int numberOfTerm = 0;
        for (int i = 1; i <= 200000; i++) {
            pie = i % 2 != 0 ? pie - (copy / ((copy - 1) + count)) : pie + (copy / ((copy - 1) + count));
            System.out.printf("%s ==> %.5f%n",i, pie);
            if (String.format("%.5f", pie).equals("3.14159")) numberOfTerm = numberOfTerm == 0 ? i : numberOfTerm;
            count += 2;
        }
        System.out.println(numberOfTerm + " terms were used before getting a value that begins with 3.14159");
    }
}

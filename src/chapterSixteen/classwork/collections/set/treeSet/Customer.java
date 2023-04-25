package chapterSixteen.classwork.collections.set.treeSet;

public class Customer implements Comparable<Customer> {

    private int id;
    private String name;
    private int balance;

    public Customer(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Customer customer) {
        return Integer.compare(this.balance, customer.getBalance());
    }
}

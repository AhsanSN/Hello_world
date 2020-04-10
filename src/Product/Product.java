package Product;
public class Product {

    protected String name;
    protected String pid;
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public Product(){
        System.out.println("Product object constructed");
        Day today = Day.MONDAY;
    }

    public void setProductDetails(String pid, String name){
        System.out.println("Product setProductDetails() called");
        this.pid = pid;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return new Product();
    }

    public void move(){
        System.out.println("Product moved");
    }


    }

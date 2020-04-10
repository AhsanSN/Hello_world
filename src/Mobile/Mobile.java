package Mobile;
import Product.Product;

public class Mobile extends Product {
    protected String ram;
    protected String camera;

    public Mobile(){
        System.out.println("Mobile object created");
    }

    public void setMobileDetails(String pid, String name, String ram, String camera){
        //setting variables
        this.pid = pid;
        this.name = name;
        this.ram = ram;
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setProductDetails(String pid, String name){
        System.out.println("Overridden function called");
        this.pid = pid;
        this.name = name;
    }

    public void move(){
        System.out.println("Mobile moved");
    }

    @Override
    public String getName(){
        return (this.name);
    }
}

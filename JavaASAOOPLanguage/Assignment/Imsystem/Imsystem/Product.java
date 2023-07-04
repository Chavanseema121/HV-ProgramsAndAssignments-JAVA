public class Product {
        private int id;
        private String name;
        private double price;
        private int quantity;
        private String desc;
        private String prod_type;


    public Product(int id, String name, double price, int quantity, String desc, String prod_type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.desc = desc;
        this.prod_type = prod_type;
    }

    public Product() {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProd_type() {
        return prod_type;
    }

    public void setProd_type(String prod_type) {
        this.prod_type = prod_type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", desc='" + desc + '\'' +
                ", prod_type='" + prod_type + '\'' +
                '}';
    }

}
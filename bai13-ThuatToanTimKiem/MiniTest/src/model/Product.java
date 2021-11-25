package model;

public class Product {
        private int id;
        private String name;
        private float price;
        private int quantity;
        private String moTa;
    private static int idNumber = 0;

    public Product() {
    }

    public Product(String name, float price, int quantity, String moTa) {
        this.id = idNumber++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.moTa = moTa;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", moTa='" + moTa + '\'' +
                '}';
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Product.idNumber = idNumber;
    }
}

package asm4;

public class
ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Kích cỡ: " + size;
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.85;
    }
}

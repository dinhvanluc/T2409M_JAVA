package asm4;

public class
FoodProduct extends Product {
    private int expiryDays;

    public FoodProduct(String productId, String name, double price, int expiryDays) {
        super(productId, name, price);
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Còn hạn: " + expiryDays + " ngày";
    }

    @Override
    public double calculateDiscountedPrice() {
        if (expiryDays <= 3) {
            return getPrice() * 0.7;
        } else if (expiryDays <= 7) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}

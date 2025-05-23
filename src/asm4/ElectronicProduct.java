package asm4;

public class
ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String productId, String name, double price, int warrantyMonths) {
        super("");
        setWarrantyMonths(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    private void setWarrantyMonths(String productId, String name, double price) {
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Bảo hành: " + warrantyMonths + " tháng";
    }

    @Override
    public double calculateDiscountedPrice() {
        if (getPrice() > 10000000) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}

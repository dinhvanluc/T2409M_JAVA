package asm4;

import java.util.ArrayList;

public class
ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new ElectronicProduct("E001", "Laptop", 15000000, 24));
        products.add(new FoodProduct("F001", "Bánh mì", 20000, 2));
        products.add(new ClothingProduct("C001", "Áo thun", 300000, "M"));
        products.add(new FoodProduct("F002", "Sữa tươi", 25000, 6));
        products.add(new ElectronicProduct("E002", "Máy giặt", 8000000, 12));

        for (Product product : products) {
            System.out.println(product.getInfo());
            System.out.println("Giá sau giảm: " + product.calculateDiscountedPrice());
            System.out.println("-----");
        }
    }
}

package org.example;

public class WeightProductInPackage extends Product{
    private ProductPackage aPackage;
    private double productWeight;
    private WeightProduct product;

    public WeightProductInPackage(ProductPackage aPackage, double productWeight, WeightProduct product) {
        this.aPackage = aPackage;
        this.productWeight = productWeight;
        this.product = product;
    }

    public double getNet() {
        return productWeight;
    }

    public double getGross() {
        return productWeight + aPackage.getMass();
    }
}

package org.example;

public class SingleProductInPackage extends ProductPackage{
    private ProductPackage aPackage;
    private SingleProduct product;
    private int countOfProduct;

    public SingleProductInPackage(int countOfProduct, SingleProduct product, ProductPackage aPackage) {
        this.aPackage = aPackage;
        this.product = product;
        this.countOfProduct = countOfProduct;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public double getNet() {
        return product.getWeight() * countOfProduct;
    }

    public double getGross() {
        return product.getWeight() * countOfProduct + aPackage.getMass();
    }
}

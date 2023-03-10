package org.example;

public class Consignment {
    private String describe;
    private SingleProductInPackage singleProducts;
    private WeightProductInPackage weightProducts;

    public Consignment(SingleProductInPackage singleProducts, WeightProductInPackage weightProducts, String describe) {
        this.describe = describe;
        this.singleProducts = singleProducts;
        this.weightProducts = weightProducts;
    }

    public double getConsignmentMass() {
        return singleProducts.getGross() + weightProducts.getGross();
    }
}

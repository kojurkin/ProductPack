package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Consignment {
    private String describe;
    private List products;

    public Consignment(List list, String describe) throws Exception {
        if(list == null) {
            throw new Exception("Empty list");
        }
        this.describe = describe;
        this.products = list;
    }

    public double getGross() throws Exception {
        double result = 0;
        for (Object product : products) {
            if (product instanceof SingleProductInPackage) {
                result += ((SingleProductInPackage) product).getGross();
            } else if (product instanceof WeightProductInPackage) {
                result += ((WeightProductInPackage) product).getGross();
            } else {
                throw new Exception("Product isn't right");
            }
        }
        return result;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public List getProducts() {
        return products;
    }

    public void setProducts(List products) throws Exception {
        if (products == null) {
            throw new Exception("Empty list");
        }
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consignment that)) return false;
        return Objects.equals(getDescribe(), that.getDescribe()) && getProducts().equals(that.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescribe(), getProducts());
    }

    @Override
    public String toString() {
        return "Consignment{" +
                "describe='" + describe + '\'' +
                ", products=" + products +
                '}';
    }
}

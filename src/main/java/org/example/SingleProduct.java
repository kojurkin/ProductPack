package org.example;

import java.util.Objects;

public class SingleProduct extends Product{
    private double weight;

    public SingleProduct(String name, String describe, double weight) throws Exception {
        super(name, describe);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleProduct that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getWeight(), getWeight()) == 0 && getName().equals(that.getName()) && getDescribe().equals(that.getDescribe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getDescribe(), getWeight());
    }

    @Override
    public String toString() {
        return "SingleProduct name: " + getName() + ".\nDescribe: " + getDescribe() + "\nWeight: " + weight;
    }
}

package org.example;

import java.util.Objects;

public class ProductPackage {
    private String name;
    private double mass;

    public ProductPackage(String name, double mass) throws Exception {
        if(name == null || name.equals("")) {
            throw new Exception("Give me a name");
        }
        this.name = name;
        this.mass = mass;
    }
    public ProductPackage() {
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPackage that)) return false;
        return Double.compare(that.getMass(), getMass()) == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMass());
    }

    public String toString() {
        return new String("Package name: " + this.name + ".\nMass of Package: " + this.mass + ".");
    }
}

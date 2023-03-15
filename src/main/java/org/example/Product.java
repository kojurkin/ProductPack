package org.example;

import java.util.Objects;

public class Product {
    private String name;
    private String describe;

    public Product(String name, String describe) throws Exception {
        if(name == null || name.equals("")) {
            throw new Exception("Give me a name");
        }
        this.name = name;
        this.describe = describe;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getName().equals(product.getName()) && getDescribe().equals(product.getDescribe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescribe());
    }

    @Override
    public String toString() {
        return new String("Product name: " + this.name + ".\nDescribe: " + this.describe + ".");
    }

    public void setName(String name) throws Exception {
        if(name == null) {
            throw new Exception("Give me a name");
        }
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}

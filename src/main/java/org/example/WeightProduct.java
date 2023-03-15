package org.example;

public class WeightProduct extends Product {
    private String name;
    private String describe;


    public WeightProduct(String name, String describe) throws Exception {
        if(name == null || name.equals("")) {
            throw new Exception("Give me a name");
        }
        this.name = name;
        this.describe = describe;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescribe() {
        return describe;
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

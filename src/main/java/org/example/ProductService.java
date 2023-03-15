package org.example;

public class ProductService {
public static int countByFilter(Consignment part, Filter filter) throws Exception {
    int result = 0;
    if (part == null) {
        throw new Exception("Wrong consignment");
    } if (filter == null) {
        throw new Exception("Wrong filter");
    }
    String tmp = "";
    for(int i = 0; i < part.getProducts().size(); i++) {
        if (part.getProducts().get(i) instanceof SingleProductInPackage) {
            tmp = (String)((SingleProductInPackage) part.getProducts().get(i)).getName();
        } else if (part.getProducts().get(i) instanceof WeightProductInPackage) {
            tmp = (String)((WeightProductInPackage) part.getProducts().get(i)).getName();
        } else {
            throw new Exception("Product isn't right");
        }
        if(filter.apply(tmp)) {
            result++;
        }
    }
    return result;
}
}

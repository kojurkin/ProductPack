package org.example;

public class ProductService {
public static int countByFilter(Consignment part, Filter filter) throws Exception {
    int result = 0;
    if (part == null) {
        throw new Exception("Wrong consignment");
    } if (filter == null) {
        throw new Exception("Wrong filter");
    }
    for(int i = 0; i < part.getProducts().size(); i++) {
        Product product = part.getProducts().get(i);
        if (!(product instanceof SingleProductInPackage) && !(product instanceof WeightProductInPackage)) {
            throw new Exception("Product isn't right");
        }
        if(filter.apply(product.getName())) {
            result++;
        }
    }
    return result;
}
}

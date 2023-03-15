package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConsignmentTest {

    @Test
    void getGross() throws Exception {
        List<Product> prods = new ArrayList<>();
        WeightProduct p2 = new WeightProduct("GoodName", "describe");
        SingleProduct p3 = new SingleProduct("GoodName", "describe", 12);
        ProductPackage pack = new ProductPackage("name",0.5);
        WeightProductInPackage good1 = new WeightProductInPackage(pack,0.5, p2);
        SingleProductInPackage good2 = new SingleProductInPackage(10, p3, pack);
        prods.add(0, good1);
        prods.add(1, good2);
        Consignment c = new Consignment(prods, "describe");
        assertEquals(121.5, c.getGross());
        //assertEquals(1);
    }
}
package org.example;

import com.sun.source.tree.IfTree;

public class BeginStringFilter implements Filter{

    private final String patern;
    public BeginStringFilter(String str) throws Exception {
        if(str == null) {
            throw new Exception("Filter string is null");
        }
        this.patern = str;
    }
    @Override
    public boolean apply(String str) {
        return str.startsWith(patern);
    }
}

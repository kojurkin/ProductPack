package org.example;

public class EndsStringFilter implements Filter{

    private String patern;
    public EndsStringFilter(String str) {
        patern = str;
    }
    @Override
    public boolean apply(String str) {
        return str.endsWith(patern);
    }
}

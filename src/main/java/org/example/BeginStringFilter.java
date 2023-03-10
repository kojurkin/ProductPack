package org.example;

public class BeginStringFilter implements Filter{

    private String patern;
    public BeginStringFilter(String str) {
        patern = str;
    }
    @Override
    public boolean apply(String str) {
        return str.startsWith(patern);
    }
}

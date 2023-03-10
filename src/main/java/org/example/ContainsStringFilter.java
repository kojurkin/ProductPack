package org.example;

public class ContainsStringFilter implements Filter{

    private String patern;
    public ContainsStringFilter(String str) {
        patern = str;
    }
    @Override
    public boolean apply(String str) {
        return str.contains(patern);
    }
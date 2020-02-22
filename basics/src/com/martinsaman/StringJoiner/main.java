package com.martinsaman.StringJoiner;

import java.util.StringJoiner;

public class main {
    public static void main(String[] args) {

        StringJoiner names = new StringJoiner(",", "[", "]");
        names.add("Martin");
        names.add("Alexis");
        System.out.println(names.toString());

        StringJoiner paises = new StringJoiner(";", "{", "}");
        paises.add("Perú");
        paises.add("Colombia");
        paises.add("Israel xd");
        System.out.println(paises.toString());

        StringJoiner merge1 = names.merge(paises);
        System.out.println(merge1.toString());

        StringJoiner merge2 = paises.merge(names);
        System.out.println(merge2.toString());
    }
}

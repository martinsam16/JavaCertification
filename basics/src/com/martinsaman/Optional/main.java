package com.martinsaman.Optional;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
        //Nos evita el null ponter exception xdxd
        Integer[] array = new Integer[4];

//        System.out.println(array[1].toString()); //obvius

        Optional<Integer> optional = Optional.ofNullable(array[1]);
        if (optional.isPresent())
            System.out.println(array[1].toString());
    }
}

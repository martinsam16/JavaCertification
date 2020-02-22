package com.martinsaman.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(new Persona(1, "Martin"));
        listaPersona.add(new Persona(2, "Alexis"));
        listaPersona.add(new Persona(3, "Samán"));
        listaPersona.add(new Persona(4, "Arata"));

        //Filtrando
        listaPersona = listaPersona.stream()
                .filter(persona -> persona.getId() > 2)
                .collect(Collectors.toList());

        System.out.println(listaPersona);

        List<String> mapeando = listaPersona.stream()
                .map(Persona::getName) //Referencia a metodo
                .collect(Collectors.toList());

        System.out.println(mapeando);

        /*
        Diferencia entre Collection API y Stream API

          La API de Collection está en uso desde Java 1.2. Stream API se agrega a Java en la versión 8.

          La API de Collection se utiliza para almacenar datos en diferentes tipos de estructuras de datos.
          Stream API se utiliza para el cálculo de datos en un gran conjunto de objetos.

          Con Collection API podemos almacenar un número finito de elementos en una estructura de datos.
          Con Stream API, podemos manejar flujos de datos que pueden contener un número infinito de elementos.

          Collection API construye objetos de una manera entusiasta.
          Stream API crea objetos de manera perezosa.

          La mayoría de las API de Collection admiten la iteración y el consumo de elementos varias veces.
          Con Stream API podemos consumir o iterar elementos solo una vez.

         */
    }
}

package com.martinsaman.Lambda;

public class Lambda {

    public static void main(String[] args) {
        // Un Lambda representa el paradigma funcional
        // Es una instancia con implementacion de una interface funcional
        ILambdaFunctional lambda = (int x) -> x * x;
        System.out.println(lambda.getCuadrado(3));
        /*
        Usando la expresión lambda, puede referirse a la variable final o variable final efectiva
        (que se asigna solo una vez).
        La expresión Lambda arroja un error de compilación, si una variable se le asigna un valor la segunda vez.
         */
    }
}

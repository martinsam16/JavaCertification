package com.martinsaman.FunctionalInterface;

//Hola soy una interface funcional y solo puedeo tener un método abstractto xd
@FunctionalInterface    //
public interface IFuncional {

    public void demo();

    //Los default no cuentan xdxd
    //Cuando es default si tiene body C:
    //Es opcional implementarlo
    public default void porDefecto() {
        System.out.println("default");
    }

    //A mi no me puedes implementar D:
    public static void metodoEstatico() {
        System.out.println("estatico");
    }
}

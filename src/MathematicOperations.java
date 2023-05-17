public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Pi
        System.out.println(Math.PI);
        //Euler
        System.out.println(Math.E);
        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        //Devuelve un entero hacia arriba
        System.out.println(Math.floor(x));
        //Devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));
        //Devuelve numero mayor
        System.out.println(Math.max(x,y));
        //Devuelve nraiz cuadrada
        System.out.println(Math.sqrt(y));
        //Devuelve area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));
        //Devuelve area esfera
        //4 * PI * r2
        System.out.println(4 * Math.PI * Math.pow(y,2));
        /*Devuelve nvolumende una esfera
        *(4/3) * Pi * r3
        */
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

    }
}

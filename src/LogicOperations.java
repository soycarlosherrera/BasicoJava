public class LogicOperations {
    public static void main(String[] args) {

        int a = 8;
        int b = 5;

        //Operadores de asignacion
        System.out.println("A es igual a B? -> " + (a==b));
        System.out.println("A es diferente a B? -> " + (a!=b));

        //Operadores relacionales
        System.out.println("A es mayor a B? -> " + (a>b));
        System.out.println("A es menor a B? -> " + (a<b));
        System.out.println("A es mayor o igual a B? -> " + (a>=b));
        System.out.println("A es menor o igual a B? -> " + (a<=b));

        if(a==b){
            System.out.println("A es igual a B");
        } else if (a!=b && a > b) {
            System.out.println("A es diferente a B");
        }else if (a>b) {
            System.out.println("A es mayor a B");
        }else if (a<b) {
            System.out.println("A es menor a B");
        }else if (a>=b) {
            System.out.println("A es mayor o igual a B");
        }else if (a<=b) {
            System.out.println("A es menor o igual a B");
        }

    }
}

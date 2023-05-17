public class Ejercicio1 {
    public static void main(String[] args) {

        //Ponte creativo y preséntanos a tu familia con variables, utiliza todos los tipos y cantidad de variables que puedas, no olvides las convenciones de nombres Camel Case.

        //Constantes
        String GENERO1 = "Madre";
        String GENERO2 = "Padre";
        String GENERO3 = "Hermana";
        String GENERO4 = "Hermano";
        String GENERO5 = "Mascota";

        //Variables
        byte edadPepe = 30;
        byte edadLupe = 26;
        byte edadJose = 7;
        byte edadPepa = 5;
        byte edadLucas = 3;

        short estaturaPepe = 170;
        short estaturaLupe = 165;
        short estaturaJose = 120;
        short estaturaPepa = 90;
        short estaturaLucas = 23;

        int ahorroPepe = 170564651;
        int ahorroLupe = 165454555;

        long consecutivoJose = 756512341L;
        long consecutivoPepa = 545484848L;
        long consecutivoLucas = 345466566L;

        float promedioPepe = 15.6F;
        float promedioLupe = 18.9F;

        double cuotaJose = 7.6565561156;
        double cuotaPepa = 5.56468654165;
        double cuotaLucas = 3.64544651464;

        char iconoPepe = 'P';
        char iconoLupe = 'L';
        char iconoJose = 'J';
        char iconoPepa = 'p';
        char iconoLucas = 'l';

        boolean familiaFeliz = true;

        System.out.println("¿Esta es una familia feliz?: "+familiaFeliz);
        System.out.println("Esta conformada por: ");
        System.out.println("Pepe, quien es: "+GENERO2+" su edad es: "+edadPepe+" su estatura es: "+estaturaPepe+" cm, "+" Tiene ahorrados: "+ahorroPepe+" un promedio de: "+promedioPepe+" su icono sera: "+iconoPepe);
        System.out.println("Lupe, quien es: "+GENERO1+" su edad es: "+edadLupe+" su estatura es: "+estaturaLupe+" cm, "+" Tiene ahorrados: "+ahorroLupe+" un promedio de: "+promedioLupe+" su icono sera: "+iconoLupe);
        System.out.println("Pepa, quien es: "+GENERO3+" su edad es: "+edadPepa+" su estatura es: "+estaturaPepa+" cm, "+" Tiene consecutivo: "+consecutivoPepa+" una cuota de: "+cuotaPepa+" su icono sera: "+iconoPepa);
        System.out.println("Jose, quien es: "+GENERO4+" su edad es: "+edadJose+" su estatura es: "+estaturaJose+" cm, "+" Tiene consecutivo: "+consecutivoJose+" una cuota de: "+cuotaJose+" su icono sera: "+iconoJose);
        System.out.println("Lucas, quien es: "+GENERO5+" su edad es: "+edadLucas+" su estatura es: "+estaturaLucas+" cm, "+" Tiene consecutivo: "+consecutivoLucas+" una cuota de: "+cuotaLucas+" su icono sera: "+iconoLucas);

        System.out.println("--------------------Ejercicio 2 ---------------------------");

        char c = 'z';
        //conviertelo a int
        int cI = (int) c;


        int i = 250;
        //conviertelo a long y luego de long a short
        long iL = (long) i;
        short iS = (short) iL;

        double d = 301.067;
        //conviertelo a long
        long dL = (long) d;

        i = 100;
        //súmale 5000.66 y conviertelo a float
        float i1 = (float) (i + 5000.66);

        i = 737;
        //multiplícalo por 100 y conviertelo a byte
        byte iB = (byte) ( i * 100 );

        d = 298.638;
        //divídelo entre 25 y conviertelo a long
        long dL2 = (long) (d/25) ;

    }
}

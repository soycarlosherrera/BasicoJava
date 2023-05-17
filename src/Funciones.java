public class Funciones {
    public static void main(String[] args) {

        double y = 3;

        //Area del circulo
        circleArea(y);

        //Area esfera
        sphereArea(y);

        //Volumen esfera
        sphereVolumen(y);

        System.out.println("Pesos a dolares: "+converToDolar(200,"MXN"));
        System.out.println("Pesos a dolares: "+converToDolar(1000,"COP"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda, convierte la cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity*0.052;
                break;
            case "COP":
                quantity = quantity*0.00031;
                break;
        }

        return quantity;
    }

}

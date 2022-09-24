public class Main {
    public static void main(String[] args) {

        int numeroIf = -2;

        if (numeroIf > 0){
            System.out.println("es positivo");
        } else if (numeroIf < 0) {
            System.out.println("es negativo");
        }
        else {
            System.out.println("es cero");
        }

        int numeroWhile = 0;

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile<4);

        for (int numeroFor =0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "VERANO";

        switch(estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }

    }
}
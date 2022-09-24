

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.icrPuertas();
        System.out.println(myCar.nroPuertas);

        var res = suma(2,4,4);
        System.out.println(res);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Car {
    public int nroPuertas = 2;
    public void icrPuertas() {
        this.nroPuertas++;
        }
    }


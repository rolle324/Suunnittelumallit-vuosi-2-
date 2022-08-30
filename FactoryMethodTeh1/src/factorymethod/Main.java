package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opettaja2 = new mehuOpe();
        AterioivaOtus opettaja3 = new maitoOpe();
        opettaja.aterioi();
        opettaja2.aterioi();
        opettaja3.aterioi();
    }
}

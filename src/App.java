public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("_________________ Esse programa é o meu primeiro teste ______________");

        smartTv Tv = new smartTv();

        Tv.ligar();
        Tv.aumentarVolume();
        Tv.diminuirVolume();
        Tv.definirCanal(5);
        Tv.aumentarCanal();
        Tv.diminuirCanal();
        Tv.desligar();

    }
}

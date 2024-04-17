/**
 * <h1>Simulador de SmarTv<h1>
 * 
 * <h2> O programa busca simular apenas o estado da tv, canais e volume. <h2> 
 * <h2> Pretendo melhorar ainda mais o código para desenvolver meu conhecimento. <h2> 
 * @author Walace José Silva
 * @version 1.0
 * @since 16/04/2024
 */
public class smartTv {

    public boolean ligada = true;
    public int canal = 10;
    public int volume = 5;

    public void ligar(){
        ligada = true;
        System.out.println("A Tv está ligada.");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A Tv está desligada.");
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("O canal atual é " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("O canal atual é " + canal);
    }


    public void definirCanal(int numeroDoCanal){
        canal = numeroDoCanal;
        System.out.println("O canal atual é " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume atual é " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume atual é " + volume);
    }

}

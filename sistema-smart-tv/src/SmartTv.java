/**
 * <h1>Smart Tv</h1>
 * A Smart Tv realiza operações de seus status
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Carlos Marinho
 * @version 1.0
 * @since   16/10/2022
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Numero do canal: " + this.canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando numero do canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo numero do canal para: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);

        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status - Volume: " + smartTv.volume);


        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.mudarCanal(10);
        System.out.println("Novo status - Numero do canal: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);
    }
}
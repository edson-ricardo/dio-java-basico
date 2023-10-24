public class Usuario {
    public static void main(String[] args) throws Exception {
        //SmartTv é a nossa "Classe"
        //new SmartTv() = vai criar uma nova Classe
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(22);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        System.out.println("A TV está ligada? " + smartTv.ligada);        
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV foi ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV foi ligada? " + smartTv.ligada);
        
    }
}

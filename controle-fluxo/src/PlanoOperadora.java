public class PlanoOperadora {
    public static void main(String[] args) {

        //UTILIZANDO O "SWITCH CASE" SEM O "BREAK"
        String plano = "M"; // PLANOS: A = AVANÇADO | M = MÉDIO | B = BÁSICO

        switch (plano) {
            case "A": {
                System.out.println("5Gb Youtube");
            }

            case "M": {
                System.out.println("Whats e Instagram grátis");
            }

            case "B": {
                System.out.println("100 minutos de ligação");
            }

            default:
                System.out.println("Plano não encontrado");
                break;
        }


        
    }
    
}

public class SistemaMedida {
    public static void main(String[] args) {
        
        //UTILIZANDO O "SWITCH CASE" COM O "BREAK"
        String plano = "G"; // TAMANHOS: P = PEQUENO | M = MÉDIO | G = GRANDE

        switch (plano) {
            case "P": {
                System.out.println("O Tamanho da Camisa é P (Pequeno)");
                break;
            }

            case "M": {
                System.out.println("O Tamanho da Camisa é M (Médio)");
                break;
            }

            case "G": {
                System.out.println("O Tamanho da Camisa é G (Grande)");
                break;
            }

            default:
                System.out.println("Tamanho não encontrado");
                break;
        }
    }
}

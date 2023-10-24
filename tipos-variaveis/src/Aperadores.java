public class Aperadores {
    public static void main(String[] args) {
        
        /* INÍCIO ---
        String nomeCompleto = "Edson " + "Ricardo " + "dos " + "Santos";
        System.out.println(nomeCompleto);
        FIM --- */

        /* INÍCIO ---
        //Estrutura de Decisão: if e else
        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        
        System.out.println("O resultado é: " + resultado);
        FIM --- */

        /*
        //Operador Ternário: Verdadeiro (?) | Falso (:)
        int a, b;
        a = 5;
        b = 5;

        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println("O resultado é: " + resultado);
        */

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("As condição são iguais");         
        }else{
            System.out.println("As condições não são iguais");
        }





    }
    
}

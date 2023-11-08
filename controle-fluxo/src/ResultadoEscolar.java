public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
        int nota = 4;
        
        if(nota >= 7)
            System.out.println("Aprovado");
        
        else if(nota >= 5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
        */

        //ESTRUTURA CONDICIONAL - OPERADOR TERNÁRIO
        //DUAS CONDIÇÕES
        /*
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        
        System.out.println(resultado);
         */

        //MAIS DE DUAS CONDIÇÕES
        int nota = 9;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        
        System.out.println(resultado);
    }
    
}

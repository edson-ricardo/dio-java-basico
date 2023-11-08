public class ExemplosFor {

    //Estrutura do "controle de fluxo for"
    
    public static void main(String[] args) {
        //EXEMPLO 01 - for (bloco de inicialização; expressão boolena de validação; bloco de atualização)
        /*
        for (int carneirinho = 1; carneirinho <= 10; carneirinho++){
        System.out.println("Carneirinho " + carneirinho);
        System.out.println("...e Joãozinho dormiu.");
        }
        */

        //EXEMPLO 02 - for | array ------------------------------------------------------------------------
        /*
        String alunos [] = {"Eliane", "Manoel", "Mariana", "Edson", "Rebeka", "Erick"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno de índice " + x + " é " + alunos[x]);
        }
        */


        //EXEMPLO 03 - for | each --------------------------------------------------------------------------
        /*
        String alunos [] = {"Eliane", "Manoel", "Mariana", "Edson", "Rebeka", "Erick"};

        for (String aluno : alunos){
            System.out.println("O nome do(a) aluno(a) é: " + aluno);
        }
         */
         
        //EXEMPLO 04 - break: a contagem para na condição | continue: a contagem não para na condição, mas
        //o número não é exibido.
        for (int numero = 1; numero <=5; numero++){
            if (numero == 3)
                //break;
                continue;
            System.out.println(numero);
        }







    }
}

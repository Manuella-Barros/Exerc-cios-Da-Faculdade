package TP2.Aula12.ex1;

public class ValidaString {
    private String t1, t2;
    public ValidaString(String t1, String t2){
        this.t1 = t1.toLowerCase();
        this.t2 = t2.toLowerCase();
        qtdVogais(t1);
        retiraVogais(t1);
        //naoRepete(t1);
        //emComum(t1, t2);
        addVogais(t1);
    }

    public void qtdVogais(String t1){
        int contador = 0;
        for(int i = 0; i < t1.length(); i++){
            //Usa o t1.charAt(i) pq n pode usar só t1[i]
            switch (t1.charAt(i)){ //Se o char na posição i for igual a 'a', 'e', 'i', 'o', 'u', conta a vogal
                case 'a', 'e', 'i', 'o', 'u' :
                    contador++;
                    break;
            }
        }
        System.out.printf("Tem %d vogais\n", contador);
    }

    public void retiraVogais(String t1){
        String auxTexto = " ";
        for(int i = 0; i < t1.length(); i++){
            switch (t1.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u' :
                    break;
                default: // Se o char na posição i for diferente de 'a', 'e', 'i', 'o', 'u', adiciona elas nessa nova variavel
                    auxTexto += t1.charAt(i);
            }
        }
        System.out.printf("Texto sem vogais: %s\n", auxTexto);
    }

    public void naoRepete(String t1){
        String auxTexto = " ";
        auxTexto += t1.charAt(0); //Adiciona a primeira letra


        for(int i = 0; i < t1.length(); i++){// F
            //System.out.println(t1.indexOf(t1.charAt(i)));
            // charAt() = mostra o a letra do index; indexOf() = mostra o a index da letra;
            if(t1.indexOf(t1.charAt(i)) < i){
                break;
            } else{
                auxTexto += t1.charAt(t1.indexOf(t1.charAt(i)));
            }

        }
        System.out.printf("String sem repetições %s\n", auxTexto);
    }

    public void emComum(String t1, String t2){

    }

    public void addVogais(String t1){
        String textoNovo = " ";
        for(int i = 0; i < t1.length(); i++){
            switch (t1.charAt(i)){ //Se o char na posição i for igual a 'a', 'e', 'i', 'o', 'u', conta a vogal
                case 'a', 'e', 'i', 'o', 'u' :
                    textoNovo += t1.charAt(i);
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Tem %s vogais\n", textoNovo);
    }
}

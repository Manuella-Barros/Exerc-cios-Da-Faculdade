package TP2.Aula14;

public class Tweet {
    private String paragrafro;

    public Tweet(String paragrafro){
        setParagrafo(paragrafro);
    }

    public boolean setParagrafo(String paragrafro){
        if(paragrafro.length() > 0 && paragrafro.length() <= 144){
            System.out.println(paragrafro);
            return true;
        } else{
            System.out.println("Texto grande demais");
            return false;
        }
    }

    public void contaCaracteres(String paragrafro){
        int contador = 0;

        for(int i = 0; i < paragrafro.length(); i++){
            if(paragrafro.charAt(i) != ' '){ // Não conta os vazios
                contador++;
            }
        }

        System.out.printf("Existem %d caracteres\n", contador);
    }

    public void contaPalavras(String paragrafro){
        int contador = 0;

        for(int i = 0; i < paragrafro.length(); i++){
            if(paragrafro.charAt(i) == ' '){ // Não conta os vazios
                contador++;
            }
        }
        if(paragrafro.charAt(paragrafro.length() - 1) != ' '){ // Se a frase ñ terminar com um espali
            contador++; // add + 1 pra contar a ultima paravra
        }

        System.out.printf("Existem %d palavras\n", contador);
    }
}

package TP2.Aula14;

public class Tweet {
    private String paragrafro, palavra;

    public Tweet(String paragrafro, String palavra){
        setParagrafo(paragrafro);
        this.palavra = palavra;
    }

    public boolean setParagrafo(String paragrafro){
        if(paragrafro.length() > 0 && paragrafro.length() <= 144){
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

        System.out.printf("> Existem %d caracteres\n", contador);
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

        System.out.printf("> Existem %d palavras\n", contador);
    }

    public void contaFrases(String paragrafro){
        int contador = 0;

        for(int i = 0; i < paragrafro.length(); i++){
            if(paragrafro.charAt(i) == '.'){ //
                contador++;
            }
        }
        if(paragrafro.charAt(paragrafro.length() - 1) != '.'){ // Se a frase ñ terminar com um espali
            contador++; // add + 1 pra contar a ultima paravra
        }

        System.out.printf("> Existem %d frases\n", contador);
    }

    public void contaRepeticoes(String paragrafro, String palavra){
        String texto[] = paragrafro.split(" ");
        int contador = 0;
        for(int i = 0; i < texto.length; i++){ // vai comparar as tres palavras
                if(texto[i].equals(palavra)){
                    contador++;
                }
        }
        System.out.printf("> A palavra %s se encontra %d vezes no paragrafo\n", palavra, contador);
    }

    static public void randomParagrafo(){
        String textos[] = {"Dona","Aranha", "subiu", "pela", "parede", "veio", "a", "chuva", "forte", "e", "a", "derrubou",
                "já", "passou", "a", "chuva", "e", "o", "sol", "já", "vem", "surgindo", "e", "a", "dona", "aranha",
                "continua", "a", "subir", "ela", "é", "teimosa", "desobediente", "sobe", "nunca", "está", "contente"};
        String texto = " ";

        for(int i = 0; i < 10; i++){
            texto += textos[(int)Math.floor(Math.random()*37)]; // randomiza de 0 a 36 int
            texto += " ";
        }
        System.out.printf(" Texto gerado aleatoriamente:\n> %s\n",texto);
    }
}

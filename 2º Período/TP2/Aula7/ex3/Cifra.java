package TP2.Aula7.ex3;

public class Cifra {
    public void Descriptografar(String str) {
        char[] descr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] cript = {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c' };
        String strNova = "";

        for (int i = 0; i < str.length(); i++) { // percorre cada letra da palavra
            for (int j = 0; j < descr.length; j++) { // percorre o arrau descr
                if (str.charAt(i) == cript[j]) { // se a letra do array na posição i for == a letra da posição j da array cript
                    strNova += descr[j];// adiciona a string o elemento da posição j do array descr
                }
            }
        }
        System.out.println(strNova);
    }

    public void Criptografar(String str) {
        char[] descr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] cript = {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c' };
        String strNova = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < descr.length; j++) {
                if (str.charAt(i) == descr[j]) {
                    strNova += cript[j];
                }
            }
        }
        System.out.println(strNova);
    }
}

// Explicação da lógica para descriptografar (é a msm do criptografar)
// Achar em q posição da array cript está cada letra da palavra
// E então trocar pela letra de msm posição da outra array chamada descr
// Mas essa troca é feita adicionando cada letra nova em uma string nova que antes era vazia
// E é esta que é printada
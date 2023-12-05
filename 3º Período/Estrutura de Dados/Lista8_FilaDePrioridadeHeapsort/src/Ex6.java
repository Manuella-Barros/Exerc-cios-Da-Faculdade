public class Ex6 {
    public void main(String[] args){
        //Mostre passo a passo como o seguinte vetor de inteiros é ordenado pelo método Heapsort.
        //Você deve mostrar apenas a sequência de alterações que são feitas no vetor a cada passo
        //do algoritmo.
        //22 4 35 12 3 18 12 55

        // HEAPSORT
        // Passo 1   --> constroiArvore() e --> 55 22 35 12 3 18 12 4

        // Passo 2   --> raiz = 1, ultimo = 8, qnt = 8
        //       2.1 --> troca raiz com o utimo --> 4 22 35 12 3 18 12 55
        //       2.2 --> exclui ultimo --> 4 22 35 12 3 18 12
        //       2.2 --> refaz(raiz) --> 35 22 18 12 3 4 12

        // Passo 3   --> raiz = 1, ultimo = 7, qnt = 7
        //       3.1 --> troca raiz com o utimo --> 12 22 18 12 3 4 35
        //       3.2 --> exclui ultimo --> 12 22 18 12 3 4
        //       3.2 --> refaz(raiz) --> 22 12 18 12 3 4

        // Passo 4   --> raiz = 1, ultimo = 6, qnt = 6
        //       4.1 --> troca raiz com o utimo --> 4 12 18 12 3 22
        //       4.2 --> exclui ultimo --> 4 12 18 12 3
        //       4.2 --> refaz(raiz) --> 18 12 4 12 3

        // Passo 5   --> raiz = 1, ultimo = 5, qnt = 5
        //       5.1 --> troca raiz com o utimo --> 3 12 4 12 18
        //       5.2 --> exclui ultimo --> 3 12 4 12
        //       5.2 --> refaz(raiz) --> 12 12 4 3

        // Passo 6   --> raiz = 1, ultimo = 4, qnt = 4
        //       6.1 --> troca raiz com o utimo --> 3 12 4 12
        //       6.2 --> exclui ultimo --> 3 12 4
        //       6.2 --> refaz(raiz) --> 12 3 4

        // Passo 7   --> raiz = 1, ultimo = 3, qnt = 3
        //       7.1 --> troca raiz com o utimo --> 4 3 12
        //       7.2 --> exclui ultimo --> 4 3
        //       7.2 --> refaz(raiz) --> 4 3

        // Passo 8   --> raiz = 1, ultimo = 2, qnt = 1
        //       8.1 --> troca raiz com o utimo --> 3 4
        //       8.2 --> exclui ultimo --> 3
        //       8.2 --> refaz(raiz) --> 3

    }
}

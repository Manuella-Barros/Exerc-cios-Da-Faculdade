public class Ex1 {
    public static void main(String[]args){
        //A complexidade do método tamanho() custa O(n)
                //	public int tamanho() { // O(n)
                //		int tam = 0; // O(1)
                //		Elo p = prim; // O(1)
                //
                //		while(p != null)  // O(n)
                //		{
                //			tam++; // O(1)
                //			p = p.prox; // O(1)
                //		}
                //
                //		return tam; // O(1)
                //	}

        // A maneira menos custosa dee pegar o tamanho da lista é criar um atributo separado chamado tamanho
        // e ir somando 1 toda vez que um elemento é adicionado na lista e diminuir 1 toda vez que um elemento
        // é retirado da lista, dessa maneira a complexidade será de O(1), da atribuição e soma
    }
}

// A complexidade do código custa O(n) pois no pior caso vai precisar inserir o novo elemento na ultima posição da lista, então precisará
// percorrer toda a lista

public class Ex6 {
    public static void main(String[]args){
        ListaEncadeadaDupla<Integer> listaCustoChamadas = new ListaEncadeadaDupla<>();

        listaCustoChamadas.insereIntOrdenadamente(10, listaCustoChamadas);
        listaCustoChamadas.insereIntOrdenadamente( 5, listaCustoChamadas);
        listaCustoChamadas.insereIntOrdenadamente(11, listaCustoChamadas);
        listaCustoChamadas.insereIntOrdenadamente(7, listaCustoChamadas);

        listaCustoChamadas.imprime();
    }
}

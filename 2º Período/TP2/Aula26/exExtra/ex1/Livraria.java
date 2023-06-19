package TP2.Aula26.exExtra.ex1;

public class Livraria implements ItemVendavel{
    @Override
    public boolean verificaLivroDisponivel() {
        if(ItemVendavel.quantide > 0){
            System.out.printf("Livro tem %i copias disponiveis\n", quantide);
            return true;
        } else{
            System.out.printf("Livro indisponivel");
            return false;
        }
    }

    public void realizaCompra(){


    }
    public void realizaVenda(){}
}

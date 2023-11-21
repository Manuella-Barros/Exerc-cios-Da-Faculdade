import java.util.*;

public final class Maria extends Personagens implements Personagem
{
    public Maria() {
        super("Maria", 20,   "Você está em casa em uma tarde de domingo, vestindo seu habitual pijama e comendo sua " +
                "comida " +
                    "preferida feliz da vida!\n" +
                    "Logo após a refeição decide fazer a contabilidade do quanto tinha que pagar no mês. " +
                    "\nInfelizmente você emprestou dinheiro para uma amigo e agora está devendo! " +
                    "\uD83D\uDE22" +
                    "\nAbsorta com essa situação, rapidamente leva um susto com o toque estridente da " +
                    "campainha."+"\nQuando chega na porta, nota que acaba de chegar uma caixa no seu apartamento e você decide " +
                    "abrir!", "Binóculo azul");
        adicionaDica();
    }
    
    @Override
    public void adicionaDica()
    {
        poder_especial.put(1, "No momento em que aproxima o binóculo dos seus olhos, você nota que há um pequeno " +
                "texto no teto da sala escrito: \n❝Da muitas voltas mas não sai do lugar?❞");
        poder_especial.put(2, "Ao aproximar o binóculo dos olhos uma mensagem em azul surge na parede com os " +
                "seguintes dizeres \n❝A primeira letra é a letra que inicia, total de 1 dúzia no ano❞");
        poder_especial.put(3, "Ao passear pela sala com o binócolo nos olhos você encontra" +
                " a seguinte mensagem grafada em azul debaixo da mesa:\n" +
                "❝A de amor, B de baixinho, C de coração❞");
    }
}

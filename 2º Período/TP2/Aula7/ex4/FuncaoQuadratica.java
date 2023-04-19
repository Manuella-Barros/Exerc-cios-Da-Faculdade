package TP2.Aula7.ex4;
import java.lang.Math;
public class FuncaoQuadratica {
    private int A, B, C;

    public FuncaoQuadratica(int A, int B, int C){
        this.A = A; //set não será necessário pois os valores dos atributos são dados aqui
        this.B = B;
        this.C = C;
    }

    public double Raiz1(){
        return (-B + Math.sqrt( (B*B) - 4 * A * C) / (2 * A));
    }
    public double Raiz2(){
        return (-B - Math.sqrt( (B*B) - 4 * A * C) / (2 * A));
    }
    public double XVertice(){
        return (-B) / 2 * A;
    }
    public double YVertice(){
        return -((B*B) - 4 * A * C) / (4 * A);
    }//TA DANDO ERRADO
    public String Concavidade(){
        if(A >= 0){
            return "para cima";
        } else{
            return "para baixo";
        }
    }
    public String Descricao(){
        String strDescricao = " ";
        strDescricao += A >= 0 ? "y = +" + A + "x² " : "y = " + A + "x² ";
        strDescricao += B >= 0 ? "+" + B + "x " : B + "x ";
        strDescricao += C >= 0 ? "+" + C : C ;

        return strDescricao;
    }
}

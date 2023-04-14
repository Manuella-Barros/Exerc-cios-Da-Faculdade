package TP2.Aula4.Ex1;

public class ContaCorrente {
    public float salConta = 1000;
    public float salAdd;
    public float salRetirar;
    public int opc;

    public void contaCorrente(){
        switch (opc){
            case 1:
                salConta += salAdd;
                break;
            case 2:
                salConta -= (salRetirar + 1.50);
                break;
            case 3:
                System.out.printf("\nSaldo = %.2f\n", salConta);
                break;
        }
    }
}

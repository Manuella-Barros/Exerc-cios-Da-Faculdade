public class MainEx3 {
    public static void main(String[] args){
        PilhaDupla pilhaDupla = new PilhaDupla(4);

        pilhaDupla.pushPilha2('a');
        pilhaDupla.pushPilha2('a');
        pilhaDupla.pushPilha2('a');
        pilhaDupla.pushPilha2('a');
        pilhaDupla.popPilha2();
        pilhaDupla.popPilha2();
        pilhaDupla.popPilha2();
        pilhaDupla.popPilha2();
        pilhaDupla.popPilha2();
    }
}

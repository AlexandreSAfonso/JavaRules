public class Funcoes {
    public static void main(String[] args) {
        Funcoes hw = new Funcoes();
        hw.helloWorld();
        System.out.println("O valor é " + hw.soma(5, 3));
    }
    private void helloWorld(){
        int valor;
        System.out.println("Olá, Mundo!");
    }

    private Integer soma(int a, int b){
        return a + b;
    }
}

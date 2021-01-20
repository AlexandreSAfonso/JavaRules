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

    private void stringStudy(){
        try{
            String str = "Curso de Javva";
            str.charAt(0);
        } catch (Exception e){
            System.out.println(e);
        } finally{
            //executa um código independente se houve erro ou foi tudo normal, como fechar um arquivo aberto pelo protrama.
        }
    }
}

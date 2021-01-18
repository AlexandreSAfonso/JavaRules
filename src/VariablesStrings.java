public class VariablesStrings {
    public static void main(String[] args) {
        String nome = "Java";
        //forma para encontrar um caractére na cadeia de string
        System.out.println("Primeiro caractére: " + nome.charAt(2));
        
        
        //forma de concatenar
        String sobrenome = "Rules!";
        System.out.println(nome + " " + sobrenome);
        
        Integer idade  = 10;
        System.out.println("Idade: " + idade);

        //metodos auxiliares para conversão de valores
        Double d = 1043860.9;
        String strDouble = String.valueOf(d);
        System.out.println(strDouble);

    }
}

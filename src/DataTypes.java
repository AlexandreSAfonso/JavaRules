public class DataTypes {
    /**
     * Type and     Bit
     * Double       64
     * Float        32
     * Long         64
     * Int          32
     * Short        16
     * Byte          8
     * Char          2  é definido por aspas simples, com apenas uma posição
     * String        Depende do conteúdo
     * Boolean       A JVM define o tamanho em tempo de execução
     * */
    public static void main(String[] args) {
        Double d = 10.2;
        Float f = 100.23756295623f;
        Long l = 10348674l;
        Integer i = 100;
        Short s = 10;
        Byte b = 19;

        System.out.println("Double: Max: " + Double.MAX_VALUE + " - Double: " +  Double.MIN_VALUE);
        System.out.println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE);
        System.out.println("Long: Max: " + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE);
        System.out.println("Integer: Max: " + Integer.MAX_VALUE + " - Min: " + Integer.MIN_VALUE);
        System.out.println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE);
        System.out.println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE);

    }
}

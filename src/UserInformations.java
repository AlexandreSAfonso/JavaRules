import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class UserInformations {
    public static void main(String[] args) {
        Integer valor;

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Informe um número: ");

        valor = scanner.nextInt();
        System.out.println(valor +10);
/*
        Double doubleValor = scanner.nextDouble();
        Float floatValor = scanner.nextFloat();
        Long longValor = scanner.nextLong();
        Short shortvalor = scanner.nextShort();
        Integer intValor = scanner.nextInt();
        Byte bytevalor = scanner.nextByte();
        Boolean boolvalor = scanner.hasNextBoolean()
        String stringvalor = scanner.nextLine()
 */
    }
}

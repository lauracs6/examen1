public class Invertir {
    public static void main(String[] args) {
        int numero = 3974;
        int invertido = invertirNumero(numero);
        System.out.println("El número invertido es: " + invertido);
    }

    public static int invertirNumero (int numero) {

        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10; // Al hacer el módulo el resto es el último dígito
            invertido = invertido * 10 + digito; // Se añade el dígito extraído al número invertido
            numero /= 10; // Elimina el último dígito del número original
        }

        return invertido;

    }
}

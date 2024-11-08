public class Main {
    public static void main (String[] args) {
        int a = 3;
        int b = 7;
        int resultado = sumaImpares(a, b);
        System.out.println("La suma de los números impares entre " + a + " y " + b + " es: " + resultado);
    }


    public static int sumaImpares (int a, int b) {
        int suma = 0;

        if (a > b) {
            return 0;
        }

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        return suma;
    }
}

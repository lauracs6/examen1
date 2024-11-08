public class numeroCita {
    public static void main (String[] args) {
        int coste = costeConsulta(3);
        System.out.println ("El coste de la consulta es de " + coste + " €.");

    }

    public static int costeConsulta(int numeroCita) {
        int costeCita;

        if (numeroCita <= 2) {
            costeCita = 200;
        }else if (numeroCita <= 5) {
            costeCita = 150;
        }else{
            costeCita = 100;
        }
        return costeCita;
    }
}

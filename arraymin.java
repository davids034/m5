public class arraymin {
    public static void main(String[] args) throws Exception {
        double[] reales = {5.3, 2.7, 8.1, 3.5, 1.9, 1.2, 9.8, 4.6, 7.0, 2.1, 6.4};
        double min = Double.MAX_VALUE;
        double res = 0;

        for (int i = 0; i < reales.length; i++) {
            System.out.println(reales[i]);
            if (reales[i] < min) {
                min = reales[i];
                res = min;
            }
        }
        System.out.println("El valor mínimo es "+res);
        System.out.println("Prueba git");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Franquicia franq1 = new Franquicia("Franq1", 12, 1000, 0.10);
        Franquicia franq2 = new Franquicia("Franq2", 24, 2000, 0);

        System.out.println(franq1.compararFranquicia(12, 1000, 0.10));
        System.out.println(franq2.compararFranquicia(24, 2000, 0));
    }
}

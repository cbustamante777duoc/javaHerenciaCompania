public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente("Cristian", "Bustamante", "1777531", "Chile", 1000000, 1, 700);
        
        gerente.increaseRemuneration(35);
        System.out.println(gerente.toString());
    }
}

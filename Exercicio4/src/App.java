public class App {
    public static void main(String[] args) throws Exception {
        Pato pa = new Pato() {
            
        };

        AdaptadorPato a = new AdaptadorPato(pa);
        a.fazerquaqua();
    }
}

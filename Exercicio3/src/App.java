public class App {
    public static void main(String[] args) throws Exception {
        Preparacao preparacao = new Preparacao(0);
        Sanduiche comfrango = new FrangoAssado(new Pepperoni(new QueijomA()));
        
        

        double valor1 = comfrango.calcularvalor(preparacao);

        System.out.println("O preço do seu sanduiche é: "+valor1);
    }
}

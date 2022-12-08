public class FrangoAssado extends Sanduiche{

    public FrangoAssado(Sanduiche SaborSanduiche) {
        super(SaborSanduiche);

    }
    public FrangoAssado(){

    }
    public double calcularvalor(Preparacao preparacao){
        System.out.println("Frango Assado: $4.50");
        return 4.50 + calcula(preparacao);
    }
}

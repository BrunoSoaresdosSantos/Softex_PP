public class Pepperoni extends Adicionais {

    public Pepperoni(Sanduiche SaborSanduiche){
        this.saborSanduiche = SaborSanduiche;
    }
    public Pepperoni(){

    }


    
    public double calcularvalor(Preparacao preparacao) {
        System.out.println("Pepperoni: $0.99");
        return 0.99 + calcula(preparacao);
        
    }
    

}

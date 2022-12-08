public class QueijomA extends Adicionais{

    public QueijomA(Sanduiche SaborSanduiche){
        this.saborSanduiche = SaborSanduiche;
    }
    public QueijomA(){

    }


    
    public double calcularvalor(Preparacao preparacao) {
        System.out.println("QueijoMussarelaRalado: $2.00");
        return 2.00 + calcula(preparacao);
        
    }
}

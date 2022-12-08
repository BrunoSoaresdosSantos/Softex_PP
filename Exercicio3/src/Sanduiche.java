public abstract class Sanduiche{
    protected Sanduiche saborSanduiche;

    public Sanduiche(Sanduiche SaborSanduiche){
        saborSanduiche = SaborSanduiche;
    }
    public Sanduiche(){

    }

    
    public abstract double calcularvalor(Preparacao preparacao);

    protected double calcula(Preparacao preparacao){
        if(saborSanduiche == null)
            return 0;
        else
            return saborSanduiche.calcularvalor(preparacao);
    }

    
}

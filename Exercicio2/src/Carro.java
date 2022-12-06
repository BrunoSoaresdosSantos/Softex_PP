public class Carro extends Veiculo {
    String nportas;
    
    public Carro(String modelo_, String marca_, String cor_, String nrodas_) {
        super(modelo_, marca_, cor_, nrodas_);
        this.nportas = "4";
    
    }
    @Override
    public Veiculo clone(){
        System.out.println("clonando "+ Carro.class);
        Carro novo = new Carro(this.getModelo(), this.getMarca(), this.getCor(), this.getNrodas());
        return novo;
    }
    public String getNportas() {
        return nportas;
    }
    @Override
    public String toString() {
        return "Carro [modelo=" + getModelo() + ", marca=" + getMarca() + ", cor=" + getCor() + ", nrodas=" + getNrodas() + " nportas=" + nportas + "]";
    }


    
    
}

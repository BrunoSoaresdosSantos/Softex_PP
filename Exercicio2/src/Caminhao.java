public class Caminhao extends Veiculo{

    String lpeso;
    public Caminhao(String modelo_, String marca_, String cor_, String nrodas_) {
        super(modelo_, marca_, cor_, nrodas_);
        lpeso = "10t";
    
    }
    public String getlpeso(){
        return lpeso;
    }

    @Override
    public Veiculo clone(){
        System.out.println("clonando "+ Caminhao.class);
        Caminhao novoc = new Caminhao(this.getModelo(), this.getMarca(), this.getCor(), this.getNrodas());
        return novoc;
    }
    @Override
    public String toString() {
        return "Caminhao [modelo=" + getModelo() + ", marca=" + getMarca() + ", cor=" + getCor() + ", nrodas=" + getNrodas() +" lpeso= " + lpeso + "]";
    }
    
}

public abstract class Veiculo {
    
    private String modelo;
    private String marca;
    private String cor;
    private String nrodas;
    
    public Veiculo(String modelo_, String marca_,String cor_, String nrodas_){
        this.modelo = modelo_;
        this.marca = marca_;
        this.cor = cor_;
        this.nrodas = nrodas_;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNrodas() {
        return nrodas;
    }

    public void setNrodas(String nrodas) {
        this.nrodas = nrodas;
    }

    public abstract Veiculo clone();

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", nrodas=" + nrodas + "]";
    }
}

public class AdaptadorPato extends Adaptadorpatodemo {
    private Pato pato;

    public AdaptadorPato(Pato pato){
        this.pato = pato;
    }
    public void fazerquaqua(){
        pato.fazercocorico();
    }
}
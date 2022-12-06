public class App {
    public static void main(String[] args)  {
        Carro n1 = new Carro("carro", "fiat", "branco", "4");
        Carro n2 = new Carro("carro", "fiat", "branco", "4");
        Carro n3 = new Carro("carro", "fiat", "branco", "4");
        Caminhao m1 = new Caminhao("caminhao", "scania", "preto", "12");
        Caminhao m2 = new Caminhao("caminhao", "scania", "preto", "12");
        Caminhao m3 = new Caminhao("caminhao", "scania", "preto", "12");
        
        criar(n1);
        criar(n2);
        criar(n3);
        criar(m1);
        criar(m2);
        criar(m3);
    }
    public static void criar(Veiculo v){
        Veiculo o = v.clone();
        Caminhao c2 = null;
        Carro c1 = null;
        
        if(o instanceof Caminhao){
            c2 = (Caminhao) v;
            System.out.println(c2);
    
        }else if(o instanceof Carro){
            c1 = (Carro) v;
            System.out.println(c1);
    
        }
        
        
    }
}

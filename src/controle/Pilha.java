package controle;

public class Pilha {
    private ListaLigada lista;
    
    public Pilha(){
        this.lista = new ListaLigada();
    }
    
    public void adicionar(String novoValor){
        this.lista.adicionarComeco(novoValor);
    }
    
    public void remover(){
        this.lista.remover(this.get());
    }
    
    public String get(){
        return this.lista.getTamanho()!=0?this.lista.getPrimeiro().getValor():" ";
    }
    
     public int tamaho(){
        return lista.getTamanho();
    }

    public ListaLigada lista() {
        return lista;
    }
}

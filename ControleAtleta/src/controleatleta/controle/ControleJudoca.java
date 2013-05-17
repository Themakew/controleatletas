package controleatleta.controle;

import model.Judoca;
import java.util.ArrayList;

public class ControleJudoca {

    private ArrayList<Judoca> listaJudocas;

    public ControleJudoca() {
        this.listaJudocas = new ArrayList<Judoca>();
    }
    
    public ArrayList<Judoca> getListaJudocas() {
        return listaJudocas;
    }
    
    public void adicionarJudoca(Judoca umJudoca) {
        listaJudocas.add(umJudoca);
    }
    
    public void removerJudoca(Judoca umJudoca) {
        listaJudocas.remove(umJudoca);
    }
    
    public Judoca pesquisarJudoca(String nome) {
        for (Judoca b: listaJudocas) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}

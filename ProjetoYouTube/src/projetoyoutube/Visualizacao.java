package projetoyoutube;
public class Visualizacao {
    private Espectador visualizador;
    private Video filme;

    public Visualizacao(Espectador visualizador, Video filme) {
        this.visualizador = visualizador;
        this.filme = filme;
        this.visualizador.setTotAssistido(this.visualizador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }else if (porc <= 50){
            tot = 5;
        }else if (porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    public Espectador getVisualizador() {
        return visualizador;
    }

    public void setVisualizador(Espectador visualizador) {
        this.visualizador = visualizador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "visualizador=" + visualizador + ", filme=" + filme + '}';
    }
    
}

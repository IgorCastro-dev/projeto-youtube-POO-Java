package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("POO");
        v[1] = new Video("PHP");
        v[2] = new Video("HTML5");
        
        Espectador e[] = new Espectador[2];
        e[0] = new Espectador("igor",22,"M","migorino");
        e[1] = new Espectador("Claudia",12,"F","clau");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(e[0], v[2]);//igor assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(e[0], v[1]);//igor assiste PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
    }   
}

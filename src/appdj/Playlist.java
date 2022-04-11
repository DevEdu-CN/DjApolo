/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdj;

/**
 *
 * @author luize
 */
public class Playlist  {
   private String Artista;
   private String musica;
   private String GeneroMusical;

    public Playlist() {
    }

    public Playlist(String musica, String Artista, String GeneroMusical) {
        this.musica = musica;
        this.Artista = Artista;        
        this.GeneroMusical = GeneroMusical;
    }

    
    public String getArtista() {
        return Artista;
    }
    public void setArtista(String Artista) {
        this.Artista = Artista;
    }
    public void setGeneroMusical(String GeneroMusical) {
        this.GeneroMusical = GeneroMusical;
    }
    public void setMusica(String musica) {
        this.musica = musica;
    }
    public String getGeneroMusical() {
        return GeneroMusical;
    }
    public String getMusica() {
        return musica;
    }

   public String mostrarDados(){
       return "Musica: " + musica + " | Artista: " + Artista + " | Gênero: " + GeneroMusical;
   }
   
   
   
}

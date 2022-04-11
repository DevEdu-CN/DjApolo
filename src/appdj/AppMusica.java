/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdj;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author luize
 */
public class AppMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String e = "play";
       Scanner leia = new Scanner(System.in);
        DJApolo Som = new DJApolo();
        
       Playlist p1 = new Playlist("I Am A Little Explosion", "Self", "Pop Rock");
       Playlist p2 = new Playlist("I am not maternal", "Otoboke Beaver", "Punk");
       Playlist p3 = new Playlist("Darlin'", "The Beach Boys", "Rock");
       Playlist p4 = new Playlist("Twist The Knife", "That Handsome Devil", "Rock Alternativo");
       Playlist p5 = new Playlist("Avalon", "Foxygen", "Rock Alternativo");
       Playlist p6 = new Playlist("Pay Your Way in Pain", "St.Vincent", "Indie");
       Playlist p7 = new Playlist("Foco nos Planos", "Zudizilla",  "RAP");

       Som.incluirMusica(p1);
       Som.incluirMusica(p2);
       Som.incluirMusica(p3);
       Som.incluirMusica(p4);
       Som.incluirMusica(p5);
       Som.incluirMusica(p6);
       Som.incluirMusica(p7);
       Som.ordenaPlaylist();
       Som.tocarDisco();
       
       
       while(!e.equals("Fim")){
       System.out.println("Digite 'Próximo' para Pular ou Musica ou 'Retorne' para repetir a música ");
       e = leia.nextLine();
       Som.Play(e);
       }
       
    }
    
}

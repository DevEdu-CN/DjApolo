/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdj;

import java.util.Random;

/**
 *
 * @author luize
 */
public class DJApolo extends Playlist {
    private int quantidade;
    private int pilhaDisco = 4;
    private Playlist[] musica;
    private String Restart;
    public DJApolo(){
    this.quantidade = 0;
    this.musica= new Playlist[this.pilhaDisco];
    }
    

    private void expandirPlaylist() {
        this.pilhaDisco = 2 * pilhaDisco;
        Playlist[] novovetor = new Playlist[this.pilhaDisco];
        
        for (int i = 0; i < this.quantidade; i++) {
            novovetor[i] = this.musica[i];
        }
        this.musica = novovetor;
    }
    public void tocarDisco(){
    Random gerar = new Random();
    int n = gerar.nextInt(quantidade);
        System.out.println("Temos mais de " + quantidade + " preparadas para Você!!!");
        System.out.println("D-D-DJ Apolo e Você! Vamos de: " + "\n"  + musica[n].mostrarDados());
        this.Restart = musica[n].mostrarDados();
    }
    public void ordenaPlaylist(){
    int i, j;
    Playlist aux; 
    for(i = 1; i < quantidade; i++){
    aux = musica[i];
    j = i - 1;
    while(j >= 0){
    musica[j + 1] = musica[j];
    j--;
    }
    musica[j + 1] = aux;
    }
    }
    
   
    
        public void incluirMusica(Playlist b) {
        assert b != null : "Musica inválida";
            if(pilhaDisco == quantidade) {
            
                expandirPlaylist();
        }
        this.musica[quantidade] = b;
            
        quantidade++;
    }
        public void Play (String r){

            switch(r) {
                case "Proximo":
                    tocarDisco();
                    break;
                case "Retorne": 
                    System.out.println(Restart);
                    break;
                case "fim":
                    System.out.println("A sessão foi encerrada.");
                    break;
            }
        }
        
        }




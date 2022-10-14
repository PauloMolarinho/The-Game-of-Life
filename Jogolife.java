package com.mycompany.jogoprog2021;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Jogolife implements ActionListener{
    
     public void actionPerformed(ActionEvent e){//action listener pra ver as açoes do botão
         if(pdg==0){
         for(int x=0; x<tam;x++){
             for(int y=0;y<tam;y++){
                 if(e.getSource() == bot[x][y]){
                     if(ghost[x][y]==0){
                         System.out.println(ghost[x][y]);
                     bot[x][y].setBackground(cor2);
                      tela.setFocusable(true);
                      tela.requestFocus();
                      ghost[x][y]=1;
                     }
                     else{
                         System.out.println(ghost[x][y]);
                         bot[x][y].setBackground(cor);
                      tela.setFocusable(true);
                      tela.requestFocus();
                      ghost[x][y]=0;
                     }
                 }
                 
             }
         }
     }
    }
    int tam = 30, pdg=0;
    public JButton[][] bot = new JButton[tam][tam];
    int[][] ghost = new int[tam][tam];
    JFrame tela = new JFrame();
    Color cor = new Color(173,216,230);
    Color cor2 = new Color(178,34,34);
    
    
    public Jogolife(){
       tela.setFocusable(true);
       tela.requestFocus();
       tela.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent c){
              int code = c.getKeyCode();
              if(code==10){
                 
                  System.out.println("ENTER");
                  pdg=1;
                  
                 
              }

            }
        });
        montar();
        editarJ();
        
     
        
    }
    
    
    void editarJ(){
        
          tela.setSize(800,700);
          tela.setLocationRelativeTo(null);
          tela.setVisible(true);
          tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          tela.getContentPane().setBackground(Color.BLACK);
        
      
       
    }
    void montar(){
     
        tela.setLayout(new GridLayout(tam,tam,2,2));
          for(int x=0; x<tam;x++){
            for(int y=0;y<tam;y++){
                bot[x][y] = new JButton();
                tela.add(bot[x][y]);
                bot[x][y].setBackground(cor);
                bot[x][y].addActionListener(this);
                ghost[x][y]=0;
               
            }
        }
         
    }
   
    public static void main(String[] args) {
         Jogolife jogolife = new Jogolife();
        repetir repetir2 = new repetir(jogolife);
        repetir2.start();
    }
    
}



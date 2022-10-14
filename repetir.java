package com.mycompany.jogoprog2021;

import java.awt.Component;



public class repetir extends Thread {
        
          Jogolife game;
       repetir(Jogolife game) {
        this.game = game;
    }
          public void run(){
            Jogolife jogolife = this.game;
          int[][] mat1 = new int[jogolife.tam][jogolife.tam];
          int soma=0;
            while(true){
              
                try{sleep(200);}catch(Exception erro){}
                if(jogolife.pdg==1){
              
        for(int l=0;l<jogolife.tam;l++){
            for(int c=0;c<jogolife.tam;c++){
                if(l>0 && c>0 && l<jogolife.tam-1 && c<jogolife.tam-1){
                    soma=jogolife.ghost[l+1][c]+jogolife.ghost[l-1][c]+jogolife.ghost[l][c+1]+jogolife.ghost[l][c-1]+jogolife.ghost[l-1][c-1]+jogolife.ghost[l+1][c+1]+jogolife.ghost[l-1][c+1]+jogolife.ghost[l+1][c-1];
                }
                if(l==0 && c>0 && c<jogolife.tam-1) {
                    soma=jogolife.ghost[l+1][c-1]+jogolife.ghost[l+1][c]+jogolife.ghost[l+1][c+1]+jogolife.ghost[l][c-1]+jogolife.ghost[l][c+1];
                }
                if(l==jogolife.tam-1 && c>0 && c<jogolife.tam-1){
                    soma=jogolife.ghost[l-1][c-1]+jogolife.ghost[l-1][c]+jogolife.ghost[l-1][c+1]+jogolife.ghost[l][c+1]+jogolife.ghost[l][c-1];
                }
                if(c==0 && l>0 && l<jogolife.tam-1){
                    soma=jogolife.ghost[l+1][c+1]+jogolife.ghost[l][c+1]+jogolife.ghost[l-1][c+1]+jogolife.ghost[l-1][c]+jogolife.ghost[l+1][c];
                }
                if(c==jogolife.tam-1 && l>0 && l<jogolife.tam-1){
                    soma=jogolife.ghost[l-1][c-1]+jogolife.ghost[l][c-1]+jogolife.ghost[l+1][c-1]+jogolife.ghost[l-1][c]+jogolife.ghost[l+1][c];
                }
                if((l==0)&&(c==0)){
                    soma=jogolife.ghost[l+1][c]+jogolife.ghost[l][c+1]+jogolife.ghost[l+1][c+1];
                }
                if((l==jogolife.tam-1) && (c==jogolife.tam-1)){
                    soma=jogolife.ghost[l-1][c]+jogolife.ghost[l][c-1]+jogolife.ghost[l-1][c-1];
                }
                if((l==0)&&(c==jogolife.tam-1)){
                    soma=jogolife.ghost[l][c-1]+jogolife.ghost[l+1][c]+jogolife.ghost[l+1][c-1];
                }
                if((c==0)&&(l==jogolife.tam-1)){
                    soma=jogolife.ghost[l][c+1]+jogolife.ghost[l-1][c]+jogolife.ghost[l-1][c+1];
                }

                if(soma<=1 || soma>=4){
                    mat1[l][c]=0;
                }
                if(soma==3){
                    mat1[l][c]=1;
                }
                if((soma==2 || soma==3) && jogolife.ghost[l][c]==1){
                    mat1[l][c]=1;
                }
                }
        }
        

            for(int l=0;l<jogolife.tam;l++){
                for(int c=0;c<jogolife.tam;c++){
                    jogolife.ghost[l][c]=mat1[l][c];
                    if(jogolife.ghost[l][c]==1){
                        jogolife.bot[l][c].setBackground(jogolife.cor2);
                    }
                    else{
                        jogolife.bot[l][c].setBackground(jogolife.cor);
                    }
                }
            }

            
       
            }
            }
          
        }
          
         
    }



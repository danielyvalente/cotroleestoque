package com.danielyvalente.controleestoque;

/**
 *
 * @author devsys-a daniely
 */

public class Produtos {
    private int id;
    private String descricao;
    private double qtdAtual;
    private double valorUnit;
   
    
    public Produtos(){
       
    }
    
    public Produtos(int id, String descricao, String qtdAtual, String valorUnit){
        this.id = id;
        this.descricao = descricao;
        this.setQtdAtual (qtdAtual);
        this.setValorUnit (valorUnit);
       
    }
    
    public int getId(){
        return id;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public double getQtdAtual(){
        return qtdAtual;
    }
    
    public double getValorUnit(){
        return valorUnit;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setQtdAtual(double qtdAtual){
        this.qtdAtual = qtdAtual;
    }
    
     public void setQtdAtual(String qtdAtual){
        this.qtdAtual = Double.parseDouble(qtdAtual);
    }
    
    public void setValorUnit(double valorUnit){
        this.valorUnit = valorUnit;
    }
    
    public void setValorUnit(String valorUnit){
        this.valorUnit = Double.parseDouble(valorUnit);
    }
    
    public double getValorTot(){
        return this.qtdAtual * this.valorUnit;
    }
            
}

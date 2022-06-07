package com.danielyvalente.controleestoque;

/**
 *
 * @author devsys-a daniely
 */

public class Movimento {
    private int id;
    private String data;
    private double qtd;
    
    public Movimento(){
        
    }
    
    public Movimento(int id, String data, double qtd){
        this.id = id;
        this.data = data;
        this.qtd = qtd;
    }
    
    public int getId(){
        return id;
    }
    
    public String getData(){
        return data;
    }
    
    public double getQtd(){
        return qtd;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setQtd(double qtd){
        this.qtd = qtd;
    }
}

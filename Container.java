/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Container {
    private int first;
    private int second;
    
    public Container(){
        this.first = 0;
        this.second = 0;
    }
    
    public void add(int amount){
        if(amount > 0){
            this.first += amount;
            if(this.first > 100){
                this.first = 100;
            }
        }
    }
    
    public void move(int amount){
        if(amount > this.first){ 
            this.second += this.first;
            this.first = 0;
        }
        
        if(this.first >= amount && amount > 0){
            this.first -= amount;
            this.second += amount;
            if(this.second > 100){
                this.second = 100;
            } 
            if(this.second < 0){
                this.second = 0;
            }
        }
        
    }
    
    public void remove(int amount){
        if(amount > this.second){
            this.second = 0;
        } 
        if(this.second > amount){
            this.second -= amount;    
        }
    }
    
    
    public int getFirst(){
        return this.first;
    }
    public int getSecond(){
        return this.second;
    }
    
    public String toString(){
        return "First: "+ getFirst() +"/100\n" +
            "Second: "+ getSecond()+"/100";
    }
}

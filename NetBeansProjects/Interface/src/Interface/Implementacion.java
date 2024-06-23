/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Dark6
 */
public class Implementacion implements Cal {
      
    int res;
      
    @Override
    public int suma(int f, int s){
    res = f + s;
    return res;
    }
    
    @Override
    public int resta(int f, int s){
    res = f - s;
    return res;
    }
    
    @Override
    public int multi(int f, int s){
    res = f * s;
    return res;
    }
    
    @Override
    public int division(int f, int s){
    res = f / s;
    return res;
    }    
    
    @Override
    public int potencia(int f, int s){
    res = (int) Math.pow(f, s);
    return res;
    }
       
    @Override
    public int modulo(int f, int s){
    res = f % s;
    return res;
    }
}

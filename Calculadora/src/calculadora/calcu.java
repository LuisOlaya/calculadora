/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author LuisOlaya
 */
public class calcu {
    private int ans;

    public calcu() {
        ans = 0;
    }
    
    public int suma(int a, int b){
        ans = a + b;
        return ans;
    }
    public int resta(int a, int b){
        ans = a - b;
        return ans;
    }
    public int multi(int a, int b){
        ans = a * b;
        return ans;
    }
    public double division(int a, int b){
        double c = (a / b);
        return c;
    }
    public void limpiar(){
        ans = 0;
    }
    public int ans(){
        return ans;
    }
}

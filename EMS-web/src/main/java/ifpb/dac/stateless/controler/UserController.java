/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.controler;

import ifpb.dac.stateless.IFCalculadora;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jose2
 */
 @Named
 @SessionScoped
public class UserController implements Serializable{
      @Inject
    private IFCalculadora calculadora;
      private int x;
      private int y;
      private int result;
      public String somar(){
        result =  calculadora.somar(x, y);
        return null;
      }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
      
    
}

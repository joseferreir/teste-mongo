/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.controler;

import ifpb.dac.stateless.IFUser;
import java.io.Serializable;
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
    private IFUser userService;
      public String salvar(){
     return null;
 }
      
}

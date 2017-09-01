/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.controler;

import ifpb.dac.stateless.IFCalculadora;
import ifpb.dac.stateless.IFUser;
import java.io.Serializable;
import java.sql.SQLException;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
      
}

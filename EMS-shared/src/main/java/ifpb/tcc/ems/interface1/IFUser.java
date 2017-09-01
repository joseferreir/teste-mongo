/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.interface1;

import com.google.gson.Gson;
import ifpb.tcc.ems.entity.User;



/**
 *
 * @author jose2
 */

public interface IFUser extends CrudEntity<User>{

  public void add(String gson);
    
}

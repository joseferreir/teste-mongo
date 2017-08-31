/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless;

import ifpb.dac.stateless.ten.User;

/**
 *
 * @author jose2
 */
public interface IFUser extends CrudEntity<User>{

    public void add(User entity);

    public User update(User entity);

    public User find(User id);

    public void remove(User id);
    
}

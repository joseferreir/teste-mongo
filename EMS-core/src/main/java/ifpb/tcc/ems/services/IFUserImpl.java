/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.services;

import ifpb.dac.stateless.CrudEntity;
import ifpb.dac.stateless.IFUser;
import ifpb.dac.stateless.ten.User;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author jose2
 */
@Stateless
@Remote(IFUser.class)
public class IFUserImpl implements IFUser {
    @EJB()
    CrudEntity<User> repository;

    @Override
    public void add(User entity) {
       repository.add(entity);
    }

    @Override
    public User update(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User find(User id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(User id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.services;


import ifpb.tcc.ems.entity.User;
import ifpb.tcc.ems.interface1.IFUser;
import ifpb.tcc.ems.repository.UserRepositorio;
import java.util.List;
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
    @EJB( beanInterface = UserRepositorio.class)
    IFUser repository;

    @Override
    public void add(User entity) {
       repository.add(entity);
   
}

    @Override
    public User update(User entity) {
      return null;
    }

    @Override
    public User find(String primaryKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String primaryKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(String gson) {
        repository.add(gson);
    }
    
}

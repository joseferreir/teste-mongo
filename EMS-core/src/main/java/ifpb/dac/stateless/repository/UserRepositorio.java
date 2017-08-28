/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import ifpb.dac.stateless.CrudEntity;
import ifpb.dac.stateless.entity.User;
import ifpb.dac.stateless.infra.ConectionMongoDB;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose2
 */
public class UserRepositorio implements CrudEntity<User>{
    private ConectionMongoDB cmdb;

    @Override
    public void add(User entity) {
        try {
            cmdb = new ConectionMongoDB("aula");
                    DB db =cmdb.getConnection();
                    DBCollection table = db.getCollection("bdUser");
                    //
                    BasicDBObject document = new BasicDBObject("_id", entity.getCpf().formatado());
                    document.put("nome", entity.getNome());
                    document.put("email",entity.getEmail() );
                    document.put("senha",entity.getSenha());
                    document.put("op",entity.getOpcionais());
                    
                    table.insert(document).getN();
                   
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(UserRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
             cmdb.close();
        }
       
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

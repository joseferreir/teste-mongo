/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.repository;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import ifpb.tcc.ems.entity.CPF;
import ifpb.tcc.ems.entity.User;
import ifpb.tcc.ems.infra.ConectionMongoDB;
import ifpb.tcc.ems.interface1.IFUser;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author jose2
 */
@Stateless
@Local()
public class UserRepositorio implements IFUser{
    private ConectionMongoDB cmdb;

    public UserRepositorio() throws IOException, URISyntaxException {
        cmdb = new ConectionMongoDB("tcc");
    }
    

    @Override
    public void add(User entity) {
        DB db =cmdb.getConnection();
        DBCollection table = db.getCollection("usuario");
        BasicDBObject document = new BasicDBObject("_id", entity.getCpf().formatado());
        document.put("nome", entity.getNome());
        document.put("email",entity.getEmail() );
        document.put("senha",entity.getSenha());
        document.put("telefone",entity.getTelefone());
        table.insert(document).getN();
        cmdb.close();
       
    }

    @Override
    public User update(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User find(String primaryKey) {
          
        DB db = cmdb.getConnection();
        DBCollection table = db.getCollection("usuario");
        BasicDBObject query
	    = new BasicDBObject().append("_id", primaryKey);

	DBCursor result = table.find(query);

	result.hasNext() ;
            
            DBObject DBO = result.next();
             String CPF = DBO.toMap().get("_id").toString();
             String nome = DBO.toMap().get("nome").toString();
             String email = DBO.toMap().get("email").toString();
             String senha = DBO.toMap().get("senha").toString();
             String telefone = DBO.toMap().get("telefone").toString();
             cmdb.close();
            
           return User.of(nome, email, new CPF(CPF), senha, telefone);
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
        add(User.Of(gson));
    }

   
}

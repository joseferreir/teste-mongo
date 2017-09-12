/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.entity;
import com.google.gson.GsonBuilder;
import ifpb.tcc.ems.interface1.IFUser;
import ifpb.tcc.ems.repository.UserRepositorio;
import ifpb.tcc.ems.services.IFUserImpl;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jose2
 */
public class NovoClass {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Map<String,Object> m =new HashMap();
        m.put("matricula", "231467");
        m.put("formação", "DR.");
        
        User u =  User.of("maria", "este@gmail.com",
                "100000022", "senha3333","(83)91111-9999");
        System.err.println("-----> \n\n\n\n");
      
        System.err.println("usuario "+u.convertUserToGson());
        
        IFUser repositorio = new UserRepositorio();
        GsonBuilder g =new GsonBuilder();
        
        
        
        repositorio.add(u.convertUserToGson());
       // System.err.println("usuario "+ repositorio.find("123.456.789-09"));
    }
}

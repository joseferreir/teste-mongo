/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.entity;

import ifpb.dac.stateless.repository.UserRepositorio;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jose2
 */
public class NovoClass {
    public static void main(String[] args) {
        Map<String,Object> m =new HashMap();
        m.put("matricula", "231467");
        m.put("formação", "DR.");
        
        User u =  User.of("pedro34", "este@gmail.com",
                new CPF("35693234533"), "sewnn3333", m);
        String ee = u.convertUserToGson();
        System.err.println("-----> \n\n\n\n");
        System.err.println("eeeeee "+ee);
//        
//        UserRepositorio repositorio = new UserRepositorio();
//        repositorio.add(u);
    }
}

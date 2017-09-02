/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.controler;

import ifpb.tcc.ems.entity.User;
import ifpb.tcc.ems.interface1.IFUser;
import ifpb.tcc.ems.util.Mensagem;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jose2
 */
@Named
@RequestScoped
public class UserController implements Serializable{

    private User user;
    @Inject
    private IFUser userService;
    @Inject
    private Mensagem mensagem;

    @PostConstruct
    private void init() {
        this.user = new User();
    }

    public String salvar() {
        try {
            user.setNome("José Ferreira V");
            userService.add(user);
            mensagem.addMessage(null, "Cadastro realizado com sucesso!");
        } catch (Exception e) {
            mensagem.addMessage(null, "Erro");
        }
        return "index";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public User find(){
        return userService.find("123.456.789-01");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.EMS.controler;

import ifpb.tcc.ems.entity.User;
import ifpb.tcc.ems.interface1.IFUser;
import ifpb.tcc.ems.util.Mensagem;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jose2
 */
@Named
@RequestScoped
public class UserController {

    
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    @Inject
    private IFUser userService;
    @Inject
    private Mensagem mensagem;

   

    public String salvar() {
        try {
            
            
            userService.add( User.of(nome, email, cpf, senha, telefone));
            mensagem.addMessage(null, "Cadastro realizado com sucesso!");
        } catch (Exception e) {
            mensagem.addMessage(null, "Erro de" +e.getMessage());
        }
        return "index";
    }

   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public User find() {

        return userService.find("123.456.789-01");
    }

}

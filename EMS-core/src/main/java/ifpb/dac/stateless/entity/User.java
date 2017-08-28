/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.entity;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author jose2
 */

public class User implements Serializable {
    private Gson gson;
    private String nome;
    private String email;
    private CPF cpf;
    private String senha;
    private Map<String,Object> opcionais;

    private User(String nome, String email, CPF cpf, String senha, Map<String, Object> opcionais) {
       
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.opcionais = opcionais;
    }
     public static User of(String nome, String email, CPF cpf, String senha, Map<String, Object> opcionais) {
       
    
        return new User(nome, email, cpf, senha, opcionais);
    }
    


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Map<String, Object> getOpcionais() {
        return opcionais;
    }
    public String convertUserToGson(){
          gson= new Gson();
        return gson.toJson(this);
    }
     public User convertGsonToUser(Gson uGson){
         gson = new Gson();
        return gson.fromJson(uGson.toString(), User.class);
        
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     

  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public void setOpcionais(Map<String, Object> opcionais) {
        this.opcionais = opcionais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.email);
        hash = 23 * hash + Objects.hashCode(this.cpf);
        hash = 23 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
      
    
}

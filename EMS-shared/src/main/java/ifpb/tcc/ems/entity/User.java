/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.entity;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jose2
 */
public class User implements Serializable {

    Gson gson;
    private String nome;
    private String email;
    private CPF cpf;
    private String senha;
    private String telefone;
   

    protected User( String nome, String email, CPF cpf, String senha, String telefone) {
        
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.telefone = telefone;
       
    }

    

    public static User of(String nome, String email, CPF cpf, String senha,String telefone) {

        User user = new User(nome, email, cpf, senha, telefone);

       return user;
    }

    public static User Of(String dados) {
        User user = new User().convertGsonToUser(dados);
return user;
    }

    public User() {

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

  
    public String convertUserToGson() {
      
Gson gson = new Gson();
 
	// converte objetos Java para JSON e retorna JSON como String
	String json = gson.toJson(this);
        return json;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public User convertGsonToUser(String uGson) {
        gson = new Gson();
        return gson.fromJson(uGson, User.class);

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

    @Override
    public String toString() {
        return "User{" + "nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", senha=" + senha + ", opcionais="  + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.entity;

import com.google.gson.Gson;
import java.util.Map;

/**
 *
 * @author jose2
 */
public class participante extends User {

    private Map<String, Object> opcionais;

    protected participante(Map<String, Object> opcionais, String nome, String email, CPF cpf, String senha, String telefone) {
        super(nome, email, cpf, senha, telefone);
        this.opcionais = opcionais;
    }

    public static participante Of(Map<String, Object> opcionais, String nome, String email, CPF cpf, String senha, String telefone) {
        return new participante(opcionais, nome, email, cpf, senha, telefone);
    }
      public static participante  Of(Gson dados){
         return new participante().convertGsonToUser(dados);
         
     }

    private participante() {
        
    }

    @Override
    public String convertUserToGson() {

        Gson gson = new Gson();

        // converte objetos Java para JSON e retorna JSON como String
        String json = gson.toJson(this);
        return json;
    }

    @Override
    public participante convertGsonToUser(Gson uGson) {

        gson = new Gson();
        return gson.fromJson(uGson.toString(), participante.class);

    }

}

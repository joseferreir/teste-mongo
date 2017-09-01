/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.tcc.ems.entity;

import com.google.gson.Gson;
import java.io.File;
import java.util.Map;

/**
 *
 * @author jose2
 */
public class Organizador extends User {

    private File foto;
    private File curriculumLattes;

    private Organizador(File foto, File curriculumLattes, String nome, String email, CPF cpf, String senha, String telefone, Map<String, Object> opcionais) {
        super(nome, email, cpf, senha, telefone);
        this.foto = foto;
        this.curriculumLattes = curriculumLattes;
    }

    private Organizador() {

    }

    public static Organizador of(File foto, File curriculumLattes, String nome, String email, CPF cpf, String senha, String telefone, Map<String, Object> opcionais) {
        return new Organizador(foto, curriculumLattes, nome, email, cpf, senha, telefone, opcionais);
    }

    public static Organizador Of(Gson dados) {
        return new Organizador().convertGsonToUser(dados);

    }

    @Override
    public String convertUserToGson() {

        Gson gson = new Gson();

        // converte objetos Java para JSON e retorna JSON como String
        String json = gson.toJson(this);
        return json;
    }

    @Override
    public Organizador convertGsonToUser(Gson uGson) {

        gson = new Gson();
        return gson.fromJson(uGson.toString(), Organizador.class);

    }

}

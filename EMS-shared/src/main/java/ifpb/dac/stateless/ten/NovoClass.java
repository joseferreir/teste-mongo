/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless.ten;

/**
 *
 * @author jose2
 */
public class NovoClass {
    public static void main(String[] args) {
        User u =  User.of("jose", "jose@gmail.com",
                new CPF("23133234533"), "sewnn3333", null);
        UserRepositorio repositorio = new UserRepositorio();
        repositorio.add(u);
    }
}

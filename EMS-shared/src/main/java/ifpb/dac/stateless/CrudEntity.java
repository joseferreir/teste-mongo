/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.stateless;

/**
 *
 * @author jose2
 * @param <T>
 */
public interface CrudEntity<T> {

    public void add(T entity);

    public T update(T entity);

    public T find(T id);

    public void remove(T id);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazservicioestres;
/**
 *
 * @author sdist
 */
public interface InterfazServicioEstres {
    boolean incializa(int id);
    long invocaServicio(int vez);
    void cierra();
}

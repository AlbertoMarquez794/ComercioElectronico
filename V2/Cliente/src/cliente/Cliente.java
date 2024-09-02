/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import iservicio.IServicio;

/**
 *
 * @author sdist
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //IServicio obj_serv = (IServicio) Class.forName("objserv.ObjServ").newInstance();
        IServicio obj_serv = (IServicio) Class.forName(args[0]).newInstance();
        //IServicio obj_serv = (IServicio) Class.forName("objserv.ObjServ").newInstance();
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int s, r;
        
        s = obj_serv.suma(a,b);
        r = obj_serv.resta(a,b);
        
        System.out.println("La suma de " + a + " + " + b + " = " + s);
        System.out.println("La resa de " + a + " - " + b + " = " + r);
    }
    
}

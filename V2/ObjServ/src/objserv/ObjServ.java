/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objserv;
import iservicio.IServicio;
/**
 *
 * @author sdist
 */
public class ObjServ implements IServicio {

    @Override
    public int suma(int a, int b) {
     return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }    
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //IServicio obj_serv = (IServicio) Class.forName("objserv.ObjServ").newInstance();
        IServicio obj_serv = (IServicio) Class.forName("objserv.ObjServ").newInstance();
        //IServicio obj_serv = (IServicio) Class.forName("objserv.ObjServ").newInstance();
        int a = 20;
        int b = 5;
        int s, r;
        
        s = obj_serv.suma(a,b);
        r = obj_serv.resta(a,b);
        
        System.out.println("La suma de " + a + " + " + b + " = " + s);
        System.out.println("La resa de " + a + " - " + b + " = " + r);
    }
}

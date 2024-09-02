/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteestresadorws;
import interfazservicioestres.InterfazServicioEstres;
/**
 *
 * @author sdist
 */
public class ClienteEstresadorWS implements InterfazServicioEstres {

    /**
     * @param args the command line arguments
     */
    int quienSoy;
    ws_suma.WSSuma port;
    
    public static void main(String[] args) throws Exception {
        //Objeto de servicio
        interfazservicioestres.InterfazServicioEstres objServ = 
                (interfazservicioestres.InterfazServicioEstres)
                Class.forName("clienteestresadorws.ClienteEstresadorWS").newInstance(); //Una objeto instanciable
        objServ.incializa(1);
        int N_VECES = 20;
        int vez;
        long dt = 0, dt2;
        long s_dt = 0, s_dt2 =0;
        for (vez = 1; vez < N_VECES; vez++) {
            dt = objServ.invocaServicio(vez);
            dt2 = dt * dt;
            s_dt += dt;
            s_dt2 += dt2;
            System.out.println("Se proporciono el servicio " + vez + " tardando " + dt + " microSeg");
        }
        
    }

    @Override
    public boolean incializa(int quienSoy) {
        this.quienSoy = quienSoy;
        ws_suma.WSSuma_Service service = new ws_suma.WSSuma_Service();
        this.port = service.getWSSumaPort();
        return true;
    }

    @Override
    public long invocaServicio(int i) {
        long t0, t1, dt;
        int a = (int) (1000 * Math.random());
        int b = (int) (1000 * Math.random());
        t0 = System.currentTimeMillis();
        int c = port.suma(a,b);
        t1 = System.currentTimeMillis();
        dt = t1 - t0;
        
        return dt;
    }

    @Override
    public void cierra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int suma(int a, int n) {
        ws_suma.WSSuma_Service service = new ws_suma.WSSuma_Service();
        ws_suma.WSSuma port = service.getWSSumaPort();
        return port.suma(a, n);
    }
    
}

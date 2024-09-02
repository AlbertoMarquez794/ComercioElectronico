/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_suma_pojo;

/**
 *
 * @author sdist
 */
public class WS_Suma_POJO {
    
    ws_suma.WSSuma proxy;
    
    public WS_Suma_POJO()
    {
      ws_suma.WSSuma_Service service = new ws_suma.WSSuma_Service(); //Insfraestructura de proxy
      proxy = service.getWSSumaPort();
    }
    
    
    public int suma(int a, int b){
        return proxy.suma(a, b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c;
       int veces = 20;
       
       WS_Suma_POJO objEnvolventeProxy = new WS_Suma_POJO(); 
       
       if (args.length > 0){
           veces = Integer.parseInt(args[0]);
       }
       
       for (int i=1; i <= veces; i++){
            a = (int)(Math.random()*100/i);
            b = (int)(Math.random()*100/i);
            c = objEnvolventeProxy.suma(a, b);
            System.out.println("La suma de: " + a + " y " + b + " es " + c);
       }
       

        
    }

    /*private static int suma(int a, int n) {
        ws_suma.WSSuma_Service service = new ws_suma.WSSuma_Service(); //Insfraestructura de proxy
        ws_suma.WSSuma port = service.getWSSumaPort();
        return port.suma(a, n);
    }*/
    
}

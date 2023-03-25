/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lalalalala;

import java.time.LocalDate;

/**
 *
 * @author murilo
 */
public class Lalalalala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//      var p1 = new Medico(1, 12345L, LocalDate.now(),"Murilo","aaa@gmail.com","992176973");

        var p1 = new Pediatra(1, 12345L, LocalDate.now(),"Murilo","aaa@gmail.com","992176973");
        
        var p2 = new Paciente("Pedro","bbb@gmail.com","9876543124");
        
        System.out.println(p1.GetInfo());
        
        p1.executarProcediemento(p2);
    }
    
}

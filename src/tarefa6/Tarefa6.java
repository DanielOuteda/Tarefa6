/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa6;

/**
 *
 * @author Usaurio
 */
public class Tarefa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UNO obj1 = new UNO();
        DOS obj2 = new DOS();
        TRES obj3 = new TRES();
        CUATRO obj4 = new CUATRO();

        System.out.println("obj1.test = " + obj1.test());

        System.out.println("obj1.result1 = " + obj1.result1());

        System.out.println("obj2.test = " + obj2.test());

        System.out.println("obj2.result1 = " + obj3.result1());

        System.out.println("obj3.test = " + obj3.test());

        System.out.println("obj4.result1 = " + obj4.result1());

        System.out.println("obj3.result2 = " + obj3.result2());

        System.out.println("obj4.result2 = " + obj4.result2());
        System.out.println("obj3.result3 = " + obj3.result3());

        System.out.println("obj4.result3 = " + obj4.result3());
    }
}

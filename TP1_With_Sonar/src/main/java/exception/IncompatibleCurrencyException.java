/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exception;

/**
 *
 * @author marius
 */
public class IncompatibleCurrencyException extends RuntimeException {
   IncompatibleCurrencyException(String curr1,String curr2) {
     super("You cannot add "+curr1+" with "+curr2+" directly. Use appropiate methods or exchange currencies!");
   }
}
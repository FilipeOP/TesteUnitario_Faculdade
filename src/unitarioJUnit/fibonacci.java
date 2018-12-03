/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarioJUnit;

/**
 *
 * @author Filipe Oliveira RA: 317112097
 */
public class fibonacci {
    
    public int DeterminaPosicaoFibonacci(int n) {

        if (n < 2) {
            return n;
        } else {
            return DeterminaPosicaoFibonacci(n - 1) + DeterminaPosicaoFibonacci(n - 2);
        }
    }
}

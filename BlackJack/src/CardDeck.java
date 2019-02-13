/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carter
 */
class CardDeck {

   

    int[] deck = new int [53];
    
    
    
    static int randomCard() {
        
        int random = (int )(Math.random() * 11 + 1);
        return random;
    }
    
    
    
}

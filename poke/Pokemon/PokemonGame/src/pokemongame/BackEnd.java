/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author Half_BlooD PrincE
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author Half_BlooD PrincE
 */
public class BackEnd {

    /**
     * @param args the command line arguments
     */
    static Pokemon p1,p2;
    static ArrayList<Pokemon> pokemon =new ArrayList<>();
    public BackEnd() {
        
        pokemon.add(new Venasaur());
        pokemon.add(new Charizad());
        pokemon.add(new Blastoise());
        pokemon.add(new Feraligatr());
        pokemon.add(new Typhlosion());
        pokemon.add(new Mewtwo());
        pokemon.add(new Swampert());
        pokemon.add(new Blaziken());
        pokemon.add(new Sceptile());
        }
    void selectPokemonP1(int x){
        p1=pokemon.get(x);
        
    }
    
    void selectPokemonP2(int x){
        p2=pokemon.get(x);
        
    }
}

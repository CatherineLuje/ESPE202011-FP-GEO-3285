/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortingecuadorvolcanoes.model;

/**
 *
 * @author User
 */
public class Searcher {

    public int findVolcanoes(String[] volcanoes,String seacrhVolcanoes) {
        int i;
        int n = volcanoes.length;
        for (i = 0; i < n; i++) {
            if (volcanoes[i].equals(seacrhVolcanoes)) {
                return i;
            }
        }
        return -1;

    }
}

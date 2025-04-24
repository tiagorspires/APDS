/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hparedes
 */

public class BidirectionalBubbleSortAlgorithmAdapter implements Target{

    @Override
    public void sort(int[] array) {
        try {
            (new BidirectionalBubbleSortAlgorithm()).bidirectionalSort(array);
        } catch (Exception ex) {
            Logger.getLogger(BidirectionalBubbleSortAlgorithmAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}

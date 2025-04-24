/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hparedes
 */
public class BubbleSort2AlgorithmAdapter implements Target{

    @Override
    public void sort(int[] array) {
        try {
            new BubbleSort2Algorithm().bubbleSort(array);
        } catch (Exception ex) {
            Logger.getLogger(BubbleSort2AlgorithmAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

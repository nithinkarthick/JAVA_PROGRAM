package com.azoho;
import java.util.*;

public class SortElementsByFrequency {
    static class ElementFrequency {
        int element;
        int frequency;
        
        ElementFrequency(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }
    }
    
    public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies of elements
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create an array of ElementFrequency objects
        ElementFrequency[] elements = new ElementFrequency[frequencyMap.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            elements[index++] = new ElementFrequency(entry.getKey(), entry.getValue());
        }
        
        // Sort the array based on frequency in descending order
        Arrays.sort(elements, (a, b) -> b.frequency - a.frequency);
        
        // Reconstruct the sorted array
        int k = 0;
        for (ElementFrequency ef : elements) {
            int element = ef.element;
            int frequency = ef.frequency;
            for (int i = 0; i < frequency; i++) {
                arr[k++] = element;
            }
        }
        
        // Output the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12};
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.print("Output: ");
        sortByFrequency(arr);
    }
}

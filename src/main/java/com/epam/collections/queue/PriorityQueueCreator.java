package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue <String> pq = new PriorityQueue<>(new reverseAlphabetOrderComparator());
        for (String elem1 : firstList){
            pq.add(elem1);
        }
        for (String elem2 : secondList){
            pq.add(elem2);
        }

        return pq;
    }

}
class reverseAlphabetOrderComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
}
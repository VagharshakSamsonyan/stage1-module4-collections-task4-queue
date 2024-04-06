package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        if (firstQueue.size() >= 2 && secondQueue.size() >= 2 && firstQueue.size() == secondQueue.size() && firstQueue.size() % 2 == 0) {


            ad.addLast(firstQueue.poll());

            ad.addLast(firstQueue.poll());

            ad.addLast(secondQueue.poll());

            ad.addLast(secondQueue.poll());

            while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {

                firstQueue.add(ad.pollLast());

                ad.addLast(firstQueue.poll());

                ad.addLast(firstQueue.poll());

                secondQueue.add(ad.pollLast());

                ad.addLast(secondQueue.poll());

                ad.addLast(secondQueue.poll());
            }
        }
        return ad;
    }
}
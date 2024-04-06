package com.epam.collections.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {


        Queue<Integer> allDishes = new LinkedList<>();
        for (int i=1;i<=numberOfDishes;i++)
        {allDishes.add(i);}

        Queue<Integer> dishOrder = new LinkedList<>();
        while(!allDishes.isEmpty()) {
            for (int i=1;i<everyDishNumberToEat;i++)
            {
                allDishes.offer(allDishes.poll());
            }
            dishOrder.add(allDishes.poll());


        }

        return (List<Integer>) dishOrder;
    }
}
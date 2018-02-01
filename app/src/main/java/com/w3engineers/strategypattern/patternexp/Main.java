package com.w3engineers.strategypattern.patternexp;

import com.w3engineers.strategypattern.patternexp.exp1.CreditCardStrategy;
import com.w3engineers.strategypattern.patternexp.exp1.Item;
import com.w3engineers.strategypattern.patternexp.exp1.PaypalStrategy;
import com.w3engineers.strategypattern.patternexp.exp1.ShoppingCart;
import com.w3engineers.strategypattern.patternexp.exp2.StrategyContext;
import com.w3engineers.strategypattern.patternexp.exp2.OperationAdd;
import com.w3engineers.strategypattern.patternexp.exp2.OperationMultiply;
import com.w3engineers.strategypattern.patternexp.exp2.OperationSubtract;
import com.w3engineers.strategypattern.patternexp.exp3.MergeSort;
import com.w3engineers.strategypattern.patternexp.exp3.QuickSort;
import com.w3engineers.strategypattern.patternexp.exp3.ShellSort;
import com.w3engineers.strategypattern.patternexp.exp3.SortedList;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    private static void example1() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("sudipta@w3engineers.com", "toughPassword"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Sudipta K Paik", "1234567890123456", "786", "12/20"));
    }

    private static void example2() {
        StrategyContext strategyContext = new StrategyContext(new OperationAdd(10, 5));
        System.out.println("10 + 5 = " + strategyContext.executeStrategy());

        strategyContext = new StrategyContext(new OperationSubtract());
        System.out.println("10 - 5 = " + strategyContext.executeStrategy(10, 5));

        strategyContext = new StrategyContext(new OperationMultiply());
        System.out.println("10 * 5 = " + strategyContext.executeStrategy(10, 5));
    }

    private static void example3() {
        SortedList sortedList = new SortedList();

        sortedList.add("Tarikul");
        sortedList.add("Shapla");
        sortedList.add("Rifat");
        sortedList.add("Azim");
        sortedList.add("Aziz");
        sortedList.add("Faisal");

        sortedList.setStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setStrategy(new ShellSort());
        sortedList.sort();

        sortedList.setStrategy(new MergeSort());
        sortedList.sort();
    }
}
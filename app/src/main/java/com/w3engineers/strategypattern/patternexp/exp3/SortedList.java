package com.w3engineers.strategypattern.patternexp.exp3;

import java.util.ArrayList;
import java.util.List;

/*
* ****************************************************************************
* * Copyright © 2018 W3 Engineers Ltd., All rights reserved.
* *
* * Created by:
* * Name : SUDIPTA KUMAR PAIK
* * Date : 2/1/18
* * Email : sudipta@w3engineers.com
* *
* * Purpose :
* *
* * Last Edited by : SUDIPTA KUMAR PAIK on 2/1/18.
* * History:
* * 1:
* * 2:
* *  
* * Last Reviewed by : SUDIPTA KUMAR PAIK on 2/1/18.
* ****************************************************************************
*/
public class SortedList {
    private List<String> _list = new ArrayList<>();
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void add(String name) {
        _list.add(name);
    }

    public void sort() {
        strategy.sort(_list);

        for (String name : _list) {
             System.out.println(name);
        }
    }
}
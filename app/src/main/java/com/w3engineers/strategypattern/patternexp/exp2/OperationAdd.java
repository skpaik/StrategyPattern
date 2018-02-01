package com.w3engineers.strategypattern.patternexp.exp2;

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
public class OperationAdd implements Strategy {
    private int mNum1;
    private int mNum2;

    public OperationAdd(int num1, int num2) {
        mNum1 = num1;
        mNum2 = num2;
    }

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int doOperation() {
        return mNum1 + mNum2;
    }
}
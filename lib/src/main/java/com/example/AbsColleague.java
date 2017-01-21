package com.example;

/**
 *
 * Created by Administrator on 2016/11/21.
 */

public abstract class AbsColleague {

    protected AbsUiMediator mediator;

    public AbsColleague(AbsUiMediator mediator) {
        this.mediator = mediator;
    }
}

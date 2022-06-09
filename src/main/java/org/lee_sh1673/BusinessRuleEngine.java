package org.lee_sh1673;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic class of Business rule engine
 *
 * @author LEE-sh1673
 * @since 2022.06.09
 */
public class BusinessRuleEngine {

    private final List<Action> actions;
    private final Facts facts;

    public BusinessRuleEngine(final Facts facts) {
        this.actions = new ArrayList<>();
        this.facts = facts;
    }

    public void addAction(final Action action) {
        this.actions.add(action);
    }

    public int count() {
        return this.actions.size();
    }

    public void run() {
        this.actions.forEach(action -> action.execute(facts));
    }
}



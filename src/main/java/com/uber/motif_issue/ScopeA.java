package com.uber.motif_issue;

import motif.Creatable;
import motif.Expose;
import motif.NoDependencies;

@SuppressWarnings("NullableProblems")
@motif.Scope
public interface ScopeA extends
        Creatable<NoDependencies>,
        // The line below allows [ScopeCreatableChild] to be created via [ScopeFactory]
        ScopeCreatableChild.Dependencies {

    @ActivityContext Context activityContext();

    @AppContext
    Context context();

    ScopeChild scopeChild();

    // The line below allows [ScopeCreatableChild] to be created via a traditional child method
    ScopeCreatableChild scopeCreatableChild();

    @motif.Objects
    abstract class Objects {

        @Expose
        @ActivityContext
        Context activityContext() {
            return new ActiveContext();
        }

        @Expose
        @AppContext
        Context appContext() {
            return new ApplicationContext();
        }

    }

}

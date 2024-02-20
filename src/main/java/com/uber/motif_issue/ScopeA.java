package com.uber.motif_issue;

import motif.Creatable;
import motif.Expose;
import motif.NoDependencies;

import javax.inject.Named;

@SuppressWarnings("NullableProblems")
@motif.Scope
public interface ScopeA extends Creatable<NoDependencies>, ScopeCreatableChild.Dependencies {

    @ActivityContext Context activityContext();

    @AppContext
    Context context();

    ScopeChild scopeChild();

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

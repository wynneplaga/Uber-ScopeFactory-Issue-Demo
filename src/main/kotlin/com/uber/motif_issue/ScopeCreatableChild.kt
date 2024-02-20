package com.uber.motif_issue

import motif.Creatable

/**
 * A scope which implements Creatable
 */
@motif.Scope
interface ScopeCreatableChild: Creatable<ScopeCreatableChild.Dependencies> {

    @ActivityContext
    fun activityContext(): Context

    interface Dependencies {
        // Matches to the activity method is created by a Motif child method
        // but matches to the application method if created by [ScopeBuilder.create]
        @ActivityContext fun context(): Context
    }

}
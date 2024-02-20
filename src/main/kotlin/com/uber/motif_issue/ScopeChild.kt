package com.uber.motif_issue

/**
 * A scope created by a normal Motif child method
 */
@motif.Scope
interface ScopeChild {

    @ActivityContext
    fun activityContext(): Context

}
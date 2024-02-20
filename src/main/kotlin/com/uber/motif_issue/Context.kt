package com.uber.motif_issue

import javax.inject.Qualifier

/**
 * A stand in for the Android context
 */
abstract class Context {
    abstract val type: String
}

class ActiveContext : Context() {
    override val type: String = "Activity"
}

class ApplicationContext : Context() {
    override val type: String = "Application"
}

@Qualifier
annotation class AppContext

@Qualifier
annotation class ActivityContext
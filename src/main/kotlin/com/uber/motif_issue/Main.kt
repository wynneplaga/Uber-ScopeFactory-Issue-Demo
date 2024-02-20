package com.uber.motif_issue

import motif.ScopeFactory

fun main() {
    val scopeA = ScopeFactory.create(ScopeA::class.java)
    println("Parent: ${scopeA.activityContext().type}")

    println("ScopeChild: ${scopeA.activityContext().type}")

    println("ScopeCreateableChild[Child Method]: ${scopeA.scopeCreatableChild().activityContext().type}")

    val scopeManualChild = ScopeFactory.create(ScopeCreatableChild::class.java, scopeA)
    println("ScopeCreateableChild[ScopeFactory]: ${scopeManualChild.activityContext().type}")
}
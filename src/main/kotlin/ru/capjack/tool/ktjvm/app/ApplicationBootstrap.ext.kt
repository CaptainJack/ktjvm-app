package ru.capjack.tool.ktjvm.app

inline fun <reified T : ApplicationModule> ApplicationBootstrap.module() = module(T::class)
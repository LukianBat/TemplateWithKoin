package com.lukianbat.template.core.presentation

interface EventsDispatcherOwner<T> {
    val eventsDispatcher: EventsDispatcher<T>
}
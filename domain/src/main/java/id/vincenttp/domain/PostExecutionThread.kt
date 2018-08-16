package com.dailyact.domain

import io.reactivex.Scheduler

/**
 * Created by lukma on 11/02/18.
 *
 * Thread abstraction created to change the execution context from any thread to any other thread.
 * Useful to encapsulate a UI Thread for example, since some job will be done in background, an
 * implementation of this interface will change context and update the UI.
 */
interface PostExecutionThread {
    fun getScheduler(): Scheduler
}
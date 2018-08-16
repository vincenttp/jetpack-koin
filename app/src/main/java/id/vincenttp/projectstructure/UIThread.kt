package com.dailyact.apps

import com.dailyact.domain.PostExecutionThread
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by lukma on 11/02/18.
 *
 * MainThread (UI Thread) implementation based on a [Scheduler]
 * which will execute actions on the Android UI thread
 */
@Singleton
class UIThread @Inject constructor() : PostExecutionThread {
    override fun getScheduler(): Scheduler = AndroidSchedulers.mainThread()
}
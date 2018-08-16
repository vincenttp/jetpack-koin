package com.dailyact.domain

import io.reactivex.Flowable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by lukma on 10/02/18.
 *
 * Abstract class for a Use Case (Interactor in terms of Clean Architecture).
 * This interface represents a execution unit for different use cases (this means any use case
 * in the application should implement this contract).
 *
 * By convention each UseCase implementation will return the result using a [DisposableSubscriber]
 * that will execute its job in a background thread and will post the result in the UI thread.
 */
abstract class UseCase<T, in Params>(private val postExecutionThread: PostExecutionThread) {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    /**
     * Builds an [Flowable] which will be used when executing the current [UseCase].
     */
    abstract fun build(params: Params): Flowable<T>

    fun execute(subscriber: DisposableSubscriber<T>, params: Params) {
        val disposable = build(params)
                .subscribeOn(Schedulers.io())
                .observeOn(postExecutionThread.getScheduler())
                .subscribeWith(subscriber)
        addDisposable(disposable)
    }

    /**
     * Dispose from current [CompositeDisposable].
     */
    fun dispose() {
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }
    }

    /**
     * Dispose from current [CompositeDisposable].
     */
    private fun addDisposable(disposable: Disposable?) {
        if (compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }

        compositeDisposable.add(disposable!!)
    }
}
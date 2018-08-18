package id.vincenttp.domain

import io.reactivex.subscribers.DisposableSubscriber

open class DefaultSubscriber<T> : DisposableSubscriber<T>() {
    override fun onComplete() {
        // no-op by default.
    }

    override fun onNext(data: T) {
        // no-op by default.
    }

    override fun onError(error: Throwable?) {
        // no-op by default.
    }
}
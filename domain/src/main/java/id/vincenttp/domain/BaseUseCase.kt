package id.vincenttp.domain

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**
 * Created by vincenttp on 2019-08-03.
 */

abstract class BaseUseCase<Entity, Params> {
    var params: Params? = null
    private var onSuccess: (Entity) -> Unit = {}
    private var onError: (Throwable) -> Unit = { it.printStackTrace() }

    abstract suspend fun build(params: Params): Entity

    fun addParams(params: Params?) = apply {
        this.params = params
    }

    fun onSuccess(onSuccess: (Entity) -> Unit) = apply {
        this.onSuccess = onSuccess
    }

    fun onError(onError: (Throwable) -> Unit) = apply {
        this.onError = onError
    }

    fun execute(scope: CoroutineScope = CoroutineScope(Dispatchers.IO)) =
            scope.launch(CoroutineExceptionHandler { _, exception -> onError(exception) }) {
                onSuccess(build(params!!))
            }
}
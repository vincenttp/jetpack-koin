package id.vincenttp.projectstructure.feature

import android.util.Log
import id.vincenttp.domain.DefaultSubscriber
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.iteractor.GetDetail
import id.vincenttp.projectstructure.base.BasePresenter
import javax.inject.Inject

class SamplePresenter @Inject constructor(private val getDetail: GetDetail): BasePresenter{
    lateinit var view: SampleContract.SampleView

    override fun resume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun destroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private inner class Subscriber : DefaultSubscriber<UserModel>() {
        override fun onNext(data: UserModel) {
            Log.d("SamplePresenter", data.username)
        }

        override fun onError(error: Throwable?) {
            Log.d("SamplePresenter", error!!.message.toString())
        }
    }

    fun getD(){
        getDetail.execute(Subscriber(), GetDetail.Params("vincenttp"))
    }
}
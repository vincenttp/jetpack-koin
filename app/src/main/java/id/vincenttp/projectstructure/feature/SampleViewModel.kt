package id.vincenttp.projectstructure.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.interactor.GetDetail

/**
 * Created by vincenttp on 2019-08-03.
 */
class SampleViewModel(private val getDetail: GetDetail) : ViewModel() {
    private val getDetailMutable = MutableLiveData<UserModel>()
    internal val getDetailData: LiveData<UserModel>
        get() = getDetailMutable

    fun getDetails() {
        getDetail.addParams(GetDetail.Params("vincenttp")).onSuccess(getDetailMutable::postValue).execute(viewModelScope)
    }
}
package id.vincenttp.projectstructure.feature.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.interactor.GetDetail

class SampleFrViewModel(
        getDetail: GetDetail
) : ViewModel() {
    private val getDetailMutable = MutableLiveData<UserModel>()
    val getDetailData: LiveData<UserModel>
        get() = getDetailMutable

    init {
        getDetail.addParams(GetDetail.Params("vincenttp")).onSuccess(getDetailMutable::postValue).execute(viewModelScope)
    }
}

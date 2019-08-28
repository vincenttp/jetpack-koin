package id.vincenttp.projectstructure.feature.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.vincenttp.domain.entities.RepoModel
import id.vincenttp.domain.interactor.GetRepo

class RepositoryViewModel(getRepo: GetRepo) : ViewModel() {
    private val repolMutable = MutableLiveData<List<RepoModel>>()
    val repoData: LiveData<List<RepoModel>>
        get() = repolMutable

    init {
        getRepo.addParams(GetRepo.Params("vincenttp")).onSuccess(repolMutable::postValue).execute(viewModelScope)
    }
}

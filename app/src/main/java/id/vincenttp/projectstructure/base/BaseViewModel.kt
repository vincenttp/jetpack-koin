package id.vincenttp.projectstructure.base

import androidx.lifecycle.ViewModel
import id.vincenttp.projectstructure.common.DialogLoading

abstract class BaseViewModel : ViewModel() {
    lateinit var dialogLoading: DialogLoading
}

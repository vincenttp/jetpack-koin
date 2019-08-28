package id.vincenttp.projectstructure.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import id.vincenttp.projectstructure.common.DialogLoading

abstract class BaseFragment<VM : ViewModel> : Fragment() {
    abstract val viewModel: VM
    val dialogLoading: DialogLoading by lazy {
        DialogLoading(context!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onInitViews()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        onInitObservers()
    }

    protected open fun onInitViews() = Unit

    protected open fun onInitObservers() = Unit
}

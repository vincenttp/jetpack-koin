package id.vincenttp.projectstructure.feature.repository

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.vincenttp.projectstructure.base.BaseFragment
import id.vincenttp.projectstructure.databinding.RepositoryFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RepositoryFragment : BaseFragment<RepositoryViewModel>() {
    override val viewModel by viewModel<RepositoryViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = RepositoryFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}

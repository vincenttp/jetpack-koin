package id.vincenttp.projectstructure.feature.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import id.vincenttp.projectstructure.R
import id.vincenttp.projectstructure.base.BaseFragment
import id.vincenttp.projectstructure.databinding.SampleFrFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SampleFrFragment : BaseFragment<SampleFrViewModel>() {
    override val viewModel by viewModel<SampleFrViewModel>()
    override val resourceLayout = R.layout.sample_fr_fragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = DataBindingUtil.inflate<SampleFrFragmentBinding>(inflater, resourceLayout, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}

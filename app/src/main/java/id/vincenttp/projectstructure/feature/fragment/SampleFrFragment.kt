package id.vincenttp.projectstructure.feature.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import id.vincenttp.projectstructure.R
import id.vincenttp.projectstructure.base.BaseFragment
import id.vincenttp.projectstructure.databinding.SampleFrFragmentBinding
import kotlinx.android.synthetic.main.sample_fr_fragment.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SampleFrFragment : BaseFragment<SampleFrViewModel>() {
    override val viewModel by viewModel<SampleFrViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = SampleFrFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onInitViews() {
        super.onInitViews()
        btnRepository.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_sampleFrFragment_to_repositoryFragment))
    }
}

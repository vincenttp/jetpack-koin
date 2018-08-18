package id.vincenttp.projectstructure.feature

import android.os.Bundle
import id.vincenttp.projectstructure.R
import id.vincenttp.projectstructure.base.BaseActivity
import javax.inject.Inject

class SampleActivity : BaseActivity(), SampleContract.SampleView {
    @Inject
    lateinit var presenter: SamplePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        presenter.view = this
        presenter.getD()
    }
}

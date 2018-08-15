package id.vincenttp.projectstructure.feature

import id.vincenttp.projectstructure.base.BaseActivity
import javax.inject.Inject

class SampleActivity : BaseActivity() {
    @Inject
    lateinit var presenter: SamplePresenter
}

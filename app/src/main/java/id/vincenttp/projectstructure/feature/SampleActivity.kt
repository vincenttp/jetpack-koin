package id.vincenttp.projectstructure.feature

import androidx.lifecycle.Observer
import id.vincenttp.projectstructure.R
import id.vincenttp.projectstructure.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SampleActivity : BaseActivity<SampleViewModel>() {
    override val resourceLayout: Int? = R.layout.activity_sample
    override val viewModel by viewModel<SampleViewModel>()

    override fun onInitViews() {
        viewModel.getDetails()
    }

    override fun onInitObservers() {
        viewModel.getDetailData.observe(this, Observer {
            println("SampleActivity ${it.username}")
        })
    }

    /*private val splitInstallManager: SplitInstallManager by lazy {
        SplitInstallManagerFactory.create(applicationContext)
    }

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        presenter.view = this
        presenter.getD()

        button.setOnClickListener {
            loadDynamicFeature()
        }

    }

    private fun loadDynamicFeature() {
        if (splitInstallManager.installedModules.contains("dynamic_feature")){
            Intent().setClassName(packageName, "id.vincenttp.dynamic_feature.MainDynamicActivity")
                    .also {
                        startActivity(it)
                    }
        }

        val request = SplitInstallRequest
                .newBuilder()
                .addModule("dynamic_feature")
                .build()

        splitInstallManager.startInstall(request)
                .addOnCompleteListener {
                }
                .addOnFailureListener {
                    Toast.makeText(applicationContext, "fail", Toast.LENGTH_SHORT).show()
                }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SampleActivity> {
        override fun createFromParcel(parcel: Parcel): SampleActivity {
            return SampleActivity(parcel)
        }

        override fun newArray(size: Int): Array<SampleActivity?> {
            return arrayOfNulls(size)
        }
    }*/
}

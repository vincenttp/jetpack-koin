package id.vincenttp.projectstructure.feature

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import id.vincenttp.projectstructure.R
import id.vincenttp.projectstructure.base.BaseActivity
import kotlinx.android.synthetic.main.activity_sample.*
import javax.inject.Inject

class SampleActivity : BaseActivity(), SampleContract.SampleView {
    @Inject
    lateinit var presenter: SamplePresenter

    private val splitInstallManager: SplitInstallManager by lazy {
        SplitInstallManagerFactory.create(applicationContext)
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
}

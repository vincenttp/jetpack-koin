package id.vincenttp.projectstructure.common.extention

import android.widget.Toast
import androidx.fragment.app.Fragment

/**
 * Created by vincenttp on 2019-08-11.
 */

fun Fragment.toast(message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
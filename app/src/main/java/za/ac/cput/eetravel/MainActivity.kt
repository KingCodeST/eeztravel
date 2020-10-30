package za.ac.cput.eetravel

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.user_signup.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun showRegisteration(){
        user_sign.visibility =View.GONE
        content_main.visibility=View.GONE
        home_11.visibility=View.VISIBLE
    }

    private fun showLogin(){
        user_sign.visibility =View.VISIBLE
        content_main.visibility=View.GONE
        home_11.visibility=View.GONE
    }

    private fun showHome(){
        user_sign.visibility =View.GONE
        content_main.visibility=View.GONE
        home_11.visibility=View.VISIBLE
    }


}

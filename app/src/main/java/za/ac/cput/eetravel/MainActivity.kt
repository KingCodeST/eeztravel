package za.ac.cput.eetravel

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.user_signup.*

class MainActivity : AppCompatActivity() {

   lateinit var handler:DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = DatabaseHelper(this)

        signup_btn.setOnClickListener {
            showRegisteration()
        }

        signbtn.setOnClickListener {
            if (handler.userPresent(user_sign_in.text.toString(),user_sign_pass.text.toString()))

                Toast.makeText(this,"Login Success", Toast.LENGTH_SHORT).show()


            else
                Toast.makeText(this,"username or password is incorrect", Toast.LENGTH_SHORT).show()

            }

        user_sign_up_btn.setOnClickListener {

            handler.insertUserData(sign_up_username.text.toString() ,sign_up_email.text.toString(),sign_up_password.text.toString())
            showHome()
        }


//        showLogin()

    }

   fun showRegisteration(){
        user_signup.visibility =View.VISIBLE
        content_main.visibility=View.GONE
        home_11.visibility=View.GONE
    }

    fun showLogin(){
        user_signup.visibility =View.GONE
        content_main.visibility=View.VISIBLE
        home_11.visibility=View.GONE
    }

   fun showHome(){
        user_signup.visibility =View.GONE
        content_main.visibility=View.GONE
        home_11.visibility=View.VISIBLE
    }


}

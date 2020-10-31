package za.ac.cput.eetravel

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.user_signup.*

class Signup : AppCompatActivity() {

    lateinit var handler: DatabaseHelper
    lateinit var main: MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_signup)
        handler = DatabaseHelper(this)


        user_sign_up_btn.setOnClickListener {

            handler.insertUserData(sign_up_username.text.toString() ,sign_up_email.text.toString(),sign_up_password.text.toString())
            main.showHome()
        }



    }

}
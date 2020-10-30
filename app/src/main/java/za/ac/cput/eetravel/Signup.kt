package za.ac.cput.eetravel

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.user_signup.*

class Signup : AppCompatActivity() {

    lateinit var handler: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_signup)
        handler = DatabaseHelper(this)

        user_signupbtn.setOnClickListener {

            handler.insertUserData(sign_up_username.text.toString() ,sign_up_email.text.toString(),sign_up_password.text.toString())
        }

        user_signupbtn.setOnClickListener {
            if (handler.userPresent(user_sign_in.text.toString(),user_sign_pass.text.toString()))
                Toast.makeText(this,"Login Success", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"username or password is incorrect", Toast.LENGTH_SHORT).show()
        }

    }

}
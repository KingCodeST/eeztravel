package za.ac.cput.eetravel

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class splash_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background =object : Thread()
        {
            override  fun run()
            {
                try{
                    Thread.sleep(5000)

                    val intent =Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }catch (e: Exception)
                {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
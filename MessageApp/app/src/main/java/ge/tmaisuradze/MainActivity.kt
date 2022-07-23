package ge.tmaisuradze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerClickedMain(view: View) {
        val intent = Intent(this, RegisterActivity::class.java).apply {}
        startActivity(intent)
        finish()
    }
    fun loginClickedMain(view: View) {
        val intent = Intent(this, LoginActivity::class.java).apply {}
        startActivity(intent)
        finish()
    }


}
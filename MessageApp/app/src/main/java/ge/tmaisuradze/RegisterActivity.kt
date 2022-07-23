package ge.tmaisuradze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun pressToSignInClicked(view: View) {
        val intent = Intent(this, LoginActivity::class.java).apply {}
        startActivity(intent)
        finish()
    }
}
package edmt.dev.mypaper


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun timesofindia(view: View) {
        val intent = Intent(this@MainActivity, NewsPaperDetails::class.java)
        intent.putExtra("key", "https://timesofindia.indiatimes.com/")

        startActivity(intent)
    }

    fun newyorktimes(view: View) {
        val intent = Intent(this@MainActivity, NewsPaperDetails::class.java)
        intent.putExtra("key", "https://www.nytimes.com//")

        startActivity(intent)
    }
    fun eenadu(view: View) {
        val intent = Intent(this@MainActivity, NewsPaperDetails::class.java)
        intent.putExtra("key", "https://www.eenadu.net/")

        startActivity(intent)
    }

    fun deccanchronicle(view: View) {
        val intent = Intent(this@MainActivity, NewsPaperDetails::class.java)
        intent.putExtra("key", "https://www.deccanchronicle.com/")

        startActivity(intent)
    }

    fun thehindu(view: View) {
        val intent = Intent(this@MainActivity, NewsPaperDetails::class.java)
        intent.putExtra("key", "https://www.thehindu.com/")

        startActivity(intent)
    }

}

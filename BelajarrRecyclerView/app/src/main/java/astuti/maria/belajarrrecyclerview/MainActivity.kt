package astuti.maria.belajarrrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users> ()
    val listUsers = arrayOf(
        "Alpha",
        "Bravo",
        "Charlie",
        "Delta",
        "Echo",
        "Foxtrot",
        "Golf",
        "Hotel",
        "India",
        "Juliet",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        belajarrrecyclerview.setHasFixedSize(true)
        belajarrrecyclerview.layoutManager = LinearLayoutManager(applicationContext: this)
        for (i in 0 until listUsers.size){
            list.add(Users(listUsers.get(i)))
            if (listUsers.size - 1 == i){

                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                belajarrrecyclerview.adapter = adapter
            }
        }

    }
}

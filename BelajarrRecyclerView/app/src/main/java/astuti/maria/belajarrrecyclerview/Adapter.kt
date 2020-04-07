package astuti.maria.belajarrrecyclerview

import android.view.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list.view.*
import java.text.FieldPosition

class Adapter {private val list:ArrayList<Users> : RecyclerView.Adapter<Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int){
        holder.view.lbList.text = list.get(position).name
    }
    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}

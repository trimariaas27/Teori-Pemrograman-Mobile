package maria.astuti.jatpacknavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fragment_dua.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentDua : Fragment() {

    lateinit var  nav: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_dua, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        buttonSubmit.setOnClickListener {
            if (editText.text.toString().isNotEmpty()){
                val input = editText.text.toString()
                val bundle = Bundle()
                bundle.putString("args", input)

                nav.navigate(R.id.action_fragmentDua_to_fragmentTiga, bundle)
            }
        }
    }
}

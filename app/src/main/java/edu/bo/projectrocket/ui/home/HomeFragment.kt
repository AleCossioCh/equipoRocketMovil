package edu.bo.projectrocket.ui.home

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.bo.projectrocket.ActivityHomeMenu
import edu.bo.projectrocket.R
import edu.bo.projectrocket.Section
import edu.bo.projectrocket.SectionListAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<SectionListAdapter.SectionListViewHolder>? = null
    private var mContext: Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        /*
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        */

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val lista = arrayListOf<Section>()
        lista.add(Section("Educacion Vial", "100%",R.drawable.ic_walking_foreground))
        lista.add(Section("Normas de circulacion", "80%",R.drawable.ic_strafic_foreground))
        lista.add(Section("Señalizacion y accidentes", "70%",R.drawable.ic_right_foreground))
        lista.add(Section("Legislacion boliviana", "60%",R.drawable.ic_leg_bol_foreground))
        lista.add(Section("Primeros auxilios", "80%",R.drawable.ic_security_foreground))
        lista.add(Section("Mecanica Basica", "90%",R.drawable.ic_herramientatuerca_foreground))

        val linearLayoutManager = LinearLayoutManager(activity)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recycleViewSection.apply {
            adapter = SectionListAdapter()
            layoutManager = linearLayoutManager


        }

    }




}




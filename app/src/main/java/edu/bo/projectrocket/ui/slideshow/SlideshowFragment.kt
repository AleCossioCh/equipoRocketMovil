package edu.bo.projectrocket.ui.slideshow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import edu.bo.projectrocket.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.fragment_slideshow.*

class SlideshowFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        /*val cameraPosition = CameraPosition.Builder()
            .target(ucb)
            .zoom(14F)
            .build()

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
*/
        val bolivia = LatLng(-17.369168, -66.151012)
        val indianapolis = LatLng(-17.391122, -66.159310)
        googleMap.addMarker(MarkerOptions().position(indianapolis).title("Autoescuela Indianapolis"))
        val autoMovilClub = LatLng(-17.393172, -66.174088)
        googleMap.addMarker(MarkerOptions().position(autoMovilClub).title("Automóvil Club Boliviano"))
        val viazul = LatLng(-17.420651, -66.131183)
        googleMap.addMarker(MarkerOptions().position(viazul).title("Autoescuela Viazul"))
        googleMap.addMarker(MarkerOptions().position(bolivia).title("Autoescuela Bolivia"))
        val segip1 = LatLng(-17.387836, -66.217796)
        googleMap.addMarker(MarkerOptions().position(segip1).title("Tramites - Segip Colcapirhua"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(indianapolis))
        val cameraPosition = CameraPosition.Builder()
            .target(indianapolis)
            .zoom(12F)
            .build()
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_slideshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}
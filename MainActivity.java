package com.example.location; 
importcom.google.android.gms.maps.CameraUpdate; 
importcom.google.android.gms.maps.CameraUpdateFactory; 
import com.google.android.gms.maps.GoogleMap; 
importcom.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener; 
import com.google.android.gms.maps.MapFragment;  
import com.google.android.gms.maps.model.LatLng; 
import android.location.Location; 
import android.os.Bundle; 
import android.annotation.SuppressLint; 
import android.app.Activity; 
import android.view.Menu; 
import android.widget.TextView; 
public class MainActivity extends Activity implements 
OnMyLocationChangeListener { 
GoogleMap gmap; 
@SuppressLint("NewApi") @Override 
protected void onCreate(Bundle savedInstanceState) 
{ 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
MapFragment 
mp=(MapFragment)getFragmentManager().findFragmentById(R.id.fragment1map); 
gmap=mp.getMap(); 
gmap.setMyLocationEnabled(true); 
gmap.setOnMyLocationChangeListener(this); 

}
@Override 
public void onMyLocationChange(Location arg0) 
{ 
TextView t=(TextView)findViewById(R.id.textView1); 
double lat=arg0.getLatitude(); 
double lag=arg0.getLongitude(); 
t.setText("LATITUDE:"+lat+"LONGITUDE:"+lag); 
gmap.addMarker(new MarkerOptions().position(new LatLng(lat, lag)).title("You Are Here 
!!!")); 
} 

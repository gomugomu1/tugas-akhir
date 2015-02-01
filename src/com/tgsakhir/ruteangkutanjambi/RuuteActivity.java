package com.tgsakhir.ruteangkutanjambi;

import java.util.ArrayList;
import java.util.HashMap;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class RuuteActivity extends Activity {
	// List view
		  private ListView lv;
		 
		  // Listview Adapter
		  ArrayAdapter<String> adapter;
		 
		  // Search EditText
		  EditText inputSearch;
		 
		  // ArrayList for Listview
		  ArrayList<HashMap<String, String>> TujuanList;
		 
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_ruute);
			 // Data Array yang akan ditampilkan di list
		    String tujuan[] = {"Jambi Town Square",
		    		"Masjid Agung AlFalah",
		    		"WTC Jambi",
		    		"STIKOM DB Jambi",
		              "Jambi Prima Mall",
		              "RSU Raden Mataher",
		              "GOR/GOS Kota Baru",
		              "Rumah Dinas Gubernur",
		              "RS Bratanata",
		              "RS Mayang Medical Center",
		              "Sekolah Attaufiq",
		              "MAN Model",
		              "SMAN 5",
		              "Bandara Sultan Thaha",
		              "Kebun Binatang Taman Rimba" };
		    // ambil list_view dan inputsearchnya di xml
		    lv = (ListView) findViewById(R.id.list_view1);
		    inputSearch = (EditText) findViewById(R.id.inputSearch);
		 
		    // proses menambahkan array kedalam listview
		    adapter = new ArrayAdapter<String>(this, R.layout.listitem,
		        R.id.rute_name, tujuan);
		    lv.setAdapter(adapter);
		   
		    lv.setOnItemClickListener(new OnItemClickListener() {
		        public void onItemClick(AdapterView<?> parent, View view,
		            int position, long id) {
		           String nama_tujuan=lv.getItemAtPosition(position).toString();
		          Intent intent= new Intent(getApplicationContext(),
		              DetailActivity.class);
		          intent.putExtra("nama_tujuan", nama_tujuan);
		         
		          startActivity(intent);
		             
		        }
		      });
		    
		    /**
		     * Kode dibawah ini dipakai untuk memfilter/pencarian realtime
		     * */
		    inputSearch.addTextChangedListener(new TextWatcher() {
		      @Override
		      public void onTextChanged(CharSequence cs, int arg1, int arg2,
		          int arg3) {
		       RuuteActivity.this.adapter.getFilter().filter(cs);
		      }
		      @Override
		      public void beforeTextChanged(CharSequence arg0, int arg1,
		          int arg2, int arg3) {
		      }
		      @Override
		      public void afterTextChanged(Editable arg0) {
		        // TODO Auto-generated method stub
		      }
		    });
		  }
			

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ruute, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

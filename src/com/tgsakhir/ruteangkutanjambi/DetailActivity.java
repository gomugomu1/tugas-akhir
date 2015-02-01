package com.tgsakhir.ruteangkutanjambi;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {
	String nama_tujuan;
	  TextView namaTujuan,infoTujuan;
	  ImageView gambar;
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		// xml layoutnya activity_detail
	    setContentView(R.layout.activity_detail);
	 
	    // ambil textview tujuan dan info_tujuan
	    namaTujuan=(TextView) findViewById(R.id.tujuan);
	    infoTujuan=(TextView) findViewById(R.id.info_tujuan);
	    
	    
	    
	 
	    // ambil parameter nama_tujuan dari intent
	    Intent intent = getIntent();
	    nama_tujuan = intent.getStringExtra("nama_tujuan");
	 
	    // tampilkan tujuan di TextView nama tujuan
	    namaTujuan.setText(nama_tujuan);
	   
	   	 
	    // panggil setInfo(String tujuan) dan tampilkan 
	    setInfo(nama_tujuan);
	     
	  }
	  /*
	   * fungsi setInfo dipakai untuk menambahkan
	   * keterangan rute sesuai dengan tujuan
	   
	   */
	  public void setInfo(String tujuan){
	    if(tujuan.equalsIgnoreCase("Jambi Town Square")){
	      infoTujuan.setText("RUTE :\n" +
	      		"Warna Angkot : Kuning 1B \n" +
	    		"● Terminal Rawasari \n" +
	      		"● Jln. M.H. Tamrin \n" +
	      		"● Jln. Sultan Agung (Murni) \n" +
	      		"● Jln. M. Yamin (Simp. Pulai) \n" +
	      		"● Jln. Hos Cokrominoto (Simp. Kawat) \n" +
	      		"● Jln. Kapten Bakaruddin\n" +
	      		"● Terminal Baru \n" +
	      		"● Jln. Lintas Sumatera \n" +
	      		"● Jln. Pattimura \n" +
	      		"● Jln. Kapten Bakaruddin");
	      
	    }else if(tujuan.equalsIgnoreCase("Masjid Agung AlFalah")){
	      infoTujuan.setText("RUTE :\n" +
	      		"Warna Angkot : Kuning 1B \n" +
	      		"● Terminal Baru \n● Jln. Lintas Sumatera \n● Jln. Pattimura \n" +
	      		"● Jln. Kapten Bakaruddin \n● Jln. Hos Cokroaminoto \n● Jln. M. Yamin \n" +
	      		"● Jln. Sultan Agung \n● Jln. Sultan Thaha" +
	      		"\n \n Warna Angkot : Kuning 1A \n" +
	      		"● Mayang \n● Tugu Juang \n● Jln. Hos Cokroaminoto \n● Jln. M. Yamin \n" +
	      		"● Jln. Sultan Agung \n● Jln. Sultan Thaha" +
	      		"\n \n Warna Angkot : Kuning 1A,1B dan Biru 3A,3B,3C \n" +
	      		"● Terminal Rawasari \n● Jln. MH. Thamrin \n● Jln. Sultan Agung \n \n \n");
	    
	    }else if(tujuan.equalsIgnoreCase("WTC Jambi")){
		      infoTujuan.setText("RUTE :\n" +
		      	"Warna Angkot : Kuning 1B \n" +
		      	"● Terminal Baru \n● Jln. Lintas Sumatera \n● Jln. Pattimura \n" +
	      		"● Jln. Kapten Bakaruddin \n● Jln. Hos Cokroaminoto \n● Jln. M. Yamin \n" +
	      		"● Jln. Sultan Agung \n● Jln. Sultan Thaha \n● Pasar Angso Duo \n" +
		      	"\n \n Warna Angkot : Kuning 1A" +
		      	"\n● Mayang \n● Tugu Juang \n● Jln. Hos Cokroaminoto \n● Jln. M. Yamin \n" +
	      		"● Jln. Sultan Agung \n● Jln. Sultan Thaha" +
	      		"\n \n Warna Angkot : Biru 3B" +
	      		"\n ● Jln. Arif Rahman Hakim (IAIN)\n● Simpang Karya \n● Jln. Arifin Manap \n● Jln. Yusuf Singkadane" +
	      		"\n● Jln. Selamet Riyadi \n● Jln. Sultan Thaha \n● Jln R. Mataher \n● Angso Duo \n" +
	      		"\n \n Warna Angkot : Biru 3C" +
	      		"\n● RSUD Jambi \n● Perkantoran DPRD \n● Simpang BI \n● Jln. Kol. Amir Hamzah" +
	      		"\n● Jln. Urip Sumoharjo \n● Jln. Slamet Riyadi \n● Jln. Sultan Thaha \n● Jln R. Mataher \n● Pasar Angso Duo");
	    }else if(tujuan.equalsIgnoreCase("STIKOM DB Jambi")){
		      infoTujuan.setText("RUTE :\n" +
		      	"Warna Angkot : Merah 5B \n" +
		      	"● Terminal Rawasari \n● Jln. Otto Iskandardinata \n● Jln. Panglima Polim \n● Jln. Jend. Sudirman" +
		      	"\n \n  Warna Angkot : Merah 5B" +
		      	"\n ● Beringin \n● Jln. Adam Malik \n● Jln. AR. Shaleh \n● Jln. Jend. Sudirman");
		      
	    
	    }else{
	      infoTujuan.setText("Belum Ada Data");
	    }
	  }

	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
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

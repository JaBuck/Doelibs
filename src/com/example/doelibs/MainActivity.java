	package com.example.doelibs;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

	private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.MyLoanablesList);
        
        Title[] lista = {
        		new Title("Alice", "Wonderland", "134534546"),
        		new Title("Alice2", "Wonderland", "356546662"),
        		new Title("Alice3", "Wonderland", "565645566"),
        } ;
        
        ArrayAdapter<Title> arrayAdapter = new ArrayAdapter<Title>(
                this, 
                android.R.layout.simple_expandable_list_item_1,
                lista );

        lv.setAdapter(arrayAdapter); 
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent details = new Intent(getApplicationContext(), Details.class);
		    	Title t = (Title)(lv.getItemAtPosition(arg2));
		    	details.putExtra("titleName", t.name);
				startActivity(details);
				
			}
        	
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
        
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_scan:
                //openSearch();
                return true;
            case R.id.action_settings:
               // openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    
    public void SearchDetails(View v){
    	Intent details = new Intent(this, Details.class);
    	startActivity(details);
    }
   

}

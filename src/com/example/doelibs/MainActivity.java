	package com.example.doelibs;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

	private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.MyLoanablesList);

        List<String> list = new ArrayList<String>();
        list.add("Alice");
        list.add("C-Sharp");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, 
                android.R.layout.simple_list_item_1,
                list );

        lv.setAdapter(arrayAdapter); 
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
   

}

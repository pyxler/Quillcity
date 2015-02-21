package com.example.peter.Activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.peter.myapplication.R;

import Fragment.BlankFragment;
import Fragment.QuillList;
import Fragment.Reader;
import Fragment.Serving;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Set up Serving Fragment*/

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        BlankFragment reader = new BlankFragment();
        fragmentTransaction.add(R.id.container_reader, reader);

        FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
        QuillList qlist = QuillList.getInstance();
        fragmentTransaction2.add(R.id.container_list, qlist);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

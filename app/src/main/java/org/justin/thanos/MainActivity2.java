package org.justin.thanos;

import android.app.Application;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.thanos.android.core.base.CoreBaseActivity;

import org.justin.thanos.api.BookSearchResponse;
import org.justin.thanos.api.DoubanApi;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;


public class MainActivity2 extends CoreBaseActivity {

    private static final String TAG = "MainActivity2";
    private DoubanApi  mApi  = null ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        doProcess();
    }

    private void doProcess(){
        Application app2 = this.getApplication();
        Application app = App.getInstance();
        if(app2!=null){
            Toast.makeText(this,"applicatin is not null !",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"applicatin is null !",Toast.LENGTH_SHORT).show();
        }
        // mApi = ReService.createApi(DoubanApi.class);

    }

    @Override
    protected void onResume() {
        super.onResume();

//      loadData();

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





    public void loadData(){

        Map<String, String> options = new HashMap<>();
        options.put("q", "小王子");
        options.put("tag", null);
        options.put("start", "0");
        options.put("count", "3");

        Call<BookSearchResponse> call = mApi.getSearchBooks(options);
    }
}

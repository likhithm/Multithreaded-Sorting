package likhith.example.likhith.multithreadsorting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);


        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.bt_sort);

        button2 = (Button) findViewById(R.id.bt_theory);
        // Capture button clicks
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if(arg0.getId()==R.id.bt_sort) {
                    Intent myIntent = new Intent(MainActivity.this,
                            SortActivity.class);
                    startActivity(myIntent);
                }

            }
        });

        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if(arg0.getId()==R.id.bt_theory) {
                    Intent myIntent = new Intent(MainActivity.this,
                            TheoryActivity.class);
                    startActivity(myIntent);
                }
            }
        });



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
            Intent myIntent = new Intent(MainActivity.this,
                    AboutUsActivity.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu_main) {
        getMenuInflater().inflate(R.menu_main.activity_main, menu_main);
        return true;
    }
    */
}


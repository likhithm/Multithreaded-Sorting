package likhith.example.likhith.multithreadsorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SortActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_sort);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.bt_merge);
        button2 = (Button) findViewById(R.id.bt_quick);
        button3 = (Button) findViewById(R.id.bt_heap);
        button4 = (Button) findViewById(R.id.bt_select);
        button5 = (Button) findViewById(R.id.bt_bubble);
        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.bt_merge) {
                    //Toast.makeText(getApplicationContext(),"Please Fill all 15 Array Elements ( up to A[14] )", Toast.LENGTH_LONG).show();

                    Intent myIntent = new Intent(SortActivity.this,
                            MergeActivity.class);
                    startActivity(myIntent);

                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.bt_quick) {
                    Toast.makeText(getApplicationContext(),"Coming Soon!!!", Toast.LENGTH_LONG).show();
                    /*Intent myIntent = new Intent(MainActivity.this,
                            TheoryActivity.class);
                    startActivity(myIntent);
                    */
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.bt_heap) {
                        Toast.makeText(getApplicationContext(),"Coming Soon!!!", Toast.LENGTH_LONG).show();

                    /*Intent myIntent = new Intent(MainActivity.this,
                            TheoryActivity.class);
                    startActivity(myIntent);*/
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.bt_select) {
                    Toast.makeText(getApplicationContext(),"Coming Soon!!!", Toast.LENGTH_LONG).show();

                    /*Intent myIntent = new Intent(MainActivity.this,
                            TheoryActivity.class);
                    startActivity(myIntent);
                    */
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.bt_bubble) {
                    Toast.makeText(getApplicationContext(),"Coming Soon!!!", Toast.LENGTH_LONG).show();

                    /*Intent myIntent = new Intent(MainActivity.this,
                            TheoryActivity.class);
                    startActivity(myIntent);*/
                }
            }
        });

    }
}

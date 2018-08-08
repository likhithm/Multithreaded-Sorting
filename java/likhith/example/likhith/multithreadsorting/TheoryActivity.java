package likhith.example.likhith.multithreadsorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TheoryActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_theory);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.bt_merge1);
        button2 = (Button) findViewById(R.id.bt_quick1);
        button3 = (Button) findViewById(R.id.bt_heap1);
        button4 = (Button) findViewById(R.id.bt_select1);
        button5 = (Button) findViewById(R.id.bt_bubble1);
        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.bt_merge1) {
                    //Toast.makeText(getApplicationContext(),"Coming Soon!!!", Toast.LENGTH_LONG).show();
                    Intent myIntent = new Intent(TheoryActivity.this,
                            MergeTheoryActivity.class);
                    startActivity(myIntent);


                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.bt_quick1) {
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
                if (arg0.getId() == R.id.bt_heap1) {
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
                if (arg0.getId() == R.id.bt_select1) {
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
                if (arg0.getId() == R.id.bt_bubble1) {
                    Toast.makeText(getApplicationContext(),"Coming Soon!!!", Toast.LENGTH_LONG).show();

                    /*Intent myIntent = new Intent(MainActivity.this,
                            TheoryActivity.class);
                    startActivity(myIntent);*/
                }
            }
        });

    }
}


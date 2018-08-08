package likhith.example.likhith.multithreadsorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MergeTheoryActivity extends AppCompatActivity {

    Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_merge_theory);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.bt_video);

        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                if(arg0.getId()==R.id.bt_video) {
                    Intent myIntent = new Intent(MergeTheoryActivity.this,
                            VideoActivity.class);
                    startActivity(myIntent);
                }

            }
        });
    }
}

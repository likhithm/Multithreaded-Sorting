package likhith.example.likhith.multithreadsorting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MergeResultActivity extends AppCompatActivity {


    private TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge_result);

        Bundle b = getIntent().getExtras();
        String message = b.getString("message");

        out = (TextView) findViewById(R.id.output);
        out.setText(message);
    }
}

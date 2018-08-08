package likhith.example.likhith.multithreadsorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.lang.Exception;
import java.lang.String;
import java.util.ArrayList;


public class MergeActivity extends AppCompatActivity {

    public int[] IntArray;//= new int[50];
   // private int flag =0;
    public int[] BackupArray;
    public int[] LeftArr;
    public int[] RightArr;

    public ArrayList<Integer> merge_array = new ArrayList<Integer>();
  //  private String[] mes;
    private String array = new String();
    private String[] arr;
    private String mes=new String();

    Button b1,b2;

    private EditText stringUI;
   // private EditText[] e = new EditText[15];
    /*
    private EditText i2;
    private EditText i3;
    private EditText i4;
    private EditText i5;
    private EditText i6;
    private EditText i7;
    private EditText i8;
    private EditText i9;
    private EditText i10,i11,i12,i13,i14,i15;
    */
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge);

       // final TextView t1=(TextView)findViewById(R.id.input1);

        /*e[0] = (EditText) findViewById(R.id.input1);
        e[1] = (EditText) findViewById(R.id.input2);
        e[2] = (EditText) findViewById(R.id.input3);

        */



        b1 = (Button) findViewById(R.id.calculate);
        b2 = (Button) findViewById(R.id.random);

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                //display.setText("");
                // Start NewActivity.class
                if (arg0.getId() == R.id.random) {
                    //flag=1;
                    Random rand = new Random();

                    int s=rand.nextInt(20) +3 ;
                    int i;
                    IntArray = new int[s];
                    for (i = 0; i<s; i++) {
                        IntArray[i] = rand.nextInt(100) + 7;
                        //mes[i]= String.valueOf(IntArray[i]);
                    }

                    StringBuilder c= new StringBuilder();
                    //c.append("    ");
                    for( int j:IntArray){
                        c.append(j);
                        c.append(" ");
                    }
                   mes = c.toString();

                    display = (TextView) findViewById(R.id.randomstring);
                    display.setText(mes);

                    BackupArray=IntArray;
                    long startTime = System.currentTimeMillis();
                    makeCalculations();//bt_calculate->calculate
                    long stopTime = System.currentTimeMillis();
                    long elapsedTime = stopTime - startTime;

                    StringBuilder b= new StringBuilder();
                    b.append("\nOriginal List:    { ");
                    for(int j:BackupArray){
                        b.append(j);
                        b.append(" , ");
                    }
                    b.append("}");
                    b.append("\n\n\nThread 1 SortedList:    { ");
                    for(int k:LeftArr){
                        b.append(k);
                        b.append(" , ");
                    }
                    b.append("}");
                    b.append("\n\n\nThread 2 SortedList:    { ");
                    for(int l:RightArr){
                        b.append(l);
                        b.append(" , ");
                    }
                    b.append("}");
                    b.append("\n\n\nFinal Sorted List:    { ");
                    for(int z:IntArray){
                        b.append(z);
                        b.append(" , ");
                    }
                    b.append("}");
                    b.append("\n\n\nTime Taken: ");
                    //(float)elapsedTime = elapsedTime/1000;
                    b.append((float)elapsedTime/1000);
                    b.append(" seconds");
                    String message = b.toString();
                    //IntArray=null;
                    Intent myIntent = new Intent(MergeActivity.this,
                            MergeResultActivity.class);
                    myIntent.putExtra("message",message);
                    startActivity(myIntent);

                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                if (arg0.getId() == R.id.calculate) {


                      //if(flag==0) {
                         stringUI = (EditText) findViewById(R.id.UIstring);

                          array = String.valueOf(stringUI.getText().toString());

                          arr = array.split(" ");

                          IntArray = new int[arr.length];
                          if(arr.length<=1)
                          {

                              Toast.makeText(getApplicationContext(),"Array must have at least 2 elements ", Toast.LENGTH_LONG).show();
                              return;
                          }
                          for (int i = 0; i < arr.length; i++) {
                              IntArray[i] = Integer.valueOf(arr[i]);
                          }
                    //  }
                    /*
                    for (int i = 0; i<15; i++) {
                        IntArray[i] = Integer.valueOf(e[i].getText().toString());
                    }
                    */

                    /*IntArray[0] = Integer.valueOf(e[0].getText().toString());

                    */


                    BackupArray=IntArray;
                    long startTime = System.currentTimeMillis();
                    makeCalculations();//bt_calculate->calculate
                    long stopTime = System.currentTimeMillis();
                    long elapsedTime = stopTime - startTime;

                    StringBuilder b= new StringBuilder();
                    b.append("\nOriginal List:    { ");
                    for(int j:BackupArray){
                        b.append(j);
                        b.append(" , ");
                    }
                    b.append("}");

                    b.append("\n\n\nThread 1 SortedList:    { ");
                    for(int k:LeftArr){
                        b.append(k);
                        b.append(" , ");
                    }
                    b.append("}");
                    b.append("\n\n\nThread 2 SortedList:    { ");
                    for(int l:RightArr){
                        b.append(l);
                        b.append(" , ");
                    }
                    b.append("}");
                    b.append("\n\n\nFinal Sorted List:    { ");
                    for(int i:IntArray){
                        b.append(i);
                        b.append(" , ");
                    }
                    b.append("}");
                    b.append("\n\n\nTime Taken: ");
                    //(float)elapsedTime = elapsedTime/1000;
                    b.append((float)elapsedTime/1000);
                    b.append(" seconds");
                    String message = b.toString();
                    //IntArray=null;
                    Intent myIntent = new Intent(MergeActivity.this,
                            MergeResultActivity.class);
                    myIntent.putExtra("message",message);
                    startActivity(myIntent);

                }

            }
        });


    }

    private void makeCalculations() {

        /*IntArray[0] = Integer.valueOf(i1.getText().toString());

        IntArray[14] = Integer.valueOf(i15.getText().toString());
        */

       /* Random rand = new Random();

        int s=15;
        int i;
        for (i = 0; i < s - 1; i++) {
            IntArray[i] = rand.nextInt(100) + 7;
        }
        */

            //long startTime = System.currentTimeMillis();
            int[] subArr1 = new int[IntArray.length / 2];
            int[] subArr2 = new int[IntArray.length - IntArray.length / 2];
            System.arraycopy(IntArray, 0, subArr1, 0, IntArray.length / 2);
            System.arraycopy(IntArray, IntArray.length / 2, subArr2, 0, IntArray.length - IntArray.length / 2);


            Sorter runner1 = new Sorter(subArr1);
            Sorter runner2 = new Sorter(subArr2);
            try {
                runner1.start();
                runner2.start();
                runner1.join();
                runner2.join();
            }

            catch(Exception e){

                e.printStackTrace();
            }
            finalMerge(runner1.getInternal(), runner2.getInternal());  //final merge call


        }
    public void finalMerge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int r = 0;
        LeftArr = a;
        RightArr=b;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[r] = a[i];
                i++;
                r++;
            } else {
                result[r] = b[j];
                j++;
                r++;
            }

            if (i == a.length) {

                while (j < b.length) {
                    result[r] = b[j];
                    r++;
                    j++;
                }
            }

            if (j == b.length) {
                while (i < a.length) {
                    result[r] = a[i];
                    r++;
                    i++;
                }
            }
        }
        IntArray=result;

    }

}

package gr.antoniom.chronometer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */


    ToggleButton tglbutton;
    Chronometer mChronometer;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

         tglbutton= (ToggleButton) findViewById(R.id.togglechronomoter);
         mChronometer = (Chronometer) findViewById(R.id.chronometer);



        tglbutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                boolean on = ((ToggleButton) v).isChecked();

                if (on) {
                    mChronometer.start();

                } else {
                    mChronometer.stop();
                }
            }
        }); //end tglbuton setonclicklistener

    } //end- oncreate method




} //end-main activity

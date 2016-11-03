package com.vanderveldt.rens.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.shoes:
                if (checked)
                    findViewById(R.id.shoesimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.shoesimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.eyes:
                if (checked)
                    findViewById(R.id.eyesimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.eyesimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.mouth:
                if (checked)
                    findViewById(R.id.mouthimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.mouthimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrows:
                if (checked)
                    findViewById(R.id.eyebrowsimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.eyebrowsimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.glasses:
                if (checked)
                    findViewById(R.id.glassesimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.glassesimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.hat:
                if (checked)
                    findViewById(R.id.hatimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.hatimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.nose:
                if (checked)
                    findViewById(R.id.noseimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.noseimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.ears:
                if (checked)
                    findViewById(R.id.earsimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.earsimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.moustache:
                if (checked)
                    findViewById(R.id.moustacheimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.moustacheimg).setVisibility(View.INVISIBLE);
                break;
            case R.id.arms:
                if (checked)
                    findViewById(R.id.armsimg).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.armsimg).setVisibility(View.INVISIBLE);
                break;
        }
    }
}

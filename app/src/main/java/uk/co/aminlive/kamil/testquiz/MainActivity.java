package uk.co.aminlive.kamil.testquiz;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import static uk.co.aminlive.kamil.testquiz.Global.check1;
import static uk.co.aminlive.kamil.testquiz.Global.check2;
import static uk.co.aminlive.kamil.testquiz.Global.check3;
import static uk.co.aminlive.kamil.testquiz.Global.check4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void quiz(View v) {
        CheckBox Check1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox Check2 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox Check3 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox Check4 = (CheckBox) findViewById(R.id.checkBox3);


        if(Check1.isChecked()){
            check1 = check1 + 10;
        }
        else if (Check2.isChecked()){
            check2 = check2 + 0;
        } else if(Check3.isChecked()){
            check3 = check3 + 0;
        } else if(Check4.isChecked()){
            check4 = check4 + 0;
        }
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}

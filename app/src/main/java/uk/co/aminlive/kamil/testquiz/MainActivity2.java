package uk.co.aminlive.kamil.testquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void score (View v){
        Toast.makeText(MainActivity2.this, "Score is " + Global.check1, Toast.LENGTH_LONG).show();

    }
}

package by.epam.homeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Toast toast = Toast.makeText(getApplicationContext(),
            "Пора покормить кота!", Toast.LENGTH_SHORT);
    Toast toast2 = Toast.makeText(getApplicationContext(),
            "Пора покормить собаку!", Toast.LENGTH_SHORT);
}

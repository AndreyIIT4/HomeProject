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
<<<<<<< .merge_file_a02880
            "Пора покормить кота!", Toast.LENGTH_SHORT);

=======
            "Всем привет!!!", Toast.LENGTH_SHORT);
>>>>>>> .merge_file_a07320
}

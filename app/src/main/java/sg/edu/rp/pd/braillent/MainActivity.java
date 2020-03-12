package sg.edu.rp.pd.braillent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnDictionary;
    private ImageButton btnQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDictionary = findViewById(R.id.ImageButtonDictionary);
        btnQuiz = findViewById(R.id.imageButtonQuiz);

        btnDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DictionaryAlphabet.class);
                startActivity(intent);
            }
        });

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Quiz.class);
                startActivity(intent);
            }
        });
    }
}

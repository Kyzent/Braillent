package sg.edu.rp.pd.braillent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class DictionaryPunctuation extends AppCompatActivity {
    private Spinner spnDictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_punctuation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spnDictionary = findViewById(R.id.spinner);
        spnDictionary.setSelection(2);

        spnDictionary.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(DictionaryPunctuation.this, DictionaryAlphabet.class);
                        startActivity(intent1);
                        overridePendingTransition(0, 0);

                        break;
                    case 1:

                        Intent intent2 = new Intent(DictionaryPunctuation.this, DictionaryNumber.class);
                        startActivity(intent2);
                        overridePendingTransition(0, 0);

                        break;
                    case 2:

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

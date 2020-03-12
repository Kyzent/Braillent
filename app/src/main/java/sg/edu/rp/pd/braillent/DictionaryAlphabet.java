package sg.edu.rp.pd.braillent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class DictionaryAlphabet extends AppCompatActivity {
    private Spinner spnDictionary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_alphabet);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spnDictionary = findViewById(R.id.spinner);

        spnDictionary.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:


                        break;
                    case 1:

                        Intent intent2 = new Intent(DictionaryAlphabet.this, DictionaryNumber.class);
                        startActivity(intent2);
                        overridePendingTransition(0, 0);

                        break;
                    case 2:

                        Intent intent3 = new Intent(DictionaryAlphabet.this, DictionaryPunctuation.class);
                        startActivity(intent3);
                        overridePendingTransition(0, 0);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

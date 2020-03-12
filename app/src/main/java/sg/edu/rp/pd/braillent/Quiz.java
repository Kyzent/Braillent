package sg.edu.rp.pd.braillent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    private QuestionsLibrary Questions = new QuestionsLibrary();

    private TextView tvHighScore;
    private TextView tvCurrentScore;
    private TextView tvCategory;
    private Button btnChoice1;
    private Button btnChoice2;
    private Button btnChoice3;
    private Button btnChoice4;
    private ImageView ivQuiz;

    private String mAnswer;
    private int currentScore;
    private int highScore;
    private int questionLength = Questions.getQuestionLength();

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        random = new Random();

        tvCurrentScore = findViewById(R.id.textViewCurrentScore);
        tvHighScore = findViewById(R.id.textViewHighScore);
        ivQuiz = findViewById(R.id.imageViewQuiz);
        tvCategory = findViewById(R.id.textViewCategory);
        btnChoice1 = findViewById(R.id.buttonChoice1);
        btnChoice2 = findViewById(R.id.buttonChoice2);
        btnChoice3 = findViewById(R.id.buttonChoice3);
        btnChoice4 = findViewById(R.id.buttonChoice4);

        NextQuestion(random.nextInt(questionLength));
        tvCurrentScore.setText(getString(R.string.currentScore) + currentScore);
        tvHighScore.setText(getString(R.string.highScore) + highScore);

        btnChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (btnChoice1.getText().equals(mAnswer)){
                    currentScore = currentScore + 1;
                    if (highScore < currentScore) {
                        highScore = currentScore;
                    }
                    updateScore(currentScore);
                    NextQuestion(random.nextInt(questionLength));
                    showToast();

                }else {
                    GameOver();
                }
            }
        });

        btnChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (btnChoice2.getText().equals(mAnswer)){
                    currentScore = currentScore + 1;
                    if (highScore < currentScore) {
                        highScore = currentScore;
                    }
                    updateScore(currentScore);
                    NextQuestion(random.nextInt(questionLength));
                    showToast();

                }else {
                    GameOver();
                }
            }
        });

        btnChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (btnChoice3.getText().equals(mAnswer)){
                    currentScore = currentScore + 1;
                    if (highScore < currentScore) {
                        highScore = currentScore;
                    }
                    updateScore(currentScore);
                    NextQuestion(random.nextInt(questionLength));
                    showToast();

                }else {
                    GameOver();
                }
            }
        });

        btnChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (btnChoice4.getText().equals(mAnswer)){
                    currentScore = currentScore + 1;
                    if (highScore < currentScore) {
                        highScore = currentScore;
                    }
                    updateScore(currentScore);
                    NextQuestion(random.nextInt(questionLength));
                    showToast();

                }else {
                    GameOver();
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        int savedScore = prefs.getInt("highScore", 0);

        if (savedScore > highScore) {
            highScore = savedScore;
            tvHighScore.setText(getString(R.string.highScore) + highScore);
        }

    }

    private void GameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Quiz.this);
        alertDialogBuilder
                .setMessage("Game Over!\n\nCurrent Score: " + currentScore + "\nHigh Score: " + highScore)
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), Quiz.class));
                        overridePendingTransition(0, 0);
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                    }
                });
        alertDialogBuilder.show();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor prefEdit = prefs.edit();
        prefEdit.putInt("highScore", highScore);
        prefEdit.commit();

    }

    private void showToast() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView toastText = layout.findViewById(R.id.toast_correct_text);
        ImageView toastImage = layout.findViewById(R.id.toast_correct_image);

        toastText.setText(getString(R.string.correct));
        toastImage.setImageResource(R.drawable.ic_toast_check);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 20);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }

    private void updateScore(int points) {
        tvHighScore.setText(getString(R.string.highScore) + highScore);
        tvCurrentScore.setText(getString(R.string.currentScore) + currentScore);
    }

    private void NextQuestion(int num){
        tvCategory.setText(Questions.getQuestion(num));
        ivQuiz.setImageResource(getResources().getIdentifier(Questions.getImage(num), "drawable", getPackageName()));
        btnChoice1.setText(Questions.getChoice1(num));
        btnChoice2.setText(Questions.getChoice2(num));
        btnChoice3.setText(Questions.getChoice3(num));
        btnChoice4.setText(Questions.getChoice4(num));

        mAnswer = Questions.getCorrectAnswer(num);
    }

}
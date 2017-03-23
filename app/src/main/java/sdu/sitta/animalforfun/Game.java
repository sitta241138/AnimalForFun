package sdu.sitta.animalforfun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    MediaPlayer animalMediaPlayer;
    ImageButton volumnImageButton;
    int questionCount = 1;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String anser;
    ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        questionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumnImageButton = (ImageButton) findViewById(R.id.image_volume);

        for(int i=1;i<=questionCount;i++){
            qID.add(i);
            Collections.shuffle(qID);
            setQuestion(qID.remove(0));
        }
    }// main method

    private void setQuestion(Integer qID) {
        if(qID==1){
            anser = " นก ";
            questionImageView.setImageResource(R.drawable.bird_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.bird);


            ChoiceNameAnimal.add("ยุง");
            ChoiceNameAnimal.add("หมู");
            ChoiceNameAnimal.add("หมา");
            ChoiceNameAnimal.add("นก");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
    }// แสดงผลคำถามบนหน้า xml
    public void playsound(){
        animalMediaPlayer.start();
    }

}// class

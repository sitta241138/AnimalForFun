package sdu.sitta.animalforfun;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;

public class Game extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    MediaPlayer animalMediaPlayer;
    ImageButton volumnImageButton;
    int questionCount = 10;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String anser;
    int score = 0;



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
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));
    }// main method

    private void setQuestion(Integer qID) {
        if(qID==1){
            anser = "นก";
            questionImageView.setImageResource(R.drawable.bird_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.bird);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
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
        else if(qID==2){
            anser = " ยุง ";
            questionImageView.setImageResource(R.drawable.mosquito_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.mosquito);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("ยุง");
            ChoiceNameAnimal.add("แกะ");
            ChoiceNameAnimal.add("นก");
            ChoiceNameAnimal.add("หมู");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==3){
            anser = "แมว";
            questionImageView.setImageResource(R.drawable.cat_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.cat);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("ม้า");
            ChoiceNameAnimal.add("แกะ");
            ChoiceNameAnimal.add("หมู");
            ChoiceNameAnimal.add("แมว");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==4){
            anser = "วัว";
            questionImageView.setImageResource(R.drawable.cow_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.cow);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("ยุง");
            ChoiceNameAnimal.add("วัว");
            ChoiceNameAnimal.add("หมา");
            ChoiceNameAnimal.add("สิงโต");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==5){
            anser = "หมา";
            questionImageView.setImageResource(R.drawable.dog_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.dog);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("สิงโต");
            ChoiceNameAnimal.add("แมว");
            ChoiceNameAnimal.add("หมา");
            ChoiceNameAnimal.add("นก");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==6){
            anser = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.elephant);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("ช้าง");
            ChoiceNameAnimal.add("ม้า");
            ChoiceNameAnimal.add("แกะ");
            ChoiceNameAnimal.add("หมู");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==7){
            anser = "ม้า";
            questionImageView.setImageResource(R.drawable.horse_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.horse);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("ยุง");
            ChoiceNameAnimal.add("วัว");
            ChoiceNameAnimal.add("ม้า");
            ChoiceNameAnimal.add("ช้าง");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==8){
            anser = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.lion);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("สิงโต");
            ChoiceNameAnimal.add("แกะ");
            ChoiceNameAnimal.add("นก");
            ChoiceNameAnimal.add("หมา");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==9){
            anser = "หมู";
            questionImageView.setImageResource(R.drawable.pig_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.pig);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("หมา");
            ChoiceNameAnimal.add("ม้า");
            ChoiceNameAnimal.add("วัว");
            ChoiceNameAnimal.add("หมู");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
        else if(qID==10){
            anser = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep_02);
            animalMediaPlayer = MediaPlayer.create(this,R.raw.sheep);
            ArrayList<String> ChoiceNameAnimal = new ArrayList<String>();
            ChoiceNameAnimal.add("ม้า");
            ChoiceNameAnimal.add("แกะ");
            ChoiceNameAnimal.add("สิงโต");
            ChoiceNameAnimal.add("แมว");
            Collections.shuffle(ChoiceNameAnimal);
            btn1.setText(ChoiceNameAnimal.remove(0));
            btn2.setText(ChoiceNameAnimal.remove(0));
            btn3.setText(ChoiceNameAnimal.remove(0));
            btn4.setText(ChoiceNameAnimal.remove(0));
        }
    }// แสดงผลคำถามบนหน้า xml

   public void playsound(View view){
        animalMediaPlayer.start();
    }

    public void choiceAns(View view){
        Button button = (Button) view;
        String buttonString = button.getText().toString(); // เก็บข้อความบนปุ่มลงใน staring

        if(buttonString.equals(anser)){
            score++;
        }

        if(qID.isEmpty()){
            dialogBoxScore(); // แสดงผล รวมคะแนน
        }
        else {
            setQuestion(qID.remove(0)); // ดึงข้อถัดไปออกมาทำงาน
        }
    }

    public void dialogBoxScore(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้คะแนนเท่านี้แหละ "+score+" คะแนน")
                .setCancelable(false)
                .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("เล่นอีกครั้ง กดตรงนี้ๆๆ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

}// class

package sdu.sitta.animalforfun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    MediaPlayer soundCome;
    int soundID;
    String nameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button buttonPlay = (Button) findViewById(R.id.btnGoplay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.Input);

                if(editText.length()==0){ // edittext == 0 หรือ ค่าว่าง
                    Toast.makeText(MainActivity.this,"กรณาใส่ชื่อก่อนเด้อครับ",Toast.LENGTH_LONG).show();
                }

                else {
                    nameEdit = editText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, Game.class);
                    Toast.makeText(MainActivity.this, "Hello "+nameEdit, Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            }
        });



    }




}

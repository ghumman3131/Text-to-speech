package com.inception.texttospeech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // global object of TextToSpeech class
    TextToSpeech tto_s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating OnOnitListener interface
        TextToSpeech.OnInitListener listener = new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status)
            {

            }
        };

        // creating object of TextToSpeech
         tto_s = new TextToSpeech(MainActivity.this , listener);
    }

    public void bol_do(View view) {


        
        EditText text_et = findViewById(R.id.input_text);

        String txt = text_et.getText().toString();

        tto_s.speak(txt , TextToSpeech.QUEUE_FLUSH , null);


    }
}

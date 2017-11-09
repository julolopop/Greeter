package com.example.usuario.greeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GreeterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeter);

        Button greetButton = (Button)findViewById(R.id.greetButton);

        greetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText greetEditText =
                        (EditText) findViewById(R.id.greetEditText);

                String name = greetEditText.getText().toString();
                String greeting = String.format("Hello, %s!", name);

                TextView messageTextView =
                        (TextView) findViewById(R.id.messageTextView);

                messageTextView.setText(greeting);
            }
        });

    }
}

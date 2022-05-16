package br.valtair.consumocombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResponseActivity extends AppCompatActivity {
    private TextView tvResult;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        tvResult = findViewById(R.id.textView5);
        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResponseActivity.this.finish();
            }
        });

        Intent objIntent = getIntent();
        tvResult.setText(objIntent.getStringExtra("result"));
    }


}
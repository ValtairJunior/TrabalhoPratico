package br.valtair.consumocombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtnum1;
    private EditText txtnum2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = findViewById(R.id.editNum1);
        txtnum2 = findViewById(R.id.editNum2);
        tvResult = findViewById(R.id.resultView);
    }

    public void Calcular(View view) {
        double valor_1 = Double.parseDouble(txtnum1.getText().toString());
        double valor_2 = Double.parseDouble(txtnum2.getText().toString());
        double aux = valor_2 / valor_1;

        if (aux > 0.7) {
            tvResult.setText("Abasteça com gasolina!");
        } else {
            tvResult.setText("Abasteça com álcool!");
        }
    }
}
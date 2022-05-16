package br.valtair.consumocombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declaração das variáveis par ligar os elementos das telas.
    private EditText txtnum1;
    private EditText txtnum2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // liga as variáveis aos componentes das telas, observar os ids
        txtnum1 = findViewById(R.id.editNum1);
        txtnum2 = findViewById(R.id.editNum2);
        button = findViewById(R.id.button);

        // cria o evento de click do botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular(view);
            }
        });
    }

    //função de click do botão
    public void Calcular(View view) {
        // variáveis de controle para manipular os valores das telas
        double valor_1 = Double.parseDouble(txtnum1.getText().toString());
        double valor_2 = Double.parseDouble(txtnum2.getText().toString());
        double aux = valor_2/valor_1;

        Intent nextWindow = new Intent(this, ResponseActivity.class);

        if(aux > 0.7) {
//            tvResult.setText("Abasteça com GASOLINA!");
            nextWindow.putExtra("result", "Abasteça com GASOLINA!");

        } else {
//            tvResult.setText("Abasteça com Álcool!");
            nextWindow.putExtra("result", "Abasteça com Álcool!");
        }

        startActivity(nextWindow);
    }
}
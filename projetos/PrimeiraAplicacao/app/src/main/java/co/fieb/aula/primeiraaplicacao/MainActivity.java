package co.fieb.aula.primeiraaplicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtPrimeiroNome;
    button btnApresentar;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrimeiroNome=findViewById(R.id.edtPrimeiroNome);
        btnApresentar=findViewById(R.id.btnApresentar);
        tvResult=findViewById(R.id.tvResult);
        btnApresentar.setonClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvResult.setText(edtPrimeiroNome.getText());
            }
        });
    }
}
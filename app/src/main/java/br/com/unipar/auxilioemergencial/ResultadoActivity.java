package br.com.unipar.auxilioemergencial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ResultadoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        segundaAtividade();
    }

    public void segundaAtividade(){

        Bundle b = getIntent().getExtras();
        // String dataPagamento = b.getString("dataPagamento");
        Double saldoReceber = b.getDouble("saldoReceber");


        //TextView textElementdatapagamento = (TextView) findViewById(R.id.dataPagamento);
        //textElementdatapagamento.setText("Data do Pagamento : \n"+dataPagamento.toString());

        TextView textElementsaldoreceber = (TextView) findViewById(R.id.saldoReceber);
        textElementsaldoreceber.setText("Saldo a Receber : \n"+"R$:"+ saldoReceber.toString());
    }

    public void voltar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        Bundle b = new Bundle();
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    public void sair(View view){
        finish();
    }
}

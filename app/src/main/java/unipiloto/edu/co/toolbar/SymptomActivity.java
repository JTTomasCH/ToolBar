package unipiloto.edu.co.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SymptomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom);

        Button sendButton = findViewById(R.id.btn_send);
        sendButton.setOnClickListener(v -> {
            String reporte = "Síntomas: fiebre, decaimiento, vómito..."; // Aquí usas los datos reales
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            sendIntent.setType("text/plain");
            sendIntent.putExtra(Intent.EXTRA_TEXT, reporte);
            startActivity(Intent.createChooser(sendIntent, "Compartir reporte de síntomas"));
        });
    }
}

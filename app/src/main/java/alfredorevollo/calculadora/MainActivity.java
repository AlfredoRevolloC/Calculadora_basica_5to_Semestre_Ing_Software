package alfredorevollo.calculadora; // Manten tu paquete original aquí

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaración de los componentes o variables
    private EditText etNum1, etNum2;
    private Button btnSumar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculación de las vistas con Java (findViewById)
        etNum1 = findViewById(R.id.etNumero1);
        etNum2 = findViewById(R.id.etNumero2);
        btnSumar = findViewById(R.id.btnSumar);
        tvResultado = findViewById(R.id.tvResultado);

        // Implementación del Evento y Listener para el botón
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumarNumeros();
            }
        });
    }

    private void sumarNumeros() {
        String valor1 = etNum1.getText().toString();
        String valor2 = etNum2.getText().toString();

        // Validar que no estén vacíos
        if(valor1.isEmpty() || valor2.isEmpty()){
            Toast.makeText(this, "Por favor ingresa ambos números", Toast.LENGTH_SHORT).show();
        } else {
            // Conversión de texto a número y operación matemática
            double n1 = Double.parseDouble(valor1);
            double n2 = Double.parseDouble(valor2);
            double suma = n1 + n2;

            // Mostrar resultado manipulando el texto de la etiqueta
            tvResultado.setText("Resultado: " + suma);
        }
    }
}

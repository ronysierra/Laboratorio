package com.example.laboratoriopersonal
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var textViewWelcome: TextView
    private lateinit var editTextName: EditText
    private lateinit var editTextId: EditText
    private lateinit var buttonLogin: Button
    private lateinit var imageViewArrow: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_sesion)

        // Vinculación de vistas
        textViewWelcome = findViewById(R.id.textViewWelcome)
        editTextName = findViewById(R.id.editTextName)
        editTextId = findViewById(R.id.editTextId)
        buttonLogin = findViewById(R.id.buttonLogin)
        imageViewArrow = findViewById(R.id.imageViewArrow)

        // Configuración del listener de clic para el botón de "Ingresar"
        buttonLogin.setOnClickListener {
            val name = editTextName.text.toString()
            val id = editTextId.text.toString()

            // Verificación de las credenciales (ejemplo básico)
            if (name.isNotEmpty() && id.isNotEmpty()) {
                // Aquí puedes agregar la lógica de autenticación
                // Por ejemplo, puedes realizar una solicitud al servidor para verificar las credenciales

                // Simulación de inicio de sesión exitoso
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()

                // Aquí puedes redirigir al usuario a la siguiente pantalla
            } else {
                Toast.makeText(this, "Por favor, ingresa tu nombre y tu identificación", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
package com.example.ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {


    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var mensaje: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //showBasicDialog(view = null)
        //variables
        var btnCalcular: Button =findViewById(R.id.btnCalcular)
        num1 = findViewById(R.id.txtNum1)
        num2 = findViewById(R.id.txtNum2)


        btnCalcular.setOnClickListener{
            calculoMayor()
            showBasicDialog(view = null)
        }

    }

    private fun calculoMayor() {
        var nume1: Double = num1.text.toString().toDouble()
        var nume2: Double = num2.text.toString().toDouble()

        if (nume1 > nume2){
            mensaje =  " El numero mayor es: " + nume1
        }else if(nume2 > nume1){
            mensaje = " El numero mayor es: " + nume2
        }else{
            mensaje = "Los numeros son iguales"
        }
        limpiar()

    }

    private fun showBasicDialog(view: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("La comparacion es:")
        builder.setMessage(mensaje)
        builder.show()
    }

    private fun limpiar(){
        num1.setText("")
        num2.setText("")
    }


}
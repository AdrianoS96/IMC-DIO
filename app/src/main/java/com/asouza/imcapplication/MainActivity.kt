package com.asouza.imcapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


/**
 * LEMBRAR SEMPRE DE ADICIONAR A LINHA:
 * id 'kotlin-android-extensions'
 * NO ARQUIVO build.gradle(Module...)
 */

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }



    private fun setListeners(){
        alturaEdt?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        pesoEdt?.doOnTextChanged{ text, _, _, _ ->
                tituloTxt?.text = text
        }
        calcularBtn.setOnClickListener {
            calcularIMC(pesoEdt.text.toString(), alturaEdt.text.toString())
        }

    }

    private fun calcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if(peso != null && altura != null){
            val imc = peso/(altura*altura)
            tituloTxt.text="Seu IMC é:\n ${imc}" //.format(imc) //falta formatar o numero para 2 casas decimais
        }

    }



}
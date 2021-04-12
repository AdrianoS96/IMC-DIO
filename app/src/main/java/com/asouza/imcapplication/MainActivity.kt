package com.asouza.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("LifeCycle", "CREATE - estou criando a tela")
        //finish()//destroi a aplicação (finaliza o ciclo da aplicação)
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "START - deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "RESUME - agora você pode interagir com  a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "STOP - a tela não está mais visivel, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "RESTART - a tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "DESTROY - oh não! a tela foi destruída")
    }

}
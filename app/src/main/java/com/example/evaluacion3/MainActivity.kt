package com.example.evaluacion3

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.evaluacion3.ui.theme.Evaluacion3Theme



enum class Pantalla{
    FORM,
    CAMARA
}


class AppVM: ViewModel(){
    // guardamos las variables de estado stkeholder
    var onPermisoCamaraOk:() -> Unit= {}
    val pantallaActual = mutableStateOf(Pantalla.FORM)
}
// se puede  poner mas de  un viemodel

class FormRegistroVM: ViewModel(){
    val nombre = mutableStateOf("")
    val foto = mutableStateOf<Uri?>(null)
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun AppUI(){}

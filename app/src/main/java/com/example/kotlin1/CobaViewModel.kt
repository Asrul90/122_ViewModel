package com.example.kotlin1

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.kotlin1.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel (){
    var namaUSR: String by mutableStateOf("") //revised
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var Alamatt: String by mutableStateOf("")
        private set
    var Email: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String,almt: String,mail: String, jk: String) {
        namaUSR=nm;
        noTlp=tlp;
        Alamatt=almt;
        Email=mail;
        jenisKl=jk;

    }
    fun setJenisK(pilihJK:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK)
            }
        }

    fun setStatusNikah(pilihStatus:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihStatus)
        }
    }
}
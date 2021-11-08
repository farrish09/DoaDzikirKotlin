package com.farrish.doadzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var llQauliyahShalatActivity: LinearLayout
    private lateinit var llSetiapSaatDzikirActivity: LinearLayout
    private lateinit var llHarianDzikirDoaActivity: LinearLayout
    private lateinit var llPagiPetangDzikirActivity: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llQauliyahShalatActivity = findViewById(R.id.ll_Qauliyah_shalat)
        llSetiapSaatDzikirActivity = findViewById(R.id.ll_Dzikir_setiap_saat)
        llHarianDzikirDoaActivity = findViewById(R.id.ll_Dzikir_doa_dan_harian)
        llPagiPetangDzikirActivity = findViewById(R.id.ll_Dzikir_pagi_dan_petang)

        llQauliyahShalatActivity.setOnClickListener(this)
        llHarianDzikirDoaActivity.setOnClickListener(this)
        llSetiapSaatDzikirActivity.setOnClickListener(this)
        llPagiPetangDzikirActivity.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.ll_Qauliyah_shalat){
            startActivity(Intent(this, QouliyahShalatActivity :: class.java))
        } else if (view?.id == R.id.ll_Dzikir_setiap_saat){
            startActivity(Intent(this, SetiapSaatDzikirActivity :: class.java))
        } else if (view?.id == R.id.ll_Dzikir_doa_dan_harian){
            startActivity(Intent(this, HarianDzikirDoaActivity :: class.java))
        } else if (view?.id == R.id.ll_Dzikir_pagi_dan_petang){
            startActivity(Intent(this, PagiPetangDzikirActivity :: class.java))
        } else {

        }
    }
}


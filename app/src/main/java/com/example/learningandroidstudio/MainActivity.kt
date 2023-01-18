package com.example.learningandroidstudio

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val radioGroup = findViewById<RadioGroup>(R.id.radio_group)

        button.setOnClickListener {
            val checkedRadioButtonId = radioGroup.checkedRadioButtonId

            when (checkedRadioButtonId) {
                R.id.r_button_pop_art -> {
                    goNextPicture(1)
                }
                R.id.r_button_surrealism -> {
                    goNextPicture(2)
                }
                R.id.r_button_asian_girls -> {
                    goNextPicture(3)
                }
            }
        }
    }

    private fun goNextPicture(num: Int) {
        val popArtPictures = listOf(
            R.drawable.ic_pa_merlin_monro,
            R.drawable.ic_pa_disney_girl,
            R.drawable.ic_pa_buble_gum_girl
        )
        val surrealismPictures =
            listOf(
                R.drawable.ic_s_doubleganger,
                R.drawable.ic_s_kit,
                R.drawable.ic_s_time
            )
        val asianGirlsPictures = listOf(
            R.drawable.ic_asian_model_1,
            R.drawable.ic_asian_model_2,
            R.drawable.ic_asian_model_3
        )

        val image = findViewById<ImageView>(R.id.image)
        if (num == 1) {
            image.setImageResource(popArtPictures.random())
        }
        if (num == 2) {
            image.setImageResource(surrealismPictures.random())
        }
        if (num == 3) {
            image.setImageResource(asianGirlsPictures.random())
        }

    }
}
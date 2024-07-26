package com.kotlin.study1th

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 이미지가 클릭되었다는 것을 알려줌
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener{

            Toast.makeText(this, "1번 클릭됨 ㅎㅎ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.btsImage2)
        image2.setOnClickListener{

            Toast.makeText(this, "2번 클릭됨 ㅎㅎ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.btsImage3)
        image3.setOnClickListener{

            Toast.makeText(this, "3번 클릭됨 ㅎㅎ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.btsImage4)
        image4.setOnClickListener{

            Toast.makeText(this, "4번 클릭됨 ㅎㅎ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.btsImage5)
        image5.setOnClickListener{

            Toast.makeText(this, "5번 클릭됨 ㅎㅎ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.btsImage6)
        image6.setOnClickListener{

            Toast.makeText(this, "6번 클릭됨 ㅎㅎ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.btsImage7)
        image7.setOnClickListener{

            Toast.makeText(this, "7번 클릭됨 ㅎㅎ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }
    }


}
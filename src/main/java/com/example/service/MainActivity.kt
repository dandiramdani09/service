package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //button fb
        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/r.dandi09"))
            startActivity(i)
        })
        //button ig
        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://instagram.com/dandiramdani_"))
            startActivity(i)
        })
        //media player
        var MEdiaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.deadman)
        //button play
        btn_play.setOnClickListener {
            MEdiaPlayer?.start()
        }
        //button pause
        pause.setOnClickListener{
            MEdiaPlayer?.pause()
        }
        //button stop
        stop.setOnClickListener{
            MEdiaPlayer?.pause()
            MEdiaPlayer?.seekTo(0)
        }
    }
}

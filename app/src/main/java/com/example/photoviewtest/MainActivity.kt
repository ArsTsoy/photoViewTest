package com.example.photoviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoViewAttacher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var attacher: PhotoViewAttacher

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        attacher = PhotoViewAttacher(ivImage)

        Glide.with(baseContext)
            .load("https://media.giphy.com/media/13gvXfEVlxQjDO/giphy.gif")
            .into(ivImage)
        attacher.update()
    }
}

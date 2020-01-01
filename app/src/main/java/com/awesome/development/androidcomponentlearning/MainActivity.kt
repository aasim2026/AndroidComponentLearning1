package com.awesome.development.androidcomponentlearning

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.awesome.development.androidcomponentlearning.viewModels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel:MainActivityViewModel
//    var c1=0
//    var c2=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProviders.of(this).get<MainActivityViewModel>(MainActivityViewModel::class.java)
        tvScorePlayerA.text = mainViewModel.getInitialCountA().toString()
        tvScorePlayerB.text = mainViewModel.getInitialCountB().toString()
//        tvScorePlayerA.text = c1.toString()
//        tvScorePlayerB.text = c2.toString()



        btnPlayerA.setOnClickListener {
            tvScorePlayerA.text = mainViewModel.getCurrentCountA().toString()
//            tvScorePlayerA.text = (++c1).toString()
        }
        btnPlayerB.setOnClickListener {
            tvScorePlayerB.text = mainViewModel.getCurrentCountB().toString()
//            tvScorePlayerB.text = (++c2).toString()
        }

    }
}

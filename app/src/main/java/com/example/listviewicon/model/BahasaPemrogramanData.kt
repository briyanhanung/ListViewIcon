package com.example.listviewicon.model

import com.example.listviewicon.R

object BahasaPemrogramanData {
    private val bahasaName = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language",
        "Python is interpreted scripting and object-based scripting language",
        "Javascript is an object-based scripting language",
        "PHP is an interpreted language,i.e.,there is no need for compilation"
    )

    private val bahasaPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.js,
        R.drawable.php

    )

    val listBahasa: ArrayList<Bahasa>
        get() {
            val list = arrayListOf<Bahasa>()
            for (position in bahasaName.indices) {
                val bahasa = Bahasa()
                bahasa.name = bahasaName[position]
                bahasa.detail = detail[position]
                bahasa.poster = bahasaPoster[position]
                list.add(bahasa)
            }
            return list
        }
}
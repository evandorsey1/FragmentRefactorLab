package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class ActivityFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activity, container, false).apply{

                val nameEditText = findViewById<EditText>(R.id.nameEditText)
                val changeButton = findViewById<Button>(R.id.changeButton)
                val displayTextView = findViewById<TextView>(R.id.displayTextView)


                changeButton.setOnClickListener {

                    var name = nameEditText.text.toString()

                    displayTextView.text = if (name.isNotEmpty()) {
                        "Hello, $name!"
                    } else {
                        "Please enter your name"
                    }
                }


        }
    }
}
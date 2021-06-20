package com.finalassignment.asignmentlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.finalassignment.asignmentlayout.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

//    private lateinit var tvText : TextView
//    private lateinit var btn0 : Button
//    private lateinit var btn1 : Button
//    private lateinit var btn2 : Button
//    private lateinit var btn3 : Button
//    private lateinit var btn4 : Button
//    private lateinit var btn5 : Button
//    private lateinit var btn6 : Button
//    private lateinit var btn7 : Button
//    private lateinit var btn8 : Button
//    private lateinit var btn9 : Button
//    private lateinit var btnDot : Button
//    private lateinit var btnPlus : Button
//    private lateinit var btnMinus : Button
//    private lateinit var btnMultiply : Button
//    private lateinit var btnEquals : Button
//    private lateinit var btnDivide : Button

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        etResult = findViewById(R.id.etResult)
//        btn0 = findViewById(R.id.btn0)
//        btn1 = findViewById(R.id.btn1)
//        btn2 = findViewById(R.id.btn2)
//        btn3 = findViewById(R.id.btn3)
//        btn4 = findViewById(R.id.btn4)
//        btn5 = findViewById(R.id.btn5)
//        btn6 = findViewById(R.id.btn6)
//        btn7 = findViewById(R.id.btn7)
//        btn8 = findViewById(R.id.btn8)
//        btn9 = findViewById(R.id.btn9)
//        btnPlus = findViewById(R.id.btnPlus)
//        btnMinus = findViewById(R.id.btnMinus)
//        btnDivide = findViewById(R.id.btnDivide)
//        btnMultiply = findViewById(R.id.btnMultiply)
//        btnEquals = findViewById(R.id.btnEquals)
//

        binding.btnAC.setOnClickListener{
            binding.tvText.text = ""
            binding.tvResult.text = ""
        }

        binding.btn0.setOnClickListener{
            binding.tvText.append("0")
        }

        binding.btn1.setOnClickListener{
            binding.tvText.append("1")
        }

        binding.btn2.setOnClickListener{
            binding.tvText.append("2")
        }

        binding.btn3.setOnClickListener{
            binding.tvText.append("3")
        }

        binding.btn4.setOnClickListener{
            binding.tvText.append("4")
        }

        binding.btn5.setOnClickListener{
            binding.tvText.append("5")
        }

        binding.btn6.setOnClickListener{
            binding.tvText.append("6")
        }

        binding.btn7.setOnClickListener{
            binding.tvText.append("7")
        }

        binding.btn8.setOnClickListener{
            binding.tvText.append("8")
        }

        binding.btn9.setOnClickListener{
            binding.tvText.append("9")
        }

        binding.btnDot.setOnClickListener{
            binding.tvText.append(".")
        }

        binding.btnPlus.setOnClickListener{
            binding.tvText.append(" + ")
        }

        binding.btnMinus.setOnClickListener{
            binding.tvText.append(" - ")
        }

        binding.btnMultiply.setOnClickListener{
            binding.tvText.append(" * ")
        }

        binding.btnDivide.setOnClickListener{
            binding.tvText.append(" ÷ ")
        }

        binding.btnEquals.setOnClickListener{

            val expression = ExpressionBuilder(binding.tvText.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if (result == longResult.toDouble()) {

                binding.tvResult.text = longResult.toString()

            } else {

                binding.tvResult.text = result.toString()
            }

        }

    }


}
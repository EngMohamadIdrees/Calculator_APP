package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var preNumber: Double =0.0
    var currentOperation :Operation?=null
    lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallbacks()
    }
    private fun addCallbacks()
    {
        binding.mod.setOnClickListener {
            PrepareNumber(Operation.Mod)
        }

        binding.plusButton.setOnClickListener{
            PrepareNumber(Operation.Plus)
        }
        binding.minusButton.setOnClickListener{
            PrepareNumber(Operation.Minus)
        }
        binding.divButton.setOnClickListener{
            PrepareNumber(Operation.Div)
        }
        binding.multiButton.setOnClickListener{
            PrepareNumber(Operation.Mul)
        }
        binding.requalButton.setOnClickListener{
           val result= doCurrentOperation()
           binding.result.text=result.toString()
        }
        binding.numberC.setOnClickListener{
            clearNumbers()
        }

    }

    private fun doCurrentOperation() :Double{
        val secondNumber=binding.result.text.toString().toDouble()
       return  when(currentOperation)
        {
            Operation.Plus -> preNumber+secondNumber
            Operation.Minus -> preNumber-secondNumber
            Operation.Mul -> preNumber*secondNumber
            Operation.Div -> preNumber/secondNumber
           Operation.Mod->preNumber%secondNumber
            null -> 0.0
        }

    }

    fun clearNumbers()
    {
        binding.result.text=""
    }
    fun PrepareNumber(operation :Operation)
    {
        preNumber=binding.result.text.toString().toDouble()
        clearNumbers()
        currentOperation=operation
    }
    fun onClickNumber(v: View)
    {
        val newDigit = (v as Button).text.toString()
        val oldDigit = binding.result.text.toString()
        val newTextNumber= oldDigit+newDigit
        binding.result.text= newTextNumber
    }




}




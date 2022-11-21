//package com.example.calculator
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.TextView
//import com.example.calculator.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity() {
//        lateinit var buttonPlus:Button
//        lateinit var buttonMinus:Button
//        lateinit var buttonDiv:Button
//        lateinit var buttonMult:Button
//        lateinit var buttonEqual:Button
//        lateinit var textNumber:TextView
//        lateinit var buttonClear:Button
//        lateinit var buttonMod:Button
//        var lastNumber: Double =0.0
//        var currentOperation :Operation?=null
//
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
//        initView()
//        addCallbacks()
//        }
//private fun addCallbacks()
//        {
//        buttonMod.setOnClickListener {
//        PrepareNumber(Operation.Mod)
//        }
//        buttonPlus.setOnClickListener{
//        PrepareNumber(Operation.Plus)
//        }
//        buttonMinus.setOnClickListener{
//        PrepareNumber(Operation.Minus)
//        }
//        buttonDiv.setOnClickListener{
//        PrepareNumber(Operation.Div)
//        }
//        buttonMult.setOnClickListener{
//        PrepareNumber(Operation.Mul)
//        }
//        buttonEqual.setOnClickListener{
//        val result= doCurrentOperation()
//        textNumber.text=result.toString()
//        }
//        buttonClear.setOnClickListener{
//        clearNumbers()
//        }
//
//        }
//
//private fun doCurrentOperation() :Double{
//        val secondNumber=textNumber.text.toString().toDouble()
//        return  when(currentOperation)
//        {
//        Operation.Plus -> lastNumber+secondNumber
//        Operation.Minus -> lastNumber-secondNumber
//        Operation.Mul -> lastNumber*secondNumber
//        Operation.Div -> lastNumber/secondNumber
//        Operation.Mod->lastNumber%secondNumber
//        null -> 0.0
//        }
//
//        }
//
//private fun initView(){
//        buttonPlus=findViewById(R.id.plusButton)
//        buttonMinus=findViewById(R.id.minusButton)
//        buttonDiv=findViewById(R.id.divButton)
//        buttonMult=findViewById(R.id.multiButton)
//        buttonEqual=findViewById(R.id.requal_Button)
//        textNumber=findViewById(R.id.result)
//        buttonClear=findViewById(R.id.number_c)
//        buttonMod=findViewById(R.id.mod)
//        }
//        fun clearNumbers()
//        {
//        textNumber.text=""
//        }
//        fun PrepareNumber(operation :Operation)
//        {
//        lastNumber=textNumber.text.toString().toDouble()
//        clearNumbers()
//        currentOperation=operation
//        }
//        fun onClickNumber(v: View)
//        {
//        val newDigit = (v as Button).text.toString()
//        val oldDigit = textNumber.text.toString()
//        val newTextNumber= oldDigit+newDigit
//        textNumber.text= newTextNumber
//        }
//
//
//
//
//        }
//
//
//

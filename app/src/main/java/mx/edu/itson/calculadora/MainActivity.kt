package mx.edu.itson.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operacion1: TextView = findViewById(R.id.operacion1)
        val operacion2: TextView = findViewById(R.id.operacion2)

        val sum: Button = findViewById(R.id.bmas)
        val resta: Button = findViewById(R.id.bmenos)
        val multi: Button = findViewById(R.id.bmulti)
        val div: Button = findViewById(R.id.bdiv)
        val reset: Button = findViewById(R.id.reset)
        val resultado: Button = findViewById(R.id.resultado)

        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)
        val b5: Button = findViewById(R.id.b5)
        val b6: Button = findViewById(R.id.b6)
        val b7: Button = findViewById(R.id.b7)
        val b8: Button = findViewById(R.id.b8)
        val b9: Button = findViewById(R.id.b9)
        val b0: Button = findViewById(R.id.b0)


        var wOp: Int = 0
        var tipo: Int = 4
        var n1: Int = 0
        var n2: Int = 0

        b1.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 1)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 1)
            }
        }

        b2.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 2)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 2)
            }
        }

        b3.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 3)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 3)
            }
        }

        b4.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 4)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 4)
            }
        }

        b5.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 5)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 5)
            }
        }

        b6.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 6)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 6)
            }
        }

        b7.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 7)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 7)
            }
        }

        b8.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 8)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 8)
            }
        }

        b9.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 9)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 9)
            }
        }

        b0.setOnClickListener {
            if(wOp == 0){
                operacion1.setText(operacion1.text.toString() + 0)
            }
            else{
                operacion2.setText(operacion2.text.toString() + 0)
            }
        }

        sum.setOnClickListener {
            n1 = Integer.parseInt(operacion1.text.toString())
            operacion1.setText(operacion1.text.toString() + "+")
            tipo = 0
            wOp = 1
        }

        resta.setOnClickListener {
            n1 = Integer.parseInt(operacion1.text.toString())
            operacion1.setText(operacion1.text.toString() + "-")
            tipo = 1
            wOp = 1
        }

        multi.setOnClickListener {
            n1 = Integer.parseInt(operacion1.text.toString())
            operacion1.setText(operacion1.text.toString() + "*")
            tipo = 2
            wOp = 1
        }

        div.setOnClickListener {
            n1 = Integer.parseInt(operacion1.text.toString())
            operacion1.setText(operacion1.text.toString() + "/")
            tipo = 3
            wOp = 1
        }

        reset.setOnClickListener{
            operacion1.setText("")
            operacion2.setText("")
            wOp = 0
            tipo = 4
        }

        resultado.setOnClickListener {
            n2 = Integer.parseInt(operacion2.text.toString())

            var resultado: Int = 0

            when(tipo){
                0 -> resultado = sumar(n1,n2)
                1 -> resultado = restar(n1,n2)
                2 -> resultado = multi(n1,n2)
                3 -> resultado = dividir(n1,n2)
            }

            operacion1.setText(resultado.toString())
            operacion2.setText("")
            wOp = 0
            tipo = 4
        }

    }


    fun sumar(n1: Int, n2: Int): Int{
        return n1 + n2
    }

    fun restar(n1: Int, n2: Int): Int{
        return n1 - n2
    }

    fun multi(n1: Int, n2: Int): Int{
        return n1 * n2
    }

    fun dividir(n1: Int, n2: Int): Int{
        return n1 / n2
    }
}
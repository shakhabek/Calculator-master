@file:Suppress("UNSAFE_CALL_ON_PARTIALLY_DEFINED_RESOURCE")

package mrsh.shakha.calculator_master

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE

        developer.setOnClickListener {
            Toast.makeText(this, "Powered by shakhzod", Toast.LENGTH_SHORT).show()
        }
        input.text = ""
        input.setOnClickListener {
            if (input.text.toString().isEmpty()) {
//                Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            } else {
                input.text = input.text.substring(0, input.text.length - 1)
            }
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
        }


        btnclear.setOnClickListener {
            input.text = ""

        }


        btn_bracket_left.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    showResult()
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }
        }
        btn_bracket_right.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    val a = input.text.substring(input.text.length - 1, input.text.length)
                    if (a == "+" || a == "-" || a == "*" || a == "÷" || a == "." || a == "%") {
                        val b = input.text.substring(0, input.text.length - 1)
                        input.text = "$b%"
                    } else {
                        input.text = "${input.text}%"
                    }
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }

        }

        btn_0.setOnClickListener {
            if (btn_0.text.toString().isNotEmpty()) {
                input.text = addToInputText("0")
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()
            } else {
                Toast.makeText(this, "zero", Toast.LENGTH_SHORT).show()
            }
        }
        btn_1.setOnClickListener {
            input.text = addToInputText("1")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
        }
        btn_2.setOnClickListener {
            input.text = addToInputText("2")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()

        }
        btn_3.setOnClickListener {
            input.text = addToInputText("3")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()

        }
        btn_4.setOnClickListener {
            input.text = addToInputText("4")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()

        }
        btn_5.setOnClickListener {
            input.text = addToInputText("5")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()

        }
        btn_6.setOnClickListener {
            input.text = addToInputText("6")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()

        }
        btn_7.setOnClickListener {
            input.text = addToInputText("7")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
        }
        btn_8.setOnClickListener {
            input.text = addToInputText("8")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()

        }
        btn_9.setOnClickListener {
            input.text = addToInputText("9")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()

        }
        btn_dot.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    val a = input.text.substring(input.text.length - 1, input.text.length)
                    if (a == "+" || a == "-" || a == "*" || a == "÷" || a == ".") {
                        val b = input.text.substring(0, input.text.length - 1)
                        input.text = "$b."
                    } else {
                        input.text = "${input.text}."
                    }
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }
        }
//        input.text = "0"
        btn_division.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    val a = input.text.substring(input.text.length - 1, input.text.length)
                    if (a == "+" || a == "-" || a == "*" || a == "÷" || a == ".") {
                        val b = input.text.substring(0, input.text.length - 1)
                        input.text = "$b÷"
                    } else {
                        input.text = "${input.text}÷"
                    }
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }
        }
        btn_multiply.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    val a = input.text.substring(input.text.length - 1, input.text.length)
                    if (a == "+" || a == "-" || a == "*" || a == "÷" || a == ".") {
                        val b = input.text.substring(0, input.text.length - 1)
                        input.text = "$b*"
                    } else {
                        input.text = "${input.text}*"
                    }
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }

        }

        btn_subtraction.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    val a = input.text.substring(input.text.length - 1, input.text.length)
                    if (a == "+" || a == "-" || a == "*" || a == "÷" || a == ".") {
                        val b = input.text.substring(0, input.text.length - 1)
                        input.text = "$b-"
                    } else {
                        input.text = "${input.text}-"
                    }
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }

        }
        btn_addition.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    val a = input.text.substring(input.text.length - 1, input.text.length)
                    if (a == "+" || a == "-" || a == "*" || a == "÷" || a == ".") {
                        val b = input.text.substring(0, input.text.length - 1)
                        input.text = "$b+"
                    } else {
                        input.text = "${input.text}+"
                    }
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }
        }
        btn_equals.setOnClickListener {
            if (input.text != "0.") {
                if (input.text.toString().isEmpty()) {
//                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                } else {
                    showResult()

                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()

            }
        }

    }

    private fun addToInputText(buttonValue: String): String {
        return "${input.text}$buttonValue"
    }

    private fun getInputExpression(): String {
        var expression = input.text.replace(Regex("÷"), "/")
        expression = expression.replace(Regex("×"), "*")
        return expression
    }

    @SuppressLint("SetTextI18n")
    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
                input.text = "Error"
                input.setTextColor(ContextCompat.getColor(this, R.color.white))

            } else {
                input.text = DecimalFormat("0.#######").format(result).toString()
                input.setTextColor(ContextCompat.getColor(this, R.color.white))
            }
        } catch (e: Exception) {
            input.text = "Error"
            input.setTextColor(ContextCompat.getColor(this, R.color.white))
        }
    }
}
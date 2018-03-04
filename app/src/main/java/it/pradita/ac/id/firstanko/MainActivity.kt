package it.pradita.ac.id.firstanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.db.TEXT
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     // setContentView(R.layout.activity_main) Karena kita mau nyoba TO-DO 4 maka layout ga kepake.

        //TODO 3 Kita masukin ini buat bikin alert dari button di layout activity_main.xml
//        button.onClick {
//
//            alert {
//                title = "hei ini alert pake anko"
//                message = "message anko common kotlin"
//                yesButton { toast("hei ini klik yes") }
//                noButton { toast("hei ini tombol no") }
//            }.show()
//
//        }


        //TODO 4 AnkoLayout ( TODO 1 tanpa Layout )
        verticalLayout {

            //tambahin ed & button
            var  input1 =editText {
                hint = "username"

            }

            var  input2 = editText {
                hint = "alamat"
            }

            button {


               text = "button"

                onClick {
                    //convert dari string
                    var get1 = input1.text.toString()
                    var get2 = input2.text.toString()

                    var hasil = get1 + get2

                    toast(hasil.toString())
                }
            }

        }
    }


}

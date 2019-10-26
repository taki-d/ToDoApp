package net.orangepla.todoapp

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_task_add.*
import java.text.SimpleDateFormat
import java.util.*

class TaskAdd : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_add)


        date_edit.setText(SimpleDateFormat("yyyy.MM.dd").format(System.currentTimeMillis()))

        var calendar = Calendar.getInstance();
        val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, month)
            calendar.set(Calendar.DATE, dayOfMonth)

            date_edit.setText(SimpleDateFormat("yyyy.MM.dd").format(calendar.time))
        }

        date_edit.setOnClickListener {
            DatePickerDialog(this, dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE)).show()
        }

        save_task_button.setOnClickListener({
            

            startActivity(Intent(this, MainActivity::class.java))
        })
    }
}

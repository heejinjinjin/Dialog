package kr.ac.kopo.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            //기본 목록 대화상자
            var placesArr = arrayOf("에펠탑", "프랑스", "피렌체")
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 핫플레이스")
            dialog.setIcon(R.drawable.icon)
            dialog.setItems(placesArr){ d1, which ->
                btnDialog.text = placesArr[which]
            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()
        }
    }
}
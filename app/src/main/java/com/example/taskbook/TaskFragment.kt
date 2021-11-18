package com.example.taskbook

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.*
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial

//private  const val VALUE = "Switch"

class TaskFragment : Fragment() {

    private lateinit var createTask: Button
   // private lateinit var switchTask: SwitchMaterial
    private lateinit var shareButton: Button

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        val taskList:List<String> = listOf(
            "Реализовать мобильное приложение",
            "Intent",
            "Fragment и SupportFragmentManager",
            "Восстановление activity/fragment с помощью onSaveInstanceState()",
            "RecyclerView",
            "Material design",
            "Залить проект на GIT",
            "Записать видео")

        val view = inflater.inflate(R.layout.fragment_mani_menu, container, false)

        createTask = view.findViewById(R.id.button_create_task)
        shareButton = view.findViewById(R.id.share_button)
//       /switchTask = view.findViewById(R.id.switch_task)

        val link = Uri.parse("https://play.google.com/store/?&utm_source=emea_Med&utm_medium=yandex&utm_content=Sep2021&utm_campaign=Evergreen&pcampaignid=MKT-EDR-emea-ru-1001280-Med-yandex-py-Evergreen-Sep2021-Text_Search_BKWS-yandex%7COFFSEM_kwid_33233437130&yclid=6830436288415720318")
        val intent = Intent(Intent.ACTION_VIEW,link)

        /*if (savedInstanceState!= null)
            switchTask.isChecked = savedInstanceState.getBoolean(VALUE)*/

        shareButton.setOnClickListener{
            startActivity(intent)
        }


        val taskRecyclerView: RecyclerView = view.findViewById(R.id.task_recycler_view)
        taskRecyclerView.layoutManager=
            LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        taskRecyclerView.adapter = TaskAdapter(taskList)

        val createFragment = CreateFragment()
        createTask.setOnClickListener{
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_task, createFragment)
                ?.commit()

        }

        return  view

    }

    /*override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putBoolean(VALUE, switchTask.isChecked)
    }*/

}
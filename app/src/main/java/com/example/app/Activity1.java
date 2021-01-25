package com.example.app;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Activity1 extends AppCompatActivity {

    public static final String LOG_TAG = "AndroidExample";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        List<Doctor> countries = getListData();
        this.recyclerView = (RecyclerView) this.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(this, countries));

        // RecyclerView scroll vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private  List<Doctor> getListData() {
        List<Doctor> list = new ArrayList<Doctor>();
        Doctor doctor_1 = new Doctor("Иванов Иван Иванович", "doctor_1", "Терапевт, стаж работы: 16 лет");
        Doctor doctor_2 = new Doctor("Петров Леонид Васильевич", "doctor_2", "Терапевт, стаж работы: 8 лет");
        Doctor doctor_3 = new Doctor("Фролов Александр Львович", "doctor_3", "Терапевт, стаж работы: 20 лет");
        Doctor doctor_4 = new Doctor("Галкин Федор Михайлович", "doctor_4", "Терапевт, стаж работы: 11 лет");
        Doctor doctor_5 = new Doctor("Антонова Вероника Сергеевна", "doctor_5", "Терапевт, стаж работы: 7 лет");

        list.add(doctor_1);
        list.add(doctor_2);
        list.add(doctor_3);
        list.add(doctor_4);
        list.add(doctor_5);

        return list;
    }


}

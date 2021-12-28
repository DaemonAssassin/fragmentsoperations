package com.gmail.mateendev3.frags.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gmail.mateendev3.frags.R;
import com.gmail.mateendev3.frags.fragments.GetDataFromActivity;
import com.gmail.mateendev3.frags.model.Student;

public class SendDataToFragment extends AppCompatActivity {
    EditText etName, etAge, etHeight;
    Button btnSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data_to_fragment);

        etName = findViewById(R.id.et_name);
        etAge = findViewById(R.id.et_age);
        etHeight = findViewById(R.id.et_height);
        btnSendData = findViewById(R.id.btn_send_data);

        btnSendData.setOnClickListener(v -> {
            Student student = null;
            if (!etName.getText().toString().isEmpty() && !etAge.getText().toString().isEmpty() && !etHeight.getText().toString().isEmpty()) {
                String name = etName.getText().toString();
                byte age = Byte.parseByte(etAge.getText().toString());
                byte height = Byte.parseByte(etHeight.getText().toString());
                student = new Student(name, age, height);
            }

            GetDataFromActivity fragment = GetDataFromActivity.getInstance(student);


            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView2, fragment)
                    .commit();
        });
    }
}
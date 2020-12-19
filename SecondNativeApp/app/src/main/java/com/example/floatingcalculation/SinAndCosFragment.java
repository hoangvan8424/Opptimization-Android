package com.example.floatingcalculation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SinAndCosFragment extends Fragment {

    private Button btnJavaCheck;
    private Button btnNativeCheck;
    private EditText textNumber;
    private TextView txtNameAlgorithm;
    private TextView txtNumberCheck;
    private TextView txtTime;
    private LinearLayout txtContainer;
    private JavaLibrary javaLibrary;
    private NativeLibrary nativeLibrary;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sin_and_cos, container, false);
        init(view);
        addControls();
        return view;
    }

    private void addControls() {
        javaLibrary = new JavaLibrary();
        nativeLibrary = new NativeLibrary();
        btnNativeCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textNumber.getText().toString().isEmpty()) {
                    double number = Double.parseDouble(textNumber.getText().toString());
                    txtContainer.setVisibility(View.VISIBLE);
                    txtNameAlgorithm.setText("Phép tính dấu phẩy động: Tính sin và cos(C++)");
                    txtNumberCheck.setText("Số kiểm tra: " + number);
                    txtTime.setText("Thời gian thực thi: " + nativeLibrary.calSinAndCos(number) + "ms");
                }
            }
        });

        btnJavaCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textNumber.getText().toString().isEmpty()) {
                    double number = Double.parseDouble(textNumber.getText().toString());
                    txtContainer.setVisibility(View.VISIBLE);
                    txtNameAlgorithm.setText("Phép tính dấu phẩy động: Tính sin và cos(Java)");
                    txtNumberCheck.setText("Số kiểm tra: " + number);
                    txtTime.setText("Thời gian thực thi: " + javaLibrary.calSinAndCos(number) + "ms");
                }
            }
        });
    }

    private void init(View view) {
        btnJavaCheck = (Button) view.findViewById(R.id.btn_start_java);
        btnNativeCheck = (Button) view.findViewById(R.id.btn_start_native);
        textNumber = (EditText) view.findViewById(R.id.txt_number);
        txtTime = (TextView) view.findViewById(R.id.txt_time);
        txtNameAlgorithm = (TextView) view.findViewById(R.id.txt_name_algorithm);
        txtNumberCheck = (TextView) view.findViewById(R.id.txt_number_check);
        txtContainer = (LinearLayout) view.findViewById(R.id.txt_container);
        txtContainer.setVisibility(View.GONE);
    }
}
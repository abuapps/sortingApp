package com.example.abubaker.sorting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void acc(View view)
    {
        TextView txt = (TextView) findViewById(R.id.result);
        EditText editText = (EditText) findViewById(R.id.edit);

        String s = editText.getText().toString();

        int a = Integer.parseInt(s);


        String temp1 = Integer.toString(a);

        int[] arr = new int[temp1.length()];

        for (int i = 0; i < temp1.length(); i++)
        {
            arr[i] = temp1.charAt(i) - '0';
        }


        int temp;


        for (int i = 0; i <arr.length; i++)
        {
            for (int j = i + 1; j <arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }


        }


        StringBuilder builder = new StringBuilder();
        for (int i : arr)
        {
            builder.append(i);
        }
        String text = builder.toString();

          txt.setText(text);






    }


    public void dcc(View view)
    {

        TextView txt = (TextView) findViewById(R.id.result);
        EditText editText = (EditText) findViewById(R.id.edit);

        String s = editText.getText().toString();

        int a = Integer.parseInt(s);


        String temp1 = Integer.toString(a);

        int[] arr = new int[temp1.length()];

        for (int i = 0; i < temp1.length(); i++)
        {
            arr[i] = temp1.charAt(i) - '0';
        }


        int temp;


        for (int i = 0; i <arr.length; i++)
        {
            for (int j = i + 1; j <arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }


        }


        StringBuilder builder = new StringBuilder();
        for (int i : arr)
        {
            builder.append(i);
        }
        String text = builder.toString();

        txt.setText(text);


    }


}

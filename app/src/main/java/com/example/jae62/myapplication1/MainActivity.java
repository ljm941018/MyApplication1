package com.example.jae62.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
//leejaemin
public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button mbuttonSimpleList1;
    private Button mbuttonSimpleList2;
    private Button mbuttonCustomList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mbuttonSimpleList1 = (Button) findViewById(R.id.main_button_simple_list1);
        mbuttonSimpleList1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                switch (arg0.getId()) {
                    case R.id.main_button_simple_list1:
                        Intent intentSimpleList1 = new Intent(getApplicationContext(), SimpleList1Activity.class);
                        startActivity(intentSimpleList1);
                        break;
                    case R.id.main_button_simple_list2:
                        Intent intentSimpleList2 = new Intent(getApplicationContext(), SimpleList2Activity.class);
                        startActivity(intentSimpleList2);
                        break;
                    case R.id.main_button_custom_list:
                        Intent intentCustomList = new Intent(getApplicationContext(), CustomListActivity.class);
                        startActivity(intentCustomList);
                        break;
                }
            }
        });

        mbuttonSimpleList2 = (Button) findViewById(R.id.main_button_simple_list2);
        mbuttonSimpleList2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                switch (arg0.getId()) {
                    case R.id.main_button_simple_list1:
                        Intent intentSimpleList1 = new Intent(getApplicationContext(), SimpleList1Activity.class);
                        startActivity(intentSimpleList1);
                        break;
                    case R.id.main_button_simple_list2:
                        Intent intentSimpleList2 = new Intent(getApplicationContext(), SimpleList2Activity.class);
                        startActivity(intentSimpleList2);
                        break;
                    case R.id.main_button_custom_list:
                        Intent intentCustomList = new Intent(getApplicationContext(), CustomListActivity.class);
                        startActivity(intentCustomList);
                        break;
                }
            }
        });

        mbuttonCustomList = (Button) findViewById(R.id.main_button_custom_list);
        mbuttonCustomList.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                switch (arg0.getId()) {
                    case R.id.main_button_simple_list1:
                        Intent intentSimpleList1 = new Intent(getApplicationContext(), SimpleList1Activity.class);
                        startActivity(intentSimpleList1);
                        break;
                    case R.id.main_button_simple_list2:
                        Intent intentSimpleList2 = new Intent(getApplicationContext(), SimpleList2Activity.class);
                        startActivity(intentSimpleList2);
                        break;
                    case R.id.main_button_custom_list:
                        Intent intentCustomList = new Intent(getApplicationContext(), CustomListActivity.class);
                        startActivity(intentCustomList);
                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}

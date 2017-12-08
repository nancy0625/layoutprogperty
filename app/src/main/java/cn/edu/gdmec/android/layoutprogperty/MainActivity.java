package cn.edu.gdmec.android.layoutprogperty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    //private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    public void sendMessage(View v) {
        Toast.makeText(MainActivity.this, "响应xml中对应的方法按钮", Toast.LENGTH_SHORT).show();
    }

    public void onToggleClicked(View view) {
        boolean on = ((Switch) view).isChecked();
        if (on) {
            Toast.makeText(MainActivity.this, "對應打开按钮事件", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "對應关闭按钮事件", Toast.LENGTH_SHORT).show();
        }

    }

    public void onRadioButtonClicked(View view) {
        RadioButton button = (RadioButton) view;
        boolean isChecked = button.isChecked();
        switch (view.getId()) {
            case R.id.radio1:
                if (isChecked) {
                    Toast.makeText(MainActivity.this, button.getText(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radio2:
                if (isChecked) {
                    Toast.makeText(MainActivity.this, button.getText(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radio3:
                if (isChecked) {
                    Toast.makeText(MainActivity.this, button.getText(), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void initView() {
        button1 = (Button) this.findViewById(R.id.button1);
        // button3 = (Button) this.findViewById(R.id.but);
        button2 = (Button) this.findViewById(R.id.button2);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        /*button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button1", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(MainActivity.this, "Button1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "Button2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

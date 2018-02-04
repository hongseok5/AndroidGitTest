package com.example.bit.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_post);
        //액티비티가 생성될때마다 뷰를 생성하여 보여준다.
    }

    /***

    Button btnGood=(Button)findViewById(R.id.postbutton);
    btnGood.setOnClickListener(new Button.OnClickListener() {
        public void onClick(View v) {
            TextView textPoll=(TextView)findViewById(R.id.pg2_way);
            textPoll.setText("업로드 되었습니다."); }    });



    Button btn = (Button)findViewByld(R.id.btn);
        btn.OnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                EditText edit = (EditText)findViewById(R.id.edit);
                String str = edit.getText().toString();
            Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
        }

     **/
}



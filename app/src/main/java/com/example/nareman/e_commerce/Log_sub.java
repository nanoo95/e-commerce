package com.example.nareman.e_commerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Log_sub extends AppCompatActivity {

    private TextView phoneerror,passerror;
    private EditText phone,pass;
    private Button login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_sub);
       init();
       click();
       clicksign();
    }
    public   void init()
    {
        login=(Button)findViewById(R.id.login);
        phone=(EditText)findViewById(R.id.mobiletext);
        pass=(EditText)findViewById(R.id.passtext);
        phoneerror=(TextView) findViewById(R.id.textmobileerror);
        passerror=(TextView) findViewById(R.id.texterrorpass);
        signup=(Button)findViewById(R.id.signup);
    }
    void  click()
    {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean v=true;
                if(phone.getText().toString().length()<10) {
                    phoneerror.setVisibility(View.VISIBLE);
                    v = false;

                    YoYo.with(Techniques.Bounce).duration(2000).playOn(phoneerror);
                }
                else
                {
                    phoneerror.setVisibility(View.GONE);
                    v=true;
                }
                if(pass.getText().toString().length()<7)
                {
                    passerror.setVisibility(View.VISIBLE);
                    v = false;

                    YoYo.with(Techniques.Bounce).duration(2000).playOn(passerror);
                }
                else
                {
                    passerror.setVisibility(View.GONE);
                    v=true;
                }

            }

        });

    }

void clicksign()
{
    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Log_sub.this,Signup.class);
            startActivity(intent);

        }
    });

}

}

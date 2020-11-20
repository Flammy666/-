package com.example.tsuladzedavitg_29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void SignUp(View view){


        EditText editText = (EditText)findViewById(R.id.editPetName);
        EditText editText1 = (EditText)findViewById(R.id.editTextTextPersonName2);
        EditText editText2 = (EditText)findViewById(R.id.editPetAGE);

        String message;



        if(editText.getText().toString().isEmpty()){
            message = "შეიყვანეთ სახელი";

            }
        else if(editText1.getText().toString().isEmpty()){
            message = "შეიყვანეთ ჯიში";
        }
        else if(editText2.getText().toString().isEmpty()){
            message = "შეიყვანეთ ასაკი";
        }




        else {
            int editPetAGE = Integer.parseInt(editText2.getText().toString());
            if (editPetAGE > 10){
                message = "მაქსიმალური ასაკი 10 წელია";
            }

            else if (editPetAGE < 1 ) {
                message = "მინიმალური ასაკი 1 წელია";
            }
            else {
                message = "თქვენ წარმატებით გაიარეთ რეგისტრაცია";
            }
        }








        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
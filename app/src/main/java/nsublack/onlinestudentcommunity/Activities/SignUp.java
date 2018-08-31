package nsublack.onlinestudentcommunity.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import nsublack.onlinestudentcommunity.R;

public class SignUp extends AppCompatActivity {

    private Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_signUp = findViewById(R.id.btn_sign_up);


        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "Signed up successfully.", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignUp.this, MainActivity.class));
            }
        });


    }
}

package nsublack.onlinestudentcommunity.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

import nsublack.onlinestudentcommunity.R;

public class Login extends AppCompatActivity {


    private Button login;
    private TextView signup, header;
    private EditText email, password;
    private CheckBox remember;
    int RC_SIGN_IN = 121;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   /*     setContentView(R.layout.activity_login);


        login = findViewById(R.id.log_btn_login);
        signup = findViewById(R.id.tv_sign_up);
        header = findViewById(R.id.app_text);
        email = findViewById(R.id.log_et_email);
        password = findViewById(R.id.log_et_password);
        remember = findViewById(R.id.log_cb_remember);



        final Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/Regular.ttf");
        final Typeface bold = Typeface.createFromAsset(getAssets(), "fonts/Bold.ttf");
        final Typeface firaSans_medium = Typeface.createFromAsset(getAssets(),"fonts/FiraSans-Medium.ttf");
        final Typeface firaSans_semiBold = Typeface.createFromAsset(getAssets(),"fonts/FiraSans-Medium.ttf");
        final Typeface amaranth = Typeface.createFromAsset(getAssets(),"fonts/Amaranth-Bold.ttf");




        login.setTypeface(bold);
        signup.setTypeface(bold);
        header.setTypeface(amaranth);
        email.setTypeface(firaSans_medium);
        password.setTypeface(firaSans_medium);
        remember.setTypeface(firaSans_semiBold);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().length()!=0||password.getText().length()!=0){
                    startActivity(new Intent(Login.this,MainActivity.class));

                }else{
                    Toast.makeText(Login.this, "Email or password field cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(Login.this, SignUp.class));

            }
        });*/

        FirebaseApp.initializeApp(this);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null) {

            startActivity(new Intent(Login.this, MainActivity.class));
            finish();
        } else {

            // Choose authentication providers
            List<AuthUI.IdpConfig> providers = Arrays.asList(
                    new AuthUI.IdpConfig.EmailBuilder().build(),
                    new AuthUI.IdpConfig.GoogleBuilder().build(),
                    new AuthUI.IdpConfig.PhoneBuilder().build());

            startActivityForResult(
                    AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .setAvailableProviders(providers)
                            .build(),
                    RC_SIGN_IN);


        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);

            if (resultCode == RESULT_OK) {
                // Successfully signed in
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

                if (user != null) {
                    startActivity(new Intent(Login.this, MainActivity.class));
                    finish();
                }
                // ...
            } else {


                Toast.makeText(Login.this, "Sign In Error", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

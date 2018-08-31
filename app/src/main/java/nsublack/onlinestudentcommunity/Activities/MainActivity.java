package nsublack.onlinestudentcommunity.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import nsublack.onlinestudentcommunity.Fragments.Classes;
import nsublack.onlinestudentcommunity.Fragments.Feed;
import nsublack.onlinestudentcommunity.R;
import nsublack.onlinestudentcommunity.Fragments.Settings;

public class MainActivity extends AppCompatActivity {


    private Toolbar maintoolbar;
    private TextView toolbartext;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maintoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(maintoolbar);


        final Typeface amaranth = Typeface.createFromAsset(getAssets(), "fonts/Amaranth-Bold.ttf");


        toolbartext = findViewById(R.id.toolbarTXT);
        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, maintoolbar, R.string.drawer_open, R.string.drawer_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container, new Feed());
        fragmentTransaction.commit();
        toolbartext.setText("Feed");
        getSupportActionBar().setTitle("");

        toolbartext.setTypeface(amaranth);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switchFragment(item.getItemId());
                item.setChecked(true);

                return false;
            }
        });
    }


    private void switchFragment(int n) {


        switch (n) {
            case R.id.feed:
                Feed ft = new Feed();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, ft);
                fragmentTransaction.commit();
                toolbartext.setText("Feed");
                getSupportActionBar().setTitle("");
                //item.setChecked(true);
                drawerLayout.closeDrawers();
                break;

            case R.id.classes:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Classes());
                fragmentTransaction.commit();
                toolbartext.setText("Classes");
                getSupportActionBar().setTitle("");
                //item.setChecked(true);
                drawerLayout.closeDrawers();
                break;

            case R.id.settings:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Settings());
                fragmentTransaction.commit();
                toolbartext.setText("Settings");
                getSupportActionBar().setTitle("");
                //item.setChecked(true);
                drawerLayout.closeDrawers();
                break;

            case R.id.logout:
//                fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.main_container, new Settings());
//                fragmentTransaction.commit();
//                toolbartext.setText("Settings");
//                getSupportActionBar().setTitle("");
//                //item.setChecked(true);
//                drawerLayout.closeDrawers();

                AuthUI.getInstance()
                        .signOut(this)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            public void onComplete(@NonNull Task<Void> task) {
                                startActivity(new Intent(MainActivity.this, Login.class));
                            }
                        });
                break;


        }


    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

}

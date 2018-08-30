package nsublack.onlinestudentcommunity;

import android.content.Intent;
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
import android.widget.Toast;

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


        }


    }

}

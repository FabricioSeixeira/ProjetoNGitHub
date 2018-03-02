package com.example.t_ex_140542.projetongithub;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Toast toast = Toast.makeText(MainLayoutActivity.this, "Clique para recentes", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast.show();
                        break;

                    case R.id.action_favorite:
                        Toast toast1 = Toast.makeText(MainLayoutActivity.this, "Clique para favoritos", Toast.LENGTH_LONG);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast1.show();
                        break;

                    case R.id.action_Localization:
                        Toast toast2 = Toast.makeText(MainLayoutActivity.this, "Clique para localização", Toast.LENGTH_LONG);
                        toast2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_HORIZONTAL, 0, 0);
                        toast2.show();
                        break;
                }
                return true;
            }
        });
    }
}

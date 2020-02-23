package id.boxee.customlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ViewPager viewPager = findViewById(R.id.viewpager_login);
        viewPager.setAdapter(new LoginViewPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.login_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}

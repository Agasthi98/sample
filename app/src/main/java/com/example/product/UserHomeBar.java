package com.example.product;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.navigation.NavigationView;

public class UserHomeBar extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout uDrawerLayout;
    private NavigationView uNavigationView;
    private Toolbar uToolbar;
    private ActionBarDrawerToggle uToggle;
    private FrameLayout mFrameLayout;


//    private UserProfile userProfileFragment;
//    private UserProfileUpdate updateUserProfileFragment;
//    private AddPaymentMethod addPayment;
//    private HomePage homePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_bar);

        uDrawerLayout = findViewById(R.id.user_drawer_layout);
        uNavigationView = findViewById(R.id.navigation_view);
        uToolbar = findViewById(R.id.toolbar);
        uToggle = new ActionBarDrawerToggle(this,uDrawerLayout,R.string.open,R.string.close);

        uToolbar.setTitle("Sprinkles");
        setSupportActionBar(uToolbar);
        uDrawerLayout.addDrawerListener(uToggle);
        uToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        uNavigationView.setNavigationItemSelectedListener(this);
//
//        userProfileFragment = new UserProfile();
//        updateUserProfileFragment = new UserProfileUpdate();
//        addPayment = new AddPaymentMethod();
        HomePage = new HomePage();
        setFragment(HomePage);
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame,fragment);
        transaction.commit();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(uToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = findViewById(R.id.user_drawer_layout);
        if(drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    public void displaySelectedListner(int itemId) {
        Fragment fragment = null;
        switch (itemId) {
//            case R.id.nav_user_account:
//                fragment = new UserProfile();
//                break;
//            case R.id.nav_user_account_update:
//                fragment = new UserProfileUpdate();
//                break;
//            case R.id.nav_add_payment:
//                fragment = new AddPaymentMethod();
//                break;
//            case R.id.nav_user_cart:
//                fragment = new CartItems();
//                break;
//            case R.id.nav_home:
//                fragment = new HomePage();
//                break;
//            case R.id.nav_payment_methods:
//                fragment = new PaymentMethods();
//                break;
//        }

//        if (fragment != null) {
//            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//            transaction.replace(R.id.main_frame, fragment);
//            transaction.commit();
//        }

        DrawerLayout drawerLayout = findViewById(R.id.user_drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        displaySelectedListner(item.getItemId());
        return false;
    }
}
}
//
//        private DrawerLayout drawerLayout;
//        private NavigationView navigationView;
//        private Toolbar uToolbar;
//        private ActionBarDrawerToggle toggle;
//        private FrameLayout frameLayout;
//
//
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_user_home_bar);
//
//        drawerLayout = findViewById(R.id.user_drawer_layout);
//        navigationView = findViewById(R.id.navigation_view);
//        uToolbar = findViewById(R.id.toolbar);
//        toggle = new ActionBarDrawerToggle(this,drawerLayout,"Open","Close");
//
//        uToolbar.setTitle("Sprinkles");
//        setSupportActionBar(uToolbar);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        navigationView.setNavigationItemSelectedListener(this);
//    }
//
//
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        return false;
//    }
//}


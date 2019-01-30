package com.example.dani.app_restaurante;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SegundosActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // cargar imagenes con glide
        ImageView p1 = findViewById(R.id.img1);
        Glide.with(this).load(R.drawable.macarrones_con_salmon).into(p1);

        ImageView p2 = findViewById(R.id.img2);
        Glide.with(this).load(R.drawable.empanadillas_de_ajoarriero).into(p2);

        ImageView p3 = findViewById(R.id.img3);
        Glide.with(this).load(R.drawable.pizza_pera).into(p3);

        ImageView p4 = findViewById(R.id.img4);
        Glide.with(this).load(R.drawable.filetes_de_redondo_con_ensalada_y_coles_de_bruselas).into(p4);

        ImageView p5 = findViewById(R.id.img5);
        Glide.with(this).load(R.drawable.bacalao_txakoli).into(p5);

        ImageView p6 = findViewById(R.id.img6);
        Glide.with(this).load(R.drawable.conejo_al_horno).into(p6);

        ImageView p7 = findViewById(R.id.img7);
        Glide.with(this).load(R.drawable.albondigas_salsa).into(p7);

        ImageView p8 = findViewById(R.id.img8);
        Glide.with(this).load(R.drawable.filetes_pavo).into(p8);

        ImageView p9 = findViewById(R.id.img9);
        Glide.with(this).load(R.drawable.jabali_estofado).into(p9);

        ImageView p10 = findViewById(R.id.img10);
        Glide.with(this).load(R.drawable.morros_picantes).into(p10);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.segundos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

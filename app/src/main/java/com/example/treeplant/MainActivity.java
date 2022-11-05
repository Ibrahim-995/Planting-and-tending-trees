package com.example.treeplant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerID);

        NavigationView navigationView = findViewById(R.id.navigationID);
        navigationView.setNavigationItemSelectedListener(this);

        toggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;

        if(item.getItemId()==R.id.aboutid){
            intent = new Intent(MainActivity.this,AboutActivity.class);
            startActivity(intent);
        }

        if(item.getItemId()==R.id.homeid){
            intent = new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }

        if(item.getItemId()==R.id.videoid){
            intent = new Intent(MainActivity.this,videos.class);
            startActivity(intent);
        }

        if(item.getItemId()==R.id.addnoteid){
            intent = new Intent(MainActivity.this,ShareActivity.class);
            startActivity(intent);
        }


        if(item.getItemId()==R.id.queryid){
            intent = new Intent(MainActivity.this,queryactivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.privacyid){
            intent = new Intent(MainActivity.this,policy.class);
            startActivity(intent);
        }


        if(item.getItemId()==R.id.shareid){
           intent = new Intent(Intent.ACTION_SEND);
           intent.setType("text/plain");
           intent.putExtra(Intent.EXTRA_SUBJECT,"Download theis app");
           intent.putExtra(Intent.EXTRA_TEXT,"https://drive.google.com/drive/folders/163rpduaeaVu9rF6Nj71FplAPsOKJr1XM?usp=sharing");
           startActivity(Intent.createChooser(intent,"Share Via"));

        }




        return false;

    }


    public void vegetableid(View view) {

        Intent intent=new Intent(MainActivity.this,vegitableactivity.class);
        startActivity(intent);

    }

    public void fruitsid(View view) {
        Intent intent=new Intent(MainActivity.this,fruitsactivity.class);
        startActivity(intent);
    }

    public void flowerid(View view) {
        Intent intent=new Intent(MainActivity.this,floweractivity.class);
        startActivity(intent);
    }

    public void indoorid(View view) {
        Intent intent=new Intent(MainActivity.this,indooractivity.class);
        startActivity(intent);
    }

    public void outdoorid(View view) {
        Intent intent=new Intent(MainActivity.this,outdoorActivity.class);
        startActivity(intent);
    }

    public void cacktusid(View view) {
        Intent intent=new Intent(MainActivity.this,cactusActivity.class);
        startActivity(intent);
    }


}
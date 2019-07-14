package com.gradimut.mutplayer;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabId);
        viewPager = findViewById(R.id.viewPagerId);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragement(new TrackFragment(), "Call");
        adapter.AddFragement(new ArtistFragment(), "Artist");
        adapter.AddFragement(new AlbumFragment(), "Call");
        adapter.AddFragement(new PlaylistFragment(), "Playlist");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
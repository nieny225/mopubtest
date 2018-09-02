package com.cmplay.mopubtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.mopub.common.MoPub;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.PersonalInfoManager;
import com.mopub.mobileads.MoPubInterstitial;
import com.mopub.mobileads.MoPubRewardedVideos;

public class ScrollingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
//        new android.os.Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //do something
//                Log.e("MoPub", "loadRewardedVideo#");
//                MoPubRewardedVideos.loadRewardedVideo("b195f8dd8ded45fe847ad89ed1d016da");
//            }
//        }, 500);
//        new android.os.Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //do something
//                Log.e("MoPub", "loadRewardedVideo#");
//                MoPubRewardedVideos.loadRewardedVideo("b195f8dd8ded45fe847ad89ed1d016da");
//            }
//        }, 700);
//        new android.os.Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //do something
//                Log.e("MoPub", "loadRewardedVideo#");
//                MoPubRewardedVideos.loadRewardedVideo("b195f8dd8ded45fe847ad89ed1d016da");
//            }
//        }, 900);
//        new android.os.Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //do something
//                Log.e("MoPub", "loadRewardedVideo#");
//                MoPubRewardedVideos.loadRewardedVideo("b195f8dd8ded45fe847ad89ed1d016da");
//            }
//        }, 1100);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //do something
                MoPubLog.d("new MoPubInterstitial");
                MoPubInterstitial mMoPubInterstitial = new MoPubInterstitial(ScrollingActivity.this, "24534e1901884e398f1253216226017e");
                mMoPubInterstitial.load();
            }
        }, 100);
        initMopub();
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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

    private void initMopub(){
        SdkConfiguration sdkConfiguration = new SdkConfiguration.Builder("b195f8dd8ded45fe847ad89ed1d016da")
                .build();
        MoPub.initializeSdk(this, sdkConfiguration, new SdkInitializationListener() {
            @Override
            public void onInitializationFinished() {
//                MoPubRewardedVideos.loadRewardedVideo("b195f8dd8ded45fe847ad89ed1d016da");
//                Log.d("MoPub", "loadRewardedVideo#");
//                MoPubInterstitial mMoPubInterstitial = new MoPubInterstitial(ScrollingActivity.this, "24534e1901884e398f1253216226017e");
//                mMoPubInterstitial.load();
            }
        });
        PersonalInfoManager mPersonalInfoManager = MoPub.getPersonalInformationManager();
        mPersonalInfoManager.grantConsent();
    }
}

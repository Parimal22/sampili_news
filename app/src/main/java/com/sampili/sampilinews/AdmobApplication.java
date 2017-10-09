package com.sampili.sampilinews;

import android.app.Application;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by Parimal_Debbarma on 6/25/2017.
 */

public class AdmobApplication extends Application {

    public InterstitialAd mInterstitialAd;
    public void createWallAd(){
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.banner_home_footer));
    }
    public void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("bfbd3a3c054112a0")
                .build();
        mInterstitialAd.loadAd(adRequest);
    }
    public boolean isAdLoaded(){
        if (mInterstitialAd.isLoaded()) {
            return true;
        }
        return false;
    }
    public void displayLoadedAd(){
        mInterstitialAd.show();
    }
}

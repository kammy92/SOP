package com.actiknow.sop.service;

import android.util.Log;


import com.actiknow.sop.utils.Utils;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName ();
    @Override
    public void onTokenRefresh () {
        super.onTokenRefresh ();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Utils.showLog (Log.DEBUG, TAG, "Refreshed Token: " + refreshedToken, true);
    
       // BuyerDetailsPref buyerDetailsPref = BuyerDetailsPref.getInstance ();
       // buyerDetailsPref.putStringPref (getApplicationContext (), BuyerDetailsPref.BUYER_FIREBASE_ID, refreshedToken);
    }
}


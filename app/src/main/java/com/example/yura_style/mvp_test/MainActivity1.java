package com.example.yura_style.mvp_test;

import android.content.Context;
import android.content.Intent;

public class MainActivity1 {
    private Context context;

    public MainActivity1(Context context) {
        this.context = context;
    }

    public void startMainActivity() {
        context.startActivity(new Intent(context, MainActivity1.class));
    }
}

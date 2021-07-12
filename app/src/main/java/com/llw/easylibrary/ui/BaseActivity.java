package com.llw.easylibrary.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 状态栏颜色
     * @param activity 页面
     * @param dark 是否深色
     */
    protected static void setLightStatusBar(Activity activity, boolean dark) {
        View decor = activity.getWindow().getDecorView();
        if (dark) {
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        } else {
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
    }

    protected void jumpActivity(final Class clazz) {
        startActivity(new Intent(this,clazz));
    }

    protected void jumpActivityFinish(final Class<?> clazz) {
        startActivity(new Intent(this,clazz));
        finish();
    }

    protected void back(final MaterialToolbar toolbar) {
        toolbar.setNavigationOnClickListener(v -> finish());
    }

}

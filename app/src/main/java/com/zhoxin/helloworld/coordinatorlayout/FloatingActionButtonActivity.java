package com.zhoxin.helloworld.coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

import com.zhoxin.helloworld.init.BaseActivity;
import com.zhoxin.higithub.R;

/**
 * Created by zhouxin on 2017/7/30.
 * CoordinatorLayout_FloatingActionButton
 */

public class FloatingActionButtonActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinator_floating);
        findViewById(R.id.floating_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.floating_button:
                Snackbar.make(v, "floatingActionButton", Snackbar.LENGTH_LONG)
                        .setAction("haha", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(context, "hello coordinatorlayout_floatingactionbutton"
                                        , Toast.LENGTH_SHORT).show();
                            }
                        }).show();
                break;
            default:
                break;
        }
    }
}

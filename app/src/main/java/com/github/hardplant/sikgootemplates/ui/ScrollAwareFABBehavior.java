package com.github.hardplant.sikgootemplates.ui;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Toast;

/**
 * Created by KANG on 2018-01-21.
 */

public class ScrollAwareFABBehavior extends FloatingActionButton.Behavior {
    public ScrollAwareFABBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(CoordinatorLayout parent, FloatingActionButton child, MotionEvent ev) {
        Toast.makeText(parent.getContext(), "Hello World!", Toast.LENGTH_LONG).show();
        return super.onTouchEvent(parent, child, ev);
    }
}

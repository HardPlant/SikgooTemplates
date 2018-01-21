package com.github.hardplant.sikgootemplates.ui.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.github.hardplant.sikgootemplates.R;

/**
 * Created by KANG on 2018-01-21.
 */

public class ImageDialog {
    AlertDialog.Builder builder;
    Context context;
    final AlertDialog dialog;

    public ImageDialog(Context context) {
        this.context = context;
        builder = new AlertDialog.Builder(context);
        builder.setPositiveButton("오늘은 더 이상 보지 않기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog = builder.create();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View dialogLayout = inflater.inflate(R.layout.dialog_event, null);
        dialog.setView(dialogLayout);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {

            }
        });
    }

    public ImageDialog show(){
        dialog.show();
        return this;
    }
}

package com.github.hardplant.sikgootemplates.ui.activity;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.github.hardplant.sikgootemplates.R;

public class ProfileActivity extends AppCompatActivity {
    ImageButton plusButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        plusButton = (ImageButton) findViewById(R.id.plus_button);
        setToolbar();
    }

    void setToolbar(){
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolbar);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            final Drawable upArrow = getResources().getDrawable(R.drawable.ic_arrow_back_24dp);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        if(item.getItemId() == R.id.plus_button){
            PopupMenu pm = new PopupMenu(ProfileActivity.this, plusButton);
            pm.getMenuInflater().inflate(R.menu.menu_profile, pm.getMenu());
            pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Toast.makeText(getApplicationContext(), String.valueOf(menuItem.getTitle()), Toast.LENGTH_SHORT).show();
                    switch(menuItem.getItemId()){
                        case R.id.invite:
                            break;
                        case R.id.call:
                            break;
                        default:
                            break;
                    }
                    return true;
                }
            });
            pm.show();
        }

        return super.onOptionsItemSelected(item);
    }

}

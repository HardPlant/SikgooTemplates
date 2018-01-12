package com.github.hardplant.sikgootemplates.ui.fragment;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.github.hardplant.sikgootemplates.R;

/**
 * Created by KANG on 2018-01-12.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Load the Preferences from the XML file
        addPreferencesFromResource(R.xml.app_preferences);
    }
}

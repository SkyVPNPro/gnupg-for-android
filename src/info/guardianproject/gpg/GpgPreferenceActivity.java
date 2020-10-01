
package info.guardianproject.gpg;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class GpgPreferenceActivity extends PreferenceActivity {

    public final static String PREF_START_BOOT = "pref_start_boot";
    public final static String PREF_KEYSERVER = "pref_keyserver";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

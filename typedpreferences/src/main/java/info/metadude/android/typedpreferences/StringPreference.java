package info.metadude.android.typedpreferences;

import ohos.data.preferences.Preferences;

/**
 * A wrapper class for a String preference.
 */
public class StringPreference extends BasePreference {

    protected final String mDefaultValue;

    public static final String DEFAULT_VALUE_VALUE = "";

    /**
     * StringPreference.
     *
     * @param preferences pref.
     * @param key key.
     */
    public StringPreference(final Preferences preferences, final String key) {
        this(preferences, key, DEFAULT_VALUE_VALUE);
    }

    /**
     * String.
     *
     * @param preferences pref.
     * @param key key.
     * @param defaultValue defaultval.
     */
    public StringPreference(final Preferences preferences, final String key, final String defaultValue) {
        super(preferences, key);
        mDefaultValue = defaultValue;
    }

    /**
     * Returns the stored {@code String} value if it exists
     * or the default value.
     */
    public String get() {
        return mPreferences.getString(mKey, mDefaultValue);
    }

    /**
     * value.
     *
     * @param value val.
     */
    public void set(final String value) {
        mPreferences.putString(mKey, value).flush();
    }


}
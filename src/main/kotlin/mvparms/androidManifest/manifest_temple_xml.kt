package mvparms.androidManifest

fun manifestTemplateXml(packageName:String,activityPackageName:String,activityClass:String) = """
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
	package="${packageName}">

    <application>
	    <activity android:name="${activityPackageName}.${activityClass}"
            android:configChanges="orientation|screenSize"
            android:label=""
            android:exported="false"
            android:screenOrientation="portrait"
            android:windowSoftInputMode="stateAlwaysHidden"/>
    </application>
</manifest>
        """
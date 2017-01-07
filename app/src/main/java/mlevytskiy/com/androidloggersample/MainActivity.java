package mlevytskiy.com.androidloggersample;

import android.app.Activity;
import android.os.Bundle;

import hugo.weaving.DebugLog;

@DebugLog
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }


    public String test() {
        return "test";
    }

}

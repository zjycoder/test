package com.traceview.demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Debug;

public class TraceViewDemoActivity extends Activity {

	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        Debug.startMethodTracing("calc");//calc为文件生成名
    }
	
	@Override
	protected void onStop() {
		super.onStop();
		
		Debug.stopMethodTracing();//写在此处是为了容易生成:calc.trace文件(google dev guide中规定写在OnDestroy中)
	}
}
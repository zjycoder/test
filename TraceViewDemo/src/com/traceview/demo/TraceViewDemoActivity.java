package com.traceview.demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Debug;

public class TraceViewDemoActivity extends Activity {

	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        Debug.startMethodTracing("calc");//calcΪ�ļ�������
    }
	
	@Override
	protected void onStop() {
		super.onStop();
		
		Debug.stopMethodTracing();//д�ڴ˴���Ϊ����������:calc.trace�ļ�(google dev guide�й涨д��OnDestroy��)
	}
}
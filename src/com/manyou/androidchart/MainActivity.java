package com.manyou.androidchart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.manyou.androidchart.chart.BarChart;
import com.manyou.androidchart.chart.PieChart;

/**
 * Ö÷½çÃæ
 * @Package com.manyou.androidchart
 * @FileName MainActivity.java
 * @Author APKBUS-manyou
 * @Date 2013-1-30
 */
public class MainActivity extends Activity implements OnClickListener {

	/**
	 * Öù×´Í¼
	 */
	private Button barButton;

	/**
	 * ±ýÍ¼
	 */
	private Button pieButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		barButton = (Button) findViewById(R.id.bar);
		pieButton = (Button) findViewById(R.id.pie);
		barButton.setOnClickListener(this);
		pieButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bar:
			Intent lineIntent = new BarChart().getIntent(this);
			startActivity(lineIntent);
			break;
		case R.id.pie:
			Intent pieIntent = new PieChart().getIntent(this); 
			startActivity(pieIntent);
			break;
		}
	}
}

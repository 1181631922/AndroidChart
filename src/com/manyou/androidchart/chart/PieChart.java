package com.manyou.androidchart.chart;

import org.achartengine.ChartFactory;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;

/**
 * ��ͼ
 * 
 * @Package com.manyou.androidchart
 * @FileName PieChart.java
 * @Author APKBUS-manyou
 * @Date 2013-1-30
 */
public class PieChart implements AChartAbstract {

	public Intent getIntent(Context context) {
		return ChartFactory.getPieChartIntent(context, getDataSet(), getPieRenderer(), "�ֻ������߱���(��ͼ)");
	}

	/**
	 * �����ͼ����
	 */
	private CategorySeries getDataSet() {
		// ��������
		CategorySeries pieSeries = new CategorySeries("�ֻ������߱���");
		pieSeries.add("Android", 28);
		pieSeries.add("IOS", 46);
		pieSeries.add("����", 26);
		return pieSeries;
	}

	/**
	 * ��ȡһ����ͼ��Ⱦ��
	 */
	private DefaultRenderer getPieRenderer() {
		// ����һ����Ⱦ��
		DefaultRenderer renderer = new DefaultRenderer();
		// ������Ⱦ����ʾ���Ű�ť
		renderer.setZoomButtonsVisible(true);
		// ������Ⱦ������Ŵ���С
		renderer.setZoomEnabled(true);
		// ������Ⱦ���������ִ�С
		renderer.setChartTitleTextSize(20);
		// ����Ⱦ������3����ɫ
		SimpleSeriesRenderer yellowRenderer = new SimpleSeriesRenderer();
		yellowRenderer.setColor(Color.YELLOW);
		SimpleSeriesRenderer blueRenderer = new SimpleSeriesRenderer();
		blueRenderer.setColor(Color.BLUE);
		SimpleSeriesRenderer redRenderer = new SimpleSeriesRenderer();
		redRenderer.setColor(Color.RED);
		renderer.addSeriesRenderer(yellowRenderer);
		renderer.addSeriesRenderer(blueRenderer);
		renderer.addSeriesRenderer(redRenderer);
		// ���ñ�ͼ���������С�ͱ�ͼ��ǩ�����С
		renderer.setLabelsTextSize(15);
		renderer.setLegendTextSize(15);
		// �������
		renderer.setAntialiasing(true);
		// ���ñ�����ɫ
		renderer.setApplyBackgroundColor(true);
		renderer.setBackgroundColor(Color.BLACK);
		// ����������ɫ
		renderer.setAxesColor(Color.WHITE);

		return renderer;
	}
}

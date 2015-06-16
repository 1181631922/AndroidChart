package com.manyou.androidchart.chart;

import org.achartengine.ChartFactory;
import org.achartengine.chart.BarChart.Type;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint.Align;

/**
 * ��״ͼ
 * 
 * @Package com.manyou.androidchart
 * @FileName BarChart.java
 * @Author APKBUS-manyou
 * @Date 2013-1-30
 */
public class BarChart implements AChartAbstract {

	public Intent getIntent(Context context) {
		return ChartFactory.getBarChartIntent(context, getDataSet(), getRenderer(), Type.STACKED, "2012�깫˾����");
	}

	/**
	 * ��������
	 * @return
	 */
	public XYMultipleSeriesDataset getDataSet() {
		// ��������
		XYMultipleSeriesDataset barDataset = new XYMultipleSeriesDataset();
		CategorySeries barSeries = new CategorySeries("2012��");
		barSeries.add(43.1);
		barSeries.add(27.2);
		barSeries.add(55.3);
		barSeries.add(43.4);
		barSeries.add(68.5);
		barSeries.add(12.6);
		barSeries.add(28.7);
		barSeries.add(33.8);
		barSeries.add(99.9);
		barSeries.add(128.0);
		barSeries.add(56.1);
		barSeries.add(77.2);
		barDataset.addSeries(barSeries.toXYSeries());
		return barDataset;
	}

	/**
	 * ������Ⱦ��
	 * @return
	 */
	public XYMultipleSeriesRenderer getRenderer() {
		XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
		renderer.setChartTitle("2012�깫˾����");
		renderer.setXTitle("�·�");
		renderer.setYTitle("����(��Ԫ)");
		renderer.setAxesColor(Color.WHITE);
		renderer.setLabelsColor(Color.WHITE);
		// ����X�����С���ֺ�������֣��������ǵ������Ǵ�1��ʼ����������Ϊ0.5�Ϳ�����1֮ǰ�ó�һ����
		// ����Ȥ��ͯЬ����ɾ���������д��뿴һ��Ч��
		renderer.setXAxisMin(0.5);
		renderer.setXAxisMax(12.5);
		// ����Y�����С���ֺ��������
		renderer.setYAxisMin(10);
		renderer.setYAxisMax(150);
		// ������Ⱦ����ʾ���Ű�ť
		renderer.setZoomButtonsVisible(true);
		// ������Ⱦ������Ŵ���С
		renderer.setZoomEnabled(true);
		// �������
		renderer.setAntialiasing(true);
		// ���ñ�����ɫ
		renderer.setApplyBackgroundColor(true);
		renderer.setBackgroundColor(Color.GRAY);
		// ����ÿ�����ӵ���ɫ
		SimpleSeriesRenderer sr = new SimpleSeriesRenderer();
		sr.setColor(Color.YELLOW);
		renderer.addSeriesRenderer(sr);
		// ����ÿ���������Ƿ���ʾ��ֵ
		renderer.getSeriesRendererAt(0).setDisplayChartValues(true);
		// X��Ľ���������
		renderer.setXLabels(12);
		// Y��Ľ���������
		renderer.setYLabels(5);
		// �̶�����X����������������
		renderer.setXLabelsAlign(Align.LEFT);
		// Y����Y���������������
		renderer.setYLabelsAlign(Align.LEFT);
		// ���������϶�,�������������϶�.
		renderer.setPanEnabled(true, false);
		// ���Ӽ���
		renderer.setBarSpacing(0.1f);
		return renderer;
	}

}

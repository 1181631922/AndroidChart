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
 * 柱状图
 * 
 * @Package com.manyou.androidchart
 * @FileName BarChart.java
 * @Author APKBUS-manyou
 * @Date 2013-1-30
 */
public class BarChart implements AChartAbstract {

	public Intent getIntent(Context context) {
		return ChartFactory.getBarChartIntent(context, getDataSet(), getRenderer(), Type.STACKED, "2012年公司利润");
	}

	/**
	 * 构造数据
	 * @return
	 */
	public XYMultipleSeriesDataset getDataSet() {
		// 构造数据
		XYMultipleSeriesDataset barDataset = new XYMultipleSeriesDataset();
		CategorySeries barSeries = new CategorySeries("2012年");
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
	 * 构造渲染器
	 * @return
	 */
	public XYMultipleSeriesRenderer getRenderer() {
		XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
		renderer.setChartTitle("2012年公司利润");
		renderer.setXTitle("月份");
		renderer.setYTitle("利润(万元)");
		renderer.setAxesColor(Color.WHITE);
		renderer.setLabelsColor(Color.WHITE);
		// 设置X轴的最小数字和最大数字，由于我们的数据是从1开始，所以设置为0.5就可以在1之前让出一部分
		// 有兴趣的童鞋可以删除下面两行代码看一下效果
		renderer.setXAxisMin(0.5);
		renderer.setXAxisMax(12.5);
		// 设置Y轴的最小数字和最大数字
		renderer.setYAxisMin(10);
		renderer.setYAxisMax(150);
		// 设置渲染器显示缩放按钮
		renderer.setZoomButtonsVisible(true);
		// 设置渲染器允许放大缩小
		renderer.setZoomEnabled(true);
		// 消除锯齿
		renderer.setAntialiasing(true);
		// 设置背景颜色
		renderer.setApplyBackgroundColor(true);
		renderer.setBackgroundColor(Color.GRAY);
		// 设置每条柱子的颜色
		SimpleSeriesRenderer sr = new SimpleSeriesRenderer();
		sr.setColor(Color.YELLOW);
		renderer.addSeriesRenderer(sr);
		// 设置每个柱子上是否显示数值
		renderer.getSeriesRendererAt(0).setDisplayChartValues(true);
		// X轴的近似坐标数
		renderer.setXLabels(12);
		// Y轴的近似坐标数
		renderer.setYLabels(5);
		// 刻度线与X轴坐标文字左侧对齐
		renderer.setXLabelsAlign(Align.LEFT);
		// Y轴与Y轴坐标文字左对齐
		renderer.setYLabelsAlign(Align.LEFT);
		// 允许左右拖动,但不允许上下拖动.
		renderer.setPanEnabled(true, false);
		// 柱子间宽度
		renderer.setBarSpacing(0.1f);
		return renderer;
	}

}

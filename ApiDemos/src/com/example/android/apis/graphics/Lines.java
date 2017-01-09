package com.example.android.apis.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Lines extends GraphicsActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new SampleView(this));
	}

	private static class SampleView extends View {

		private Paint mPaint;

		public SampleView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
			mPaint = new Paint();
			mPaint.setAntiAlias(true);// 去掉锯齿
			mPaint.setColor(Color.RED);// 画笔颜色
			mPaint.setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗

		}

		@Override
		protected void onDraw(Canvas canvas) {
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			canvas.drawRGB(255, 255, 255);// 设置画布颜色两种方法之一
			// canvas.drawColor(Color.WHITE);//设置画布颜色两种方法之一

			// 起始点在坐标原点
			// canvas.drawLine(0, 0, 200, 200, mPaint);
			// canvas.drawLine(800, 200, 400, 600, mPaint);

			float[] pts = { 250, 100, 300, 50, 500, 300, 200, 300, 500, 700 };
			canvas.drawLines(pts, 2, 4, mPaint);
		}

	}

}

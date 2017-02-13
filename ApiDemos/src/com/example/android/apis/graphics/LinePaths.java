package com.example.android.apis.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.view.View;

public class LinePaths extends GraphicsActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new SampleView(this));

	}

	private static class SampleView extends View {

		private Paint paint;
		private Path path;

		public SampleView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
			paint = new Paint();
			paint.setAntiAlias(true);// 去掉锯齿
			paint.setColor(Color.RED);// 画笔颜色
			paint.setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			paint.setStyle(Style.STROKE);
			path = new Path();

		}

		@Override
		protected void onDraw(Canvas canvas) {
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			canvas.drawRGB(255, 255, 255);// 设置画布颜色两种方法之一
			// canvas.drawColor(Color.WHITE);//设置画布颜色两种方法之一
			path.moveTo(100, 100);
			path.lineTo(600, 100);
			path.lineTo(600, 400);
			path.close();
			canvas.drawPath(path, paint);
		}

	}
}

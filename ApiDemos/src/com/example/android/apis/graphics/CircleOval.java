package com.example.android.apis.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class CircleOval extends GraphicsActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new SampleView(this));
	}

	private static class SampleView extends View {

		private Paint mPaint;
		private RectF fRect;

		public SampleView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
			mPaint = new Paint();
			mPaint.setAntiAlias(true);// 去掉锯齿
			mPaint.setColor(Color.RED);// 画笔颜色
			mPaint.setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			
			mPaint.setStyle(Style.STROKE);//画笔样式，STROKE为描边，FILL为填充内部，FILL_AND_STROKE为填充内部+描边

			// 创建矩形，左上角坐标是(200,200)，右下角坐标是(400,500)，坐标值都是整形
			fRect = new RectF(500f, 140f, 1000f, 420f);

		}

		@Override
		protected void onDraw(Canvas canvas) {
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			canvas.drawRGB(255, 255, 255);// 设置画布颜色两种方法之一
			// canvas.drawColor(Color.WHITE);//设置画布颜色两种方法之一

			// 画圆形
			mPaint.setColor(Color.RED);
			canvas.drawCircle(260, 290, 160, mPaint);
			

			//先画矩形，椭圆内切于该矩形
			mPaint.setColor(Color.RED);
			canvas.drawRect(fRect, mPaint);
			// 根据矩形画椭圆
			mPaint.setColor(Color.BLUE);
			canvas.drawOval(fRect, mPaint);

			invalidate();
		}

	}
}

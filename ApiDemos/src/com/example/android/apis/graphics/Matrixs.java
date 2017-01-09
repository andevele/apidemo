package com.example.android.apis.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class Matrixs extends GraphicsActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new SampleView(this));
	}

	private static class SampleView extends View {

		private Paint mPaint;
		private Rect rect;
		private RectF fRect;
		private RectF roundRect;

		public SampleView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
			mPaint = new Paint();
			mPaint.setAntiAlias(true);// 去掉锯齿
			mPaint.setColor(Color.RED);// 画笔颜色
			mPaint.setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			
			// 创建矩形，左上角坐标是(200,200)，右下角坐标是(400,500)，坐标值都是整形
			rect = new Rect(100,100,300,400);
			
			// 创建float矩形，坐标值都是浮点型
			fRect = new RectF(568.6f, 545.9f, 814.5f, 814.5f);
			
			roundRect = new RectF(621.6f, 116.9f, 978.5f, 458.5f);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			canvas.drawRGB(255, 255, 255);// 设置画布颜色两种方法之一
			// canvas.drawColor(Color.WHITE);//设置画布颜色两种方法之一

			//根据Rect对象画矩形
			mPaint.setColor(Color.RED);
			canvas.drawRect(rect, mPaint);
			
			//根据坐标值画矩形
			mPaint.setColor(Color.BLUE);
			canvas.drawRect(350, 350, 500, 500, mPaint);
			
			//根据RectF对象画矩形，RectF对象的坐标都是浮点型
			mPaint.setColor(Color.CYAN);
			canvas.drawRect(fRect, mPaint);
			
			//根据RectF对象画圆角矩形，RectF对象的坐标都是浮点型
			//第二个参数是圆角X轴半径，第三个参数是圆角y周半径
			mPaint.setColor(Color.GREEN);
			canvas.drawRoundRect(roundRect, 12, 12, mPaint);
		}

	}
}

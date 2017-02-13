package com.example.android.apis.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.view.View;

public class MatrixPaths extends GraphicsActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new SampleView(this));

	}

	private static class SampleView extends View {

		private Paint paint[];
		private RectF rect1;
		private RectF rect2;
		private RectF rect3;
		private RectF rect4;
		private Path clockWisePath1;
		private Path clockWisePath2;
		public Path clockWisePath3;
		private Path antiClockWisePath1;
		private Path antiClockWisePath2;
		private RectF rect5;

		public SampleView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
			paint = new Paint[6];

			paint[0] = new Paint();
			paint[0].setAntiAlias(true);// 去掉锯齿
			paint[0].setColor(Color.RED);// 画笔颜色
			paint[0].setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			paint[0].setStyle(Style.STROKE);

			paint[1] = new Paint();
			paint[1].setAntiAlias(true);// 去掉锯齿
			paint[1].setColor(Color.BLUE);// 画笔颜色
			paint[1].setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			paint[1].setStyle(Style.STROKE);

			paint[2] = new Paint();
			paint[2].setAntiAlias(true);// 去掉锯齿
			paint[2].setColor(Color.YELLOW);// 画笔颜色
			paint[2].setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			paint[2].setStyle(Style.STROKE);

			paint[3] = new Paint();
			paint[3].setAntiAlias(true);// 去掉锯齿
			paint[3].setColor(Color.BLACK);// 画笔颜色
			paint[3].setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			paint[3].setStyle(Style.STROKE);

			paint[4] = new Paint();
			paint[4].setAntiAlias(true);// 去掉锯齿
			paint[4].setColor(Color.GREEN);// 画笔颜色
			paint[4].setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			paint[4].setStyle(Style.STROKE);
			
			paint[5] = new Paint();
			paint[5].setAntiAlias(true);// 去掉锯齿
			paint[5].setColor(Color.DKGRAY);// 画笔颜色
			paint[5].setStrokeWidth(8);// 画笔宽度，数值越大，线条越粗
			paint[5].setStyle(Style.STROKE);

			clockWisePath1 = new Path();
			clockWisePath2 = new Path();

			antiClockWisePath1 = new Path();
			antiClockWisePath2 = new Path();
			
			clockWisePath3 = new Path();

			rect1 = new RectF(100, 100, 800, 400);
			rect2 = new RectF(100, 500, 800, 800);

			rect3 = new RectF(100, 900, 800, 1200);
			rect4 = new RectF(100, 1300, 800, 1600);
			
			rect5 = new RectF(100, 1700, 800, 2000);

		}

		@Override
		protected void onDraw(Canvas canvas) {
			// TODO Auto-generated method stub
			super.onDraw(canvas);
			canvas.drawRGB(255, 255, 255);// 设置画布颜色两种方法之一
			// canvas.drawColor(Color.WHITE);//设置画布颜色两种方法之一

			// 顺时针矩形路径
			clockWisePath1.addRect(rect1, Path.Direction.CW);
			canvas.drawPath(clockWisePath1, paint[0]);

			// 顺时针矩形路径
			clockWisePath2.addRect(rect2, Path.Direction.CW);
			canvas.drawPath(clockWisePath2, paint[1]);

			// 逆时针矩形路径
			antiClockWisePath1.addRect(rect3, Path.Direction.CCW);
			canvas.drawPath(antiClockWisePath1, paint[2]);

			// 逆时针矩形路径
			antiClockWisePath2.addRect(rect4, Path.Direction.CCW);
			canvas.drawPath(antiClockWisePath2, paint[3]);
			
			// 逆时针矩形路径
			clockWisePath3.addRoundRect(rect5, 20, 20, Path.Direction.CW);
			canvas.drawPath(clockWisePath3, paint[5]);

			String text = "我是一名Android 软件软件工程师 我喜欢Android";
			paint[4].setTextSize(70);

			paint[4].setColor(Color.BLUE);
			canvas.drawTextOnPath(text, clockWisePath1, 0, 0, paint[4]);

			paint[4].setColor(Color.GREEN);
			canvas.drawTextOnPath(text, clockWisePath2, 50, 0, paint[4]);

			paint[4].setColor(Color.BLUE);
			canvas.drawTextOnPath(text, antiClockWisePath1, 0, 0, paint[4]);

			paint[4].setColor(Color.GREEN);
			canvas.drawTextOnPath(text, antiClockWisePath2, 0, -50, paint[4]);

		}

	}
}

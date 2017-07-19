package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v4.graphics.ColorUtils;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class Practice2DrawCircleView extends View {

    Paint paint;

    private static final int RADIUS = 180;

    private ArrayList<Coordinate> coordinates;

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(400, 200));
        coordinates.add(new Coordinate(400, 600));
        coordinates.add(new Coordinate(800, 200));
        coordinates.add(new Coordinate(900, 600));
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        paint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(400, 200, RADIUS, paint);

        paint.setColor(Color.rgb(87, 144, 229));

        canvas.drawCircle(400, 600, RADIUS, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.BLACK);

        canvas.drawCircle(800, 200, RADIUS, paint);

        paint.setStrokeWidth(80);
        canvas.drawCircle(900, 600, RADIUS, paint);
    }

    private class Coordinate {
        int x;
        int y;

        private Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    Paint paint;

    RectF rectF;

    RectF singleF;

    Path path = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectF = new RectF(300, 60, 1000, 760);
        singleF = new RectF(270, 35, 970, 735);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        path.moveTo(280, 80);
        path.rLineTo(180, 0);
        path.rLineTo(45, 45);

        path.moveTo(650, 415);
        path.rLineTo(350, -185);
        path.rLineTo(100, 0);

        path.moveTo(1000, 415);
        path.rLineTo(100, 0);

        path.moveTo(650, 415);
        path.rLineTo(400, 55);
        path.rLineTo(20, 20);
        path.rLineTo(50, 0);

        path.moveTo(650, 415);
        path.rLineTo(310, 310);
        path.rLineTo(100, 0);

        path.moveTo(650, 415);
        path.rLineTo(-310, 310);
        path.rLineTo(-100, 0);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setColor(Color.rgb(147, 157, 163));
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);

        canvas.drawPath(path, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(249, 193, 0));

        canvas.drawArc(rectF, -60, 55, true, paint);

        paint.setColor(Color.rgb(150, 38, 179));

        canvas.drawArc(rectF, -2, 6, true, paint);

        paint.setColor(Color.rgb(158, 158, 158));

        canvas.drawArc(rectF, 7, 6, true, paint);

        paint.setColor(Color.rgb(48, 150, 136));

        canvas.drawArc(rectF, 16, 60, true, paint);

        paint.setColor(Color.rgb(64, 150, 247));

        canvas.drawArc(rectF, 79, 100, true, paint);

        paint.setColor(Color.rgb(234, 65, 45));

        canvas.drawArc(singleF, -180, 120, true, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(36);

        canvas.drawText("Lollipop", 120, 80, paint);

        canvas.drawText("KitKat", 120, 750, paint);

        canvas.drawText("Marshmallow", 1120, 220, paint);

        canvas.drawText("Froyo", 1120, 415, paint);

        canvas.drawText("Ice Cream", 1125, 500, paint);

        canvas.drawText("Jelly Bean", 1100, 750, paint);
    }
}

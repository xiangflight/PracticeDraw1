package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint paint;

    Path path = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        path.moveTo(160, 60);
        path.lineTo(160, 700);
        path.lineTo(1300, 700);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);

        canvas.drawPath(path, paint);

        paint.setTextSize(36);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawText("Froyo", 210, 730, paint);
        canvas.drawText("GB", 370, 730, paint);
        canvas.drawText("IC S", 530, 730, paint);
        canvas.drawText("JB", 690, 730, paint);
        canvas.drawText("KitKat", 850, 730, paint);
        canvas.drawText("L", 1010, 730, paint);
        canvas.drawText("M", 1170, 730, paint);

        paint.setTextSize(60);

        canvas.drawText("直方图", 560, 850, paint);

        paint.setColor(Color.rgb(48, 150, 136));

        canvas.drawRect(190, 695, 310, 700, paint);
        canvas.drawRect(350, 670, 470, 700, paint);
        canvas.drawRect(510, 670, 630, 700, paint);
        canvas.drawRect(670, 430, 790, 700, paint);
        canvas.drawRect(830, 260, 950, 700, paint);
        canvas.drawRect(990, 180, 1110, 700, paint);
        canvas.drawRect(1150, 460, 1270, 700, paint);

    }
}

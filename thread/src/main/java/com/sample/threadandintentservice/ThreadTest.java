package com.sample.threadandintentservice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class ThreadTest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ThreadLearning threadLearning = new ThreadLearning();
        threadLearning.start();
    }
}

class ThreadLearning extends Thread {
    public final int ACTION_DUMP_FILES = 1;
    Handler handler;

    //set name of thread
    public ThreadLearning() {
        super("ThreadLearning");
    }

    @Override
    public void run() {
        super.run();
        createLooper();
    }

    private void createLooper() {
        Looper.prepare();
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                Log.d(TAG, "message = " + msg);
                switch (msg.what) {
                    case ACTION_DUMP_FILES:
                        dumpFiles();
                        break;
                }
            }
        };
        Looper.loop();
    }

    private void dumpFiles() {
        if (Thread.currentThread() != this) {
            Log.e(TAG, "current thread name = " + Thread.currentThread().getName());
            Message message = handler.obtainMessage();
            message.what = ACTION_DUMP_FILES;
            handler.sendMessage(message);
            return;
        }
        Log.d(TAG, "current thread name = " + Thread.currentThread().getName());
    }
}

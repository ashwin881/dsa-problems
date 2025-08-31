package com.example;

import com.example.entity.Holder;
import com.example.entity.NewHolder;

public class Main {
    static NewHolder holder;

    public static void main(String[] args) {
        // Writer thread: repeatedly assigns Holder
        Thread writer = new Thread(() -> {
            while (true) {

                holder = new NewHolder(42);

            }
        });


        Thread reader = new Thread(() -> {
            while (true) {
               
                NewHolder h = holder;
                if (h != null) {
                    h.assertSanity();
                }
            }
        });

        writer.start();
        reader.start();
    }
}

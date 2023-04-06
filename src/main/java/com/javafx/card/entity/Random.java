package com.javafx.card.entity;

import java.util.ArrayDeque;

public class Random {

    //我们存储了一个随机数生成器的堆栈，这些随机数生成器可能是故意或随机播种的。

    //堆栈的顶部是当前用于生成新数字的位置。

    //基本生成器总是在没有种子的情况下创建，并且不能弹出。
    private static ArrayDeque<java.util.Random> generators;
    static {
        resetGenerators();
    }

    public static synchronized void resetGenerators(){
        generators = new ArrayDeque<>();
        generators.push(new java.util.Random());
    }

    @SuppressWarnings("all")
    public static synchronized int Int( int max ) {
        return max > 0 ? generators.peek().nextInt(max) : 0;
    }

}

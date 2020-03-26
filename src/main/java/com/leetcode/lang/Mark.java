package com.leetcode.lang;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Mark {
    /**
     * @return 序号
     */
    int order();

    /**
     * @return 名称
     */
    String name();

    /**
     * @return 描述
     */
    String description();
}

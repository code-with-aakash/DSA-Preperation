package com.dsa.programs.oops;

enum  Enum {
    // here every element is public static final only
    MONDAY(0),TUESDAY(1),WEDNESDAY(2);

    public int value;

    Enum(int value) {
        this.value = value;
    }


}

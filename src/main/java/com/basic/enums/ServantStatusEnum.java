package com.basic.enums;

public enum ServantStatusEnum {

    Is_Servant(1, true),
    Not_Servant(0, false);

    public int key;

    public boolean value;

    ServantStatusEnum (int key, boolean value){
        this.key = key;
        this.value = value;
    }
}

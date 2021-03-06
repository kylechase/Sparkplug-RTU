package com.cirruslink.example.impl;

import com.cirruslink.example.model.TagValue;

/**
 * Created by KyleChase on 6/13/2016.
 */
public class StringValue implements TagValue<String> {
    String value;

    @Override
    public void setValue(String newValue,boolean flag) {
        this.value = newValue;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean updateValue() {
        return true;
    }

    @Override
    public boolean updateValue(String newValue) {
        this.value = newValue;
        return true;
    }
}

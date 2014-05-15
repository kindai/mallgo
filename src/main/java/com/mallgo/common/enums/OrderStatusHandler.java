package com.mallgo.common.enums;

import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

import java.sql.SQLException;

/**
 * Created by kin on 5/15/14.
 */
public class OrderStatusHandler implements TypeHandlerCallback{
    @Override
    public void setParameter(ParameterSetter parameterSetter, Object o) throws SQLException {
        parameterSetter.setLong(o == null?null:((OrderStatus)o).getId());
    }

    @Override
    public Object getResult(ResultGetter resultGetter) throws SQLException {
        return valueOf(String.valueOf(resultGetter.getLong()));
    }

    @Override
    public Object valueOf(String s) {
        return s == null?null: OrderStatus.getById(Long.parseLong(s));
    }
}

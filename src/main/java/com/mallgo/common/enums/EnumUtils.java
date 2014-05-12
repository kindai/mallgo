package com.mallgo.common.enums;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cam-dev
 * Date: 2/25/14
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class EnumUtils {

    public static EnumDomainValue getById(Long id, List list){
        for(int i=0; i<list.size(); i++){
            EnumDomainValue value = (EnumDomainValue) list.get(i);
            if(value.getId().equals(id)){
                return value;
            }
        }
        return null;
    }
}

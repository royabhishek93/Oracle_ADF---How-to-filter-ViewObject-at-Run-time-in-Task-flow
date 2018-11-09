package com.abhishek.view.bean;

import oracle.binding.OperationBinding;
import com.abhishek.view.utils.ADFUtils;

public class PassParameterInExecuteMethod {
    public PassParameterInExecuteMethod() {
    }

    public void filterEmpVO() {
    
        OperationBinding ob = ADFUtils.findOperation("ExecuteWithParams");
        ob.getParamsMap().put("firstNameVar", "D");
        ob.execute();
    }
}

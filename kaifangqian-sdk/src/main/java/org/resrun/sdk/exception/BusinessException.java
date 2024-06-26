package org.resrun.sdk.exception;

import org.resrun.sdk.enums.APIResultEnum;
import org.resrun.sdk.enums.BusinessErrorEnum;

/**
 * @Description: PaasException
 * @Package: org.resrun.exception
 * @ClassName: PaasException
 * @author: FengLai_Gong
 */
public class BusinessException extends RuntimeException{

//    private static final long serialVersionUID = 1L;

    protected final transient APIResultEnum resultEnum ;

    protected final transient BusinessErrorEnum businessErrorEnum ;


    public BusinessException(APIResultEnum resultEnum, BusinessErrorEnum businessErrorEnum){
        this.resultEnum = resultEnum ;
        this.businessErrorEnum = businessErrorEnum;
    }





}
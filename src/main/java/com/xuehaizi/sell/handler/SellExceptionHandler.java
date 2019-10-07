package com.xuehaizi.sell.handler;

import com.xuehaizi.sell.VO.ResultVO;
import com.xuehaizi.sell.config.ProjectUrlConfig;
import com.xuehaizi.sell.exception.ResponseBankException;
import com.xuehaizi.sell.exception.SellException;
import com.xuehaizi.sell.exception.SellerAuthorizeException;
import com.xuehaizi.sell.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException(){
        return new ModelAndView("redirect:".concat(projectUrlConfig.getWechatopenAuthorize()).concat("sell/wechat/qrAuthorize")
                .concat("?returnUrl=").concat(projectUrlConfig.getSell()).concat("/sell/seller/login"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e){

        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = ResponseBankException.class)
    //返回状态码设置
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleResponseBankException(){

    }
}

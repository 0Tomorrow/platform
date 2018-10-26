package com.deli.gateway.util;

import com.deli.common.lang.bo.RespBase;
import com.deli.common.lang.consts.EErrorCode;
import com.deli.common.lang.util.JsonUtil;
import com.netflix.zuul.context.RequestContext;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class ErrorResponse {
  public static void throwException(RequestContext ctx, RespBase respBase) {
    ctx.setSendZuulResponse(false);
    String errorString = JsonUtil.getJsonFromObject(respBase);
    HttpServletResponse response = ctx.getResponse();
    response.setHeader("Content-Type", "application/json;charset=UTF-8");
    PrintWriter printWriter = null;
    try {
      printWriter = response.getWriter();
      printWriter.write(errorString);
    } catch (Exception e){
      e.printStackTrace();
    } finally {
      if (printWriter != null) {
        printWriter.close();
      }
    }
  }
}

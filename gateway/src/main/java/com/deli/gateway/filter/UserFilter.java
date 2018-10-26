package com.deli.gateway.filter;

import com.deli.common.lang.bo.RespBase;
import com.deli.common.lang.consts.EErrorCode;
import com.deli.gateway.util.ErrorResponse;
import com.deli.user.client.UserService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserFilter extends ZuulFilter {

  @Autowired
  UserService userService;

  @Override
  public String filterType() {
    return "pre";
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
//    HttpServletRequest request = getRequest();
//    return !request.getRequestURI().matches("^/user/.*$");
    return true;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request =  ctx.getRequest();
    String authentication = request.getHeader("token");

    if (authentication == null || authentication.equals("")) {
      ErrorResponse.throwException(ctx, new RespBase(EErrorCode.TOKEN_INVALID));
      return null;
    }
    if (!userService.veriToken(authentication)) {
      ErrorResponse.throwException(ctx, new RespBase(EErrorCode.TOKEN_INVALID));
      return null;
    }
    ctx.setSendZuulResponse(true);// 对该请求进行路由
    ctx.setResponseStatusCode(200);
    ctx.set("isSuccess", true);
    return null;
  }
}

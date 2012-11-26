package cn.itcast.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionIntercepter implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Object user = ActionContext.getContext().getSession().get("user");
		if(user!=null){
			return invocation.invoke();
		};
		ActionContext.getContext().put("message", "you haven't pemission");
		
		return "message";
		
	}

}

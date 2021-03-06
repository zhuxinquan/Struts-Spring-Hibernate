package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Users;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhuxinquan on 16-12-2.
 */
public class CheckUser extends ActionSupport implements ServletRequestAware {
    Logger logger = Logger.getLogger(UserAction.class);

    private IUserService userService;

    protected HttpServletRequest servletRequest = null;

    private String userName;

    private String password;

    private String email;

    private Users user;

    public Logger getLogger() {
        return logger;
    }

    public String checkUser() throws Exception {
        String userName = servletRequest.getParameter("userName");
        boolean isNameValid = userService.isNameValid(userName);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("text/html");
        response.getWriter().write("{\"isNameValid\":" + isNameValid + "}");
        return null;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setServletRequest(HttpServletRequest httpServletRequest) {

    }
}

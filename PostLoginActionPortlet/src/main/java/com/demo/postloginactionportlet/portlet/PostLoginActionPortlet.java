package com.demo.postloginactionportlet.portlet;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

@Component(
  immediate = true, property = {"key=login.events.post"},
  service = LifecycleAction.class
 )
public class PostLoginActionPortlet implements LifecycleAction {
 public static final Log LOGGER = LogFactoryUtil.getLog(PostLoginActionPortlet.class);
 @Override
 public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
  LOGGER.info("Redirecting to internal-intranet.....");
  HttpSession session = lifecycleEvent.getRequest().getSession();
  session.setAttribute("LAST_PATH", new LastPath(StringPool.BLANK, "/group/internal-intranet/welcome"));
  LOGGER.info("Redirecting to internal-intranet.....");
  //HttpServletRequest request=lifecycleEvent.getRequest();
//  try{
//	
////	  User user=PortalUtil.getUser(request);
////	  LOGGER.info("User is:"+user.getFullName());
////	  LOGGER.info("User Role is:"+user.getRoles());
////	  //Both are same
////	  //LOGGER.info("User Role"+RoleLocalServiceUtil.getUserRoles(user.getUserId()));
////	  LOGGER.info("Roles is:"+Arrays.toString(PortalUtil.getSystemRoles()));
////	  LOGGER.info("Roles is:"+Arrays.toString(PortalUtil.getSystemSiteRoles()));
////	  
////	  for(Role role:user.getRoles()){
////		  LOGGER.info("Roles name:"+role.getName());
////	  }
////			 
////	  
//  }catch (PortalException e) {
//	// TODO: handle exception
//}
        
 }
}
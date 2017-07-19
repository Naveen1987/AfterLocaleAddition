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
  immediate = true, property = {"key=logout.events.post"},
  service = LifecycleAction.class
 )
public class PostLogoutActionPortlet implements LifecycleAction {
 public static final Log LOGGER = LogFactoryUtil.getLog(PostLogoutActionPortlet.class);
 @Override
 public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
  LOGGER.info("Redirecting to regione-lombardia.....");
  HttpSession session = lifecycleEvent.getRequest().getSession();
  session.setAttribute("LAST_PATH", new LastPath(StringPool.BLANK, "/"));
  LOGGER.info("Redirecting to regione-lombardia.....");        
 }
}
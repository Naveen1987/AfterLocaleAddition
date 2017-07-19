package Language.wrapper;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.language.UTF8Control;
@Component(
		
		property = {
				//For US
		//"language.id=en_US"
				//FOr ITelian
	     "language.id=it_IT"
				//for Default
		},
		service = ResourceBundle.class
	)

public class MyProperties extends ResourceBundle {

	private final ResourceBundle resource=ResourceBundle.getBundle("content.Language", UTF8Control.INSTANCE);
	@Override
	protected Object handleGetObject(String key) {
		// TODO Auto-generated method stub
		return resource.getObject(key);
	}

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return resource.getKeys();
	}

}

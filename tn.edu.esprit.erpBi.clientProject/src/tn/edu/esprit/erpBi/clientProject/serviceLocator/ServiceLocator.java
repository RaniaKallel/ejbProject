package tn.edu.esprit.erpBi.clientProject.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {
	private static ServiceLocator instanceOf;
	private static Context context;
	private static Map<String, Object> cache;

	private ServiceLocator() {
		cache = new HashMap<String, Object>();

		try {
			context = new InitialContext();

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ServiceLocator getInstanceOf() {
		if (instanceOf == null) {
			instanceOf = new ServiceLocator();
		}
		return instanceOf;
	}

	public static Object getProxy(String jndiName) {
		Object proxy = null;
		proxy = cache.get(jndiName);

		if (proxy == null) {

			try {
				proxy = context.lookup(jndiName);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		cache.put(jndiName, proxy);

		return proxy;
	}

}

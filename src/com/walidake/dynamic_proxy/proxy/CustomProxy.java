package com.walidake.dynamic_proxy.proxy;

import com.walidake.dynamic_proxy.proxy.Marry;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class CustomProxy extends Proxy implements Marry {
	
	private static final long serialVersionUID = 8706027847595467111L;
	
	private static Method m1;
	private static Method m2;
	private static Method m0;
	private static Method m3;

	public CustomProxy(InvocationHandler paramInvocationHandler) {
		super(paramInvocationHandler);
	}

	public final boolean equals(Object paramObject) {
		try {
			return ((Boolean) this.h.invoke(this, m1,
					new Object[] { paramObject })).booleanValue();
		} catch (RuntimeException localRuntimeException) {
			throw localRuntimeException;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final String toString() {
		try {
			return ((String) this.h.invoke(this, m2, null));
		} catch (RuntimeException localRuntimeException) {
			throw localRuntimeException;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final int hashCode() {
		try {
			return ((Integer) this.h.invoke(this, m0, null)).intValue();
		} catch (RuntimeException localRuntimeException) {
			throw localRuntimeException;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final void marry() {
		try {
			this.h.invoke(this, m3, null);
			return;
		} catch (RuntimeException localRuntimeException) {
			throw localRuntimeException;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	static {
		try {
			m1 = Class.forName("java.lang.Object").getMethod("equals",
					new Class[] { Class.forName("java.lang.Object") });
			m2 = Class.forName("java.lang.Object").getMethod("toString",
					new Class[0]);
			m0 = Class.forName("java.lang.Object").getMethod("hashCode",
					new Class[0]);
			m3 = Class.forName("com.walidake.dynamic_proxy.proxy.Marry")
					.getMethod("marry", new Class[0]);
		} catch (NoSuchMethodException localNoSuchMethodException) {
			throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
		} catch (ClassNotFoundException localClassNotFoundException) {
			throw new NoClassDefFoundError(
					localClassNotFoundException.getMessage());
		}
	}
}

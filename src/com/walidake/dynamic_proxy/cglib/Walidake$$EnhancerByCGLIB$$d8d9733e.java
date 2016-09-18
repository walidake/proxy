package com.walidake.dynamic_proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Factory;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 此处是反编译后的文件
 * 
 * 会有报错是正常现象
 * 
 * @author walidake
 *
 */
public class Walidake$$EnhancerByCGLIB$$d8d9733e extends Walidake implements
		Factory {
	private boolean CGLIB$BOUND;
	public static Object CGLIB$FACTORY_DATA;
	private static final ThreadLocal CGLIB$THREAD_CALLBACKS;
	private static final Callback[] CGLIB$STATIC_CALLBACKS;
	private MethodInterceptor CGLIB$CALLBACK_0;
	private static Object CGLIB$CALLBACK_FILTER;
	private static final Method CGLIB$marry$0$Method;
	private static final MethodProxy CGLIB$marry$0$Proxy;
	private static final Object[] CGLIB$emptyArgs;
	private static final Method CGLIB$equals$1$Method;
	private static final MethodProxy CGLIB$equals$1$Proxy;
	private static final Method CGLIB$toString$2$Method;
	private static final MethodProxy CGLIB$toString$2$Proxy;
	private static final Method CGLIB$hashCode$3$Method;
	private static final MethodProxy CGLIB$hashCode$3$Proxy;
	private static final Method CGLIB$clone$4$Method;
	private static final MethodProxy CGLIB$clone$4$Proxy;

	static void CGLIB$STATICHOOK2() {
    CGLIB$THREAD_CALLBACKS = new ThreadLocal();
    CGLIB$emptyArgs = new Object[0];
    Class localClass1 = Class.forName("com.walidake.dynamic_proxy.cglib.Walidake$$EnhancerByCGLIB$$d8d9733e");
    Class localClass2;
    Method[] tmp83_80 = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (localClass2 = Class.forName("java.lang.Object")).getDeclaredMethods());
    CGLIB$equals$1$Method = tmp83_80[0];
    CGLIB$equals$1$Proxy = MethodProxy.create(localClass2, localClass1, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$1");
    Method[] tmp103_83 = tmp83_80;
    CGLIB$toString$2$Method = tmp103_83[1];
    CGLIB$toString$2$Proxy = MethodProxy.create(localClass2, localClass1, "()Ljava/lang/String;", "toString", "CGLIB$toString$2");
    Method[] tmp123_103 = tmp103_83;
    CGLIB$hashCode$3$Method = tmp123_103[2];
    CGLIB$hashCode$3$Proxy = MethodProxy.create(localClass2, localClass1, "()I", "hashCode", "CGLIB$hashCode$3");
    Method[] tmp143_123 = tmp123_103;
    CGLIB$clone$4$Method = tmp143_123[3];
    CGLIB$clone$4$Proxy = MethodProxy.create(localClass2, localClass1, "()Ljava/lang/Object;", "clone", "CGLIB$clone$4");
    tmp143_123;
    Method[] tmp191_188 = ReflectUtils.findMethods(new String[] { "marry", "()V" }, (localClass2 = Class.forName("com.walidake.dynamic_proxy.cglib.Walidake")).getDeclaredMethods());
    CGLIB$marry$0$Method = tmp191_188[0];
    CGLIB$marry$0$Proxy = MethodProxy.create(localClass2, localClass1, "()V", "marry", "CGLIB$marry$0");
    tmp191_188;
    return;
  }

	final void CGLIB$marry$0() {
		super.marry();
	}

	public final void marry()
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    if (this.CGLIB$CALLBACK_0 != null)
      return;
    super.marry();
  }

	final boolean CGLIB$equals$1(Object paramObject) {
		return super.equals(paramObject);
	}

	public final boolean equals(Object paramObject)
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
    {
      Object tmp41_36 = tmp17_14.intercept(this, CGLIB$equals$1$Method, new Object[] { paramObject }, CGLIB$equals$1$Proxy);
      tmp41_36;
      return tmp41_36 == null ? false : ((Boolean)tmp41_36).booleanValue();
    }
    return super.equals(paramObject);
  }

	final String CGLIB$toString$2() {
		return super.toString();
	}

	public final String toString() {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null) {
      tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
      return (String)tmp17_14.intercept(this, CGLIB$toString$2$Method, CGLIB$emptyArgs, CGLIB$toString$2$Proxy);
    return super.toString();
  }

	final int CGLIB$hashCode$3() {
		return super.hashCode();
	}

	public final int hashCode() {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null) {
      tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
    {
      Object tmp36_31 = tmp17_14.intercept(this, CGLIB$hashCode$3$Method, CGLIB$emptyArgs, CGLIB$hashCode$3$Proxy);
      tmp36_31;
      return tmp36_31 == null ? 0 : ((Number)tmp36_31).intValue();
    }
    return super.hashCode();
  }

	final Object CGLIB$clone$4() throws CloneNotSupportedException {
		return super.clone();
	}

	protected final Object clone()
    throws CloneNotSupportedException
  {
    MethodInterceptor tmp4_1 = this.CGLIB$CALLBACK_0;
    if (tmp4_1 == null)
    {
      tmp4_1;
      CGLIB$BIND_CALLBACKS(this);
    }
    MethodInterceptor tmp17_14 = this.CGLIB$CALLBACK_0;
    if (tmp17_14 != null)
      return tmp17_14.intercept(this, CGLIB$clone$4$Method, CGLIB$emptyArgs, CGLIB$clone$4$Proxy);
    return super.clone();
  }

	public static MethodProxy CGLIB$findMethodProxy(Signature paramSignature) {
		String tmp4_1 = paramSignature.toString();
		switch (tmp4_1.hashCode()) {
		case -508378822:
			if (tmp4_1.equals("clone()Ljava/lang/Object;"))
				return CGLIB$clone$4$Proxy;
			break;
		case 253958448:
		case 1826985398:
		case 1913648695:
		case 1984935277:
		}
	}

	public Walidake$$EnhancerByCGLIB$$d8d9733e() {
		CGLIB$BIND_CALLBACKS(this);
	}

	public static void CGLIB$SET_THREAD_CALLBACKS(
			Callback[] paramArrayOfCallback) {
		CGLIB$THREAD_CALLBACKS.set(paramArrayOfCallback);
	}

	public static void CGLIB$SET_STATIC_CALLBACKS(
			Callback[] paramArrayOfCallback) {
		CGLIB$STATIC_CALLBACKS = paramArrayOfCallback;
	}

	private static final void CGLIB$BIND_CALLBACKS(Object paramObject) {

	}

	public Object newInstance(Callback[] paramArrayOfCallback) {
		CGLIB$SET_THREAD_CALLBACKS(paramArrayOfCallback);
		CGLIB$SET_THREAD_CALLBACKS(null);
		return new d8d9733e();
	}

	public Object newInstance(Callback paramCallback) {
		CGLIB$SET_THREAD_CALLBACKS(new Callback[] { paramCallback });
		CGLIB$SET_THREAD_CALLBACKS(null);
		return new d8d9733e();
	}

	public Object newInstance(Class[] paramArrayOfClass, Object[] paramArrayOfObject, Callback[] paramArrayOfCallback)
  {
    CGLIB$SET_THREAD_CALLBACKS(paramArrayOfCallback);
    Class[] tmp9_8 = paramArrayOfClass;
    switch (tmp9_8.length)
    {
    case 0:
      tmp9_8;
      break;
    default:
      new d8d9733e();
      throw new IllegalArgumentException("Constructor not found");
    }
    CGLIB$SET_THREAD_CALLBACKS(null);
  }

	public Callback getCallback(int paramInt) {
		CGLIB$BIND_CALLBACKS(this);
		switch (paramInt) {
		case 0:
			break;
		}
		return null;
	}

	public void setCallback(int paramInt, Callback paramCallback) {
		switch (paramInt) {
		case 0:
			this.CGLIB$CALLBACK_0 = ((MethodInterceptor) paramCallback);
			break;
		}
	}

	public Callback[] getCallbacks() {
		CGLIB$BIND_CALLBACKS(this);
		return new Callback[] { this.CGLIB$CALLBACK_0 };
	}

	public void setCallbacks(Callback[] paramArrayOfCallback) {
		this.CGLIB$CALLBACK_0 = ((MethodInterceptor) paramArrayOfCallback[0]);
	}

	static {
		CGLIB$STATICHOOK2();
	}
}
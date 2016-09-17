package com.walidake.dynamic_proxy.cglib;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectUtils {

	public static void printClass(Class<?> clazz) {
		Class<?> supercl = clazz.getSuperclass();// 获得用户输入类的超类
		String modifiers = Modifier.toString(clazz.getModifiers());// 获得修饰符数值后用Modifier类解释出来。
		if (modifiers.length() > 0) {
			System.out.print(modifiers + " ");
		}
		System.out.print("class " + clazz.getSimpleName());
		if (supercl != null)// 如果想排除掉顶级根：&& supercl != Object.class
		{
			System.out.print(" extends " + supercl.getName());
		}
		System.out.print(" {\n");
		printConstructors(clazz);// 获得构造函数
		System.out.println();
		printMethods(clazz);// 获得方法
		System.out.println();
		printFields(clazz);// 获得字段
		System.out.println("}");
	}

	@SuppressWarnings("rawtypes")
	public static void printConstructors(Class<?> cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();// 获得构造函数列表
		for (Constructor c : constructors) {
			String name = cl.getSimpleName();// 获得名字
			System.out.print("  ");
			String modifiers = Modifier.toString(c.getModifiers());// 获得修饰符
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(name + "(");
			Class[] paramTypes = c.getParameterTypes();// 获得参数类型列表
			for (int j = 0; j < paramTypes.length; j++) {
				System.out.print(paramTypes[j].getSimpleName());
				if (j < paramTypes.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(");");
		}
	}

	@SuppressWarnings("rawtypes")
	public static void printMethods(Class<?> cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (Method m : methods) {
			Class retType = m.getReturnType();
			String name = m.getName();
			System.out.print("  ");
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(retType.getName() + " " + name + "(");
			Class[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++) {
				System.out.print(paramTypes[j].getSimpleName());
				if (j < paramTypes.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(");\n");
		}
	}

	public static void printFields(Class<?> cl) {
		Field[] fields = cl.getDeclaredFields();
		for (Field f : fields) {
			Class<?> type = f.getType();
			String name = f.getName();
			System.out.print("  ");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.println(type.getSimpleName() + " " + name + ";");
		}
	}
}

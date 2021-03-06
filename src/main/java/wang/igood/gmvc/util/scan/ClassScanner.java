package wang.igood.gmvc.util.scan;

import java.lang.annotation.Annotation;
import java.util.Set;

/**
 * 
 * simple introduction
 * 
 * <p>
 * 类扫描接口
 * </p>
 * 
 * @see
 * @since 1.0
 */

public interface ClassScanner {
	/**
	 * 获取指定包名中的所有类
	 */
	Set<Class<?>> getClassList(String packageName, String packagePattern);

	/**
	 * 获取指定包名中指定注解的相关类
	 */
	Set<Class<?>> getClassListByAnnotation(String packageName, Class<? extends Annotation> annotationClass);

	/**
	 * 获取指定包名中指定父类或接口的相关类
	 */
	Set<Class<?>> getClassListBySuper(String packageName, Class<?> superClass);
	
	/**
	 * 自定义ClassLoader中获取指定包名中的所有类
	 */
	Set<Class<?>> getClassList(String packageName, String packagePattern, ClassLoader classLoader);

	/**
	 * 自定义ClassLoader中获取指定包名中指定注解的相关类
	 */
	Set<Class<?>> getClassListByAnnotation(String packageName, Class<? extends Annotation> annotationClass, ClassLoader classLoader);

	/**
	 * 自定义ClassLoader中获取指定包名中指定父类或接口的相关类
	 */
	Set<Class<?>> getClassListBySuper(String packageName, Class<?> superClass, ClassLoader classLoader);
}

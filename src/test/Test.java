package test;

import java.lang.reflect.Field;

public abstract class Test {

	public static void main(String[] args) throws Exception, SecurityException {
    Person p = new Person();
    /*
     * 获取Class对象
     */
    Class<Person>classPerson = Person.class;
    /*
     * 通过反射访问任何权限
     */
    Field nameField = classPerson.getDeclaredField("name");
    /*
     * 取消访问权限检查
     */
    nameField.setAccessible(true);
    /*
     * 对私有属性进行操作
     */
    nameField.set(p,"maotao");
    Field ageField = classPerson.getDeclaredField("age");
    ageField.setAccessible(true);
    ageField.set(p, 18);
    System.out.println( p.toString());
    System.out.println(ageField.get(p));
    
	}

}

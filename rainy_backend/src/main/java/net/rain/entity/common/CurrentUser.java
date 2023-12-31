package net.rain.entity.common;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/4 0:47
 */

/**
 * 利用本地线程获取当前的使用用户信息
 */
public class CurrentUser {
    //工厂模式，内部实例化，无需外部实例化，设置为final
    //尚未解决的问题：id和线程ID无法兼容，一个是Integer类型，另一个是Long类型
    private static  final ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Integer id){
        threadLocal.set(Long.valueOf(id));
    }

    //获取当前线程的ID
    public static Integer getCurrentId(){
        return Math.toIntExact(threadLocal.get());
    }
}

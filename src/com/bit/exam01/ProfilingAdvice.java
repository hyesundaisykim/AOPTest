package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	
	public void afterThrowing(JoinPoint joinPoint) {
		String mathodName = joinPoint.getSignature().toShortString();
		System.out.println(mathodName+"�� ������������ �����Ͽ����ϴ�.");
	}
	
	public void afterReturning(JoinPoint joinPoint) {
		String mathodName = joinPoint.getSignature().toShortString();
		System.out.println(mathodName+"�� ����Ϸ���  �� �Դϴ�.");
	}
	
	
	public void after(JoinPoint joinPoint) {
		String mathodName = joinPoint.getSignature().toShortString();
		System.out.println(mathodName+"�� �Ϸ��� �� �Դϴ�.");
	}
	
	
	
	public void before() {
		System.out.println("Ÿ���� �Ǵ� �޼ҵ� �����ϱ� ���Դϴ�.");
	}
	
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println(methodName+" �����ϱ� ���Դϴ�.");
	}
	
	
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName+"����");
		long start = System.currentTimeMillis();
		try {
			re=joinPoint.proceed();
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println(methodName+"����");
		long finish = System.currentTimeMillis();
		System.out.println("�ɸ��ð�:"+(finish-start));
		return re;
	}

}

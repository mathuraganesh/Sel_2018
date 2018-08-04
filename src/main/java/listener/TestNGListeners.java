package listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestNGListeners implements IAnnotationTransformer, IRetryAnalyzer{
int iMaxRetry = 1;
	@Override
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(this.getClass());
		annotation.setInvocationCount(1);
		if(!testMethod.getName().equalsIgnoreCase("createlead"))
		{
			annotation.setEnabled(false);
			
		}
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess() && iMaxRetry < 2)
		{
			iMaxRetry++;
			System.out.println(iMaxRetry);
			return true;
		}
			else
			{
		return false;
			}
	}

}

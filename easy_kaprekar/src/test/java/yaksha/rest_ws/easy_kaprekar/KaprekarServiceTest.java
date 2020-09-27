package yaksha.rest_ws.easy_kaprekar;

import static org.junit.jupiter.api.Assertions.*;
import static yaksha.rest_ws.easy_kaprekar.TestUtils.*;

import org.junit.jupiter.api.Test;

class KaprekarServiceTest {

	@Test
	void testIsKaprekar() throws Exception{
         int x=99;
         int y=98;
         boolean a=new KaprekarService().isKaprekar(x);
         boolean b=new KaprekarService().isKaprekar(y);
		yakshaAssert(currentTest(),(a==true?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(b==false?"true":"false"),businessTestFile);
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

}

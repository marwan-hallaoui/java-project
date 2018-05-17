package mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.nespresso.MyService;

@RunWith(MockitoJUnitRunner.class)
public class MockitoExample {

	@Mock
	MyService test;

	@Before
	public void setUp(){
		Mockito.when(test.testMock(0)).thenReturn("case 00000");
	}


	@Test
	public void test() {
		String result = test.testMock(0);
		verify(test, times(2)).testMock(0);
	}

}
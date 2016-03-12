import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Test
import java.io.PrintWriter
import java.io.StringWriter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.junit.Assert.assertEquals

class SampleServletTest {
	@Test
	fun doGet() {
		val req = mock<HttpServletRequest>()
		val res = mock<HttpServletResponse>()
		val writer = StringWriter()
		whenever(res.writer).thenReturn(PrintWriter(writer))

		SampleServlet().doGet(req, res)

		assertEquals("OK", writer.toString())
	}
}


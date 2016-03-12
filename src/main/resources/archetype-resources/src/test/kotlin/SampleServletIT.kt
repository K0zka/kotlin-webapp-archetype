import org.junit.Test
import java.net.URL
import org.junit.Assert.assertEquals

class SampleServerIT {

	@Test
	fun get() {
		val text = URL("http://localhost:8080/ping").openStream().reader(Charsets.UTF_8).readText()
		assertEquals("OK", text)
	}

}

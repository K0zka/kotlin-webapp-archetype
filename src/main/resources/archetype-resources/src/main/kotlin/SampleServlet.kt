
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/ping")
class SampleServlet : HttpServlet() {
	override public fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
		resp.writer.print("OK")
	}
}


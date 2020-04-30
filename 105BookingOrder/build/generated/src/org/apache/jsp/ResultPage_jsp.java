package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ResultPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;400&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"left_side\"  class=\"col-lg-2\">\n");
      out.write("            <img id=\"logo\" src=\"image/logo.png\" />\n");
      out.write("        </div>\n");
      out.write("        <div id=\"middle_side\" class=\"col-lg-5\">\n");
      out.write("            <div id=\"above_part\">\n");
      out.write("                <p class=\"label_2\">Quý khách có lịch khám</p>\n");
      out.write("                <p class=\"label_3\">Xin quý khách đến trước giờ hẹn ít nhất 10 phút. Số khám của quý khách là:</p>\n");
      out.write("\n");
      out.write("                <div class=\"order_number\">\n");
      out.write("                    <span id=\"order_num\">100</span>\n");
      out.write("                </div>\n");
      out.write("                <hr/>\n");
      out.write("                <label class=\"label_style2\">Khoa:</label><label class=\"content_style2 exam_department\">Nội thần kính</label>\n");
      out.write("                <hr/>\n");
      out.write("                <label class=\"label_style2\">Ngày khám:</label><label class=\"content_style2\">04 tháng 12, 2019</label>\n");
      out.write("                <hr/>\n");
      out.write("                <label class=\"label_style2\">Thời gian:</label><label class=\"content_style2\" id=\"time_id\">15 giờ 00 phút</label>\n");
      out.write("            </div>\n");
      out.write("            <br/>                \n");
      out.write("            <label id=\"announcement_title\">Thông báo<span style=\"color: red;\">*</span></label>\n");
      out.write("            <div id=\"announce_area_2\">\n");
      out.write("                <p>14 giờ 00 phút, 04 tháng 12, 2019</p>\n");
      out.write("                <p>Sắp đến lượt khám của quý khách. Mong quý khách đến bệnh viện đúng giờ.</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"announce_area\">\n");
      out.write("                <div id=\"announce_box\">\n");
      out.write("                    <p>22 giờ 01 phút, 03 tháng 12, 2019</p>\n");
      out.write("                    <p>Quý khách đã được chuyển đến khoa <span class=\"exam_department\">Chấn thương chỉnh hình</span> do Y tá Trịnh A</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"right_side\" class=\"col-lg-5\">\n");
      out.write("            <img id=\"id_map\" src=\"image/bando.png\"/>\n");
      out.write("            <div id=\"zoom_in\">\n");
      out.write("                <img src=\"image/zoomin.png\"/>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"zoom_out\">\n");
      out.write("                <img src=\"image/zoomout.png\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"api_booking\">\n");
      out.write("            <div class=\"app_booking app_zalo\">\n");
      out.write("                <img src=\"image/zalo-1.jpg\"/><label>Zalo</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"app_booking app_viber\">\n");
      out.write("                <img src=\"image/viberimg.png\"/><label>Viber</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"app_booking app_facebook\">\n");
      out.write("                <img src=\"image/facebookimg.png\"/><label>Fb</label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

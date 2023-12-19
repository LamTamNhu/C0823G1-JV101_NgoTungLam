package control;

import model.ChiTieu;
import service.IService;
import service.Service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    IService service = new Service();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "to_add_form":
                List<String> loaiChiTieu = service.getLoaiChiTieu();
                request.setAttribute("loai_chi_tieu",loaiChiTieu);
                request.getRequestDispatcher("/add_new.jsp").forward(request,response);
                break;
            default: displayAll(request,response);
        }
    }

    private void displayAll(HttpServletRequest request, HttpServletResponse response) {
        List<ChiTieu> list = service.getAll();
        request.setAttribute("list",list);
        try {
            request.getRequestDispatcher("/display_all.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                String ten=request.getParameter("ten");
                LocalDate ngayChi= LocalDate.parse(request.getParameter("ngay_chi"));
                int soTienChi= Integer.parseInt(request.getParameter("so_tien"));
                String loaiChi=request.getParameter("loai_chi");
                String moTaThem=request.getParameter("mo_ta_them");
                ChiTieu chiTieu = new ChiTieu(ten,ngayChi,soTienChi,loaiChi,moTaThem);
                service.add(chiTieu);
                break;
        }
    }
}
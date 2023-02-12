import org.example.entity.Meetup;
import org.example.service.impl.MeetupServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/meetups")
public class MeetupServlet extends HttpServlet {

    private MeetupServiceImpl meetupService;

    public void init() {
        meetupService = new MeetupServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            switch (action) {

                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertMeetup(request, response);
                    break;
                case "/edit":
                    showNewForm(request, response);
                    break;
                case "/update":
                    updateMeetup(request, response);
                    break;
                default:
                    viewMeetups(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void viewMeetups(HttpServletRequest request, HttpServletResponse response) throws
            SQLException, ServletException, IOException {
        List<Meetup> listMeetups = meetupService.getAllMeetup();
        request.setAttribute("listMeetups", listMeetups);
        request.getRequestDispatcher("webPart/jsp/list-meetup.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit-meetup.jsp");
        dispatcher.forward(request, response);
    }

    private void insertMeetup(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Meetup newMeetup = new Meetup(id, name);
        meetupService.insertMeetup(newMeetup);
        response.sendRedirect("list");
    }

    private void updateMeetup(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");

        Meetup updateMeetup = new Meetup(id, name);
        meetupService.updateMeetup(updateMeetup);
        response.sendRedirect("list");
    }

    private void deleteMeetup(HttpServletRequest request, HttpServletResponse response) throws SQLException,IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        meetupService.deleteMeetup(id);
        response.sendRedirect("list");
    }
}

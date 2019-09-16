package calculators;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 657306
 */
public class ArithmeticCalculatorServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //TODO: stuff
        request.setAttribute("ans", "--");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //TODO: stuff
        String pressed = request.getParameter("calc");
        int answer = 0;
        
        try
        {
            int num1 = Integer.parseInt(request.getParameter("n1"));
            int num2 = Integer.parseInt(request.getParameter("n2"));
            if (null == pressed)
            {
                
            }
            else
            {
                switch (pressed) {
                    case "-":
                        answer = num1 - num2;
                        break;
                    case "*":
                        answer = num1 * num2;
                        break;
                    case "%":
                        answer = num1 % num2;
                        break;
                    case "+":
                        answer = num1 + num2;
                        break;
                    default:
                        break;
                }
            }
            request.setAttribute("ans", answer);
        }
        catch (NumberFormatException e)
        {
            request.setAttribute("ans", "Please enter 2 integer numbers");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
}

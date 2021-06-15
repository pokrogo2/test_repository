package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;
import dao.BoardDAO;
import dto.BoardDTO;

public class ToBoardCommand implements BoardCommand {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		 if (session.getAttribute("open") != null) {
		      session.removeAttribute("open");
		  }
		 List<BoardDTO> list = BoardDAO.getInstance().selectList();
			request.setAttribute("list", list);

			ModelAndView mav = new ModelAndView("/board/board.jsp", false);  // 포워드 이동
			return mav;

	}

}
